package com.bjsxt.listener.first;

import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class FirstListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("进入监听");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
