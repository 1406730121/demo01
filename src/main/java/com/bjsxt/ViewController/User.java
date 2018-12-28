package com.bjsxt.ViewController;

import java.io.Serializable;

public class User implements Serializable {

    private String name;
    private String age;
    private String sex;

    public User(){
        super();
    }

    public User(String name,String age,String sex){
        super();
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public String getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
