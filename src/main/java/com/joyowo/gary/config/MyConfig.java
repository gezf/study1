package com.joyowo.gary.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by jishu0425 on 2017/4/25.
 */
@PropertySource("classpath:config/my-web.properties")
@ConfigurationProperties(prefix = "web")
@Component
public class MyConfig {
    private String name;
    private String version;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public String getAuthor() {
        return author;
    }
}
