package com.bjsxt.listener.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SecondListenerApp {

    public static void main(String []args){
        SpringApplication.run(SecondListenerApp.class,args);
    }

    @Bean
    public ServletListenerRegistrationBean getSecondListion(){
        ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean(new SecondListener());
        return bean;
    }
}
