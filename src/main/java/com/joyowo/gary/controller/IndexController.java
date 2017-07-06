package com.joyowo.gary.controller;

import com.joyowo.gary.config.MyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jishu0425 on 2017/4/24.
 */

@RestController
public class IndexController {

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private Environment environment;

    @RequestMapping(value = "/index")
    public String index() {
        return "Hello World!";
    }

    @RequestMapping(value="/config")
    public String config(){
        return "name:"+myConfig.getName()+",version:"+myConfig.getVersion()+",author:"+myConfig.getAuthor();
//        return "wsad";
    }

    @RequestMapping(value="/environment")
    public String Environment(){
        return "msg:"+environment.getProperty("test.msg");
    }
}
