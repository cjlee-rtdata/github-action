package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.PostConstruct;

@SpringBootApplication
public class App {

    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }

    @PostConstruct
    public void init()
    {
        Logger log = LoggerFactory.getLogger(App.class);
        log.info("Java app startedsss");
        log.info("Tag 4.0");
        log.info("Tag 4.1");
        log.info("Tag upload");
        log.info("Tag upload2");
        log.info("Tag upload3");
        log.info("Tag upload4");
    }

    public String getStatus() {
        return "OK";
    }
}
