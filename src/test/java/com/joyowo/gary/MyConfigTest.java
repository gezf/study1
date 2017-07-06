package com.joyowo.gary;

import com.joyowo.gary.config.MyConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by jishu0425 on 2017/4/25.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyConfigTest {

    @Autowired
    private MyConfig myConfig;

    @Test
    public void testConfig(){
        System.out.println("webName: "+myConfig.getName()+
                ", webVersion: "+ myConfig.getVersion()+", webAuthor: "+myConfig.getAuthor());
    }
}
