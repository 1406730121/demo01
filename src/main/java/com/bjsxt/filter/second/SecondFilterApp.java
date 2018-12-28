package com.bjsxt.filter.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@ServletComponentScan
public class SecondFilterApp {

    public static void main(String [] args){

        SpringApplication.run(SecondFilterApp.class,args);
    }

    @Bean
    public FilterRegistrationBean getFilterB(){

        FilterRegistrationBean secondBean=new FilterRegistrationBean(new FilterB());
        secondBean.addUrlPatterns("/secondServletTest");
        secondBean.setOrder(22);
        return secondBean;

    }

    @Bean
    public FilterRegistrationBean getFilterA(){

        FilterRegistrationBean secondBean=new FilterRegistrationBean(new FilterA());
        secondBean.addUrlPatterns("/secondServletTest");
        secondBean.setOrder(21);
        return secondBean;

    }

}
