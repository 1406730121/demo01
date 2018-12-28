package com.bjsxt.servlet.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SenondServletApp {

    public static void main(String [] args){

        SpringApplication.run(SenondServletApp.class,args);
    }

    @Bean
    public ServletRegistrationBean getSecondServletBean(){

        ServletRegistrationBean secondBean=new ServletRegistrationBean(new SecondServlet());
        secondBean.addUrlMappings("/second");
        return secondBean;
    }
}
