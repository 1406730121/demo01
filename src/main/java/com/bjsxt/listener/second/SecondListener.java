package com.bjsxt.listener.second;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SecondListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("进入监听2");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
