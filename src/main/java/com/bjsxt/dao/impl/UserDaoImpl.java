package com.bjsxt.dao.impl;

import com.bjsxt.dao.UserDao;
import com.bjsxt.pojo.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Transactional
    @Override
    public void saveUser(User user) {
        hibernateTemplate.save(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        hibernateTemplate.update(user);
    }

    @Transactional
    @Override
    public void deleteUser(User user) {
        hibernateTemplate.delete(user);
    }

    @Override
    public User selectUserById(String id) {
        return hibernateTemplate.get(User.class,id);
    }

    @Transactional
    @Override
    public List<User> selectUserByName(String userName) {
        //getCurrentSession:当前 session 必须要有事务边界，且只能处理唯一的一个事务。当事务提交或者回滚后 session 自动失效
        //openSession:每次都会打开一个新的 session.加入每次使用多次。则获得的是不同 session 对象。使用完毕后我们需要手动的调用 colse 方法关闭 session
//        Session session=this.hibernateTemplate.getSessionFactory().openSession();每次都会创建新的session
        Session session=this.hibernateTemplate.getSessionFactory().getCurrentSession();//共用一个session
        Query query=session.createQuery("from User where username=:name");
        Query query1=query.setString("name",userName);
        return query1.list();
    }

    @Transactional
    @Override
    public List<User> selectUserBySql(String userName) {
        Session session=this.hibernateTemplate.getSessionFactory().openSession();
        Query query = session.createSQLQuery("select * from user where user_name=?").addEntity(User.class).setString(0,userName);
        List<User> userList=query.list();
        session.close();
        return userList;
    }

    @Transactional
    @Override
    public List<User> selectUserByCriteria(String userName) {
        Session session=this.hibernateTemplate.getSessionFactory().getCurrentSession();
        Criteria c = session.createCriteria(User.class);
        c.add(Restrictions.eq("username",userName));
        return c.list();
    }

}
