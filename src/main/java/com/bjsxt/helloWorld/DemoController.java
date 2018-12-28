package com.bjsxt.helloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DemoController {

    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public Map<String,Object> demo(){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("msg","hello world");
        return  map;
    }
}
