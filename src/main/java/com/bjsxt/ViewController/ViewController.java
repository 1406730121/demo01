package com.bjsxt.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class ViewController {

    @RequestMapping(value="/jspView")
    public String getJspView(Model model){

        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","19","1"));
        userList.add(new User("李四","19","1"));
        userList.add(new User("张三","19","1"));
        model.addAttribute("userList",userList);

        return "firstJsp";

    }

    @RequestMapping(value="/hello")
    public String showHello(Model model){

        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","19","1"));
        userList.add(new User("李四","19","1"));
        userList.add(new User("张三","19","1"));
        model.addAttribute("userList",userList);

        return "hello";

    }

    @RequestMapping(value="/helloFtl")
    public String showHelloFtl(Model model){

        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","19","1"));
        userList.add(new User("李四","19","1"));
        userList.add(new User("张三","19","1"));
        model.addAttribute("userList",userList);

        return "helloFtl";

    }

    @RequestMapping(value="/helloThy1")
    public String showHelloThy1(Model model){

        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","19","1"));
        userList.add(new User("李四","19","1"));
        userList.add(new User("张三","19","1"));
        model.addAttribute("userList",userList);
        model.addAttribute("msg","ok");
        return "userListThy";
    }

    @RequestMapping(value="/helloThy")
    public ModelAndView showHelloThy(HttpServletRequest request, HttpServletResponse response){
        ModelAndView mv=new ModelAndView();
        mv.setViewName("userListThy");
        mv.addObject("msg","ok");
        List<User> userList=new ArrayList<User>();
        userList.add(new User("张三","19","1"));
        userList.add(new User("李四","22","0"));
        userList.add(new User("张五","19","1"));
        mv.addObject("userList",userList);
        mv.addObject("sex","1");
        mv.addObject("date",new Date());
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("u1",new User("张三","19","1"));
        map.put("u2",new User("李四","22","0"));
        map.put("u3",new User("张五","19","1"));
        mv.addObject("map",map);
        request.setAttribute("request","111");
        HttpSession session=request.getSession();
        session.setAttribute("session","234");
        ServletContext sc=request.getServletContext();
        sc.setAttribute("servletConterxt","567");
        return mv;
    }
}
