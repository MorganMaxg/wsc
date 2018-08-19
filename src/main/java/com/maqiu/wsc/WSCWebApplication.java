package com.maqiu.wsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class WSCWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WSCWebApplication.class);
    }
}
