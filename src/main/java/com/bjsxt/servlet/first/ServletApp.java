package com.bjsxt.servlet.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class ServletApp {

    public static void main(String [] args){

        SpringApplication.run(ServletApp.class,args);
    }
}
