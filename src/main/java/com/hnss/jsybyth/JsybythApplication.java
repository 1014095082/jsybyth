package com.hnss.jsybyth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@MapperScan("com.hnss.jsybyth.mapper")
public class JsybythApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsybythApplication.class, args);
    }

}
