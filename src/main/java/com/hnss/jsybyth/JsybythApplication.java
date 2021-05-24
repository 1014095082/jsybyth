package com.hnss.jsybyth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hnss.jsybyth")
public class JsybythApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsybythApplication.class, args);
    }

}
