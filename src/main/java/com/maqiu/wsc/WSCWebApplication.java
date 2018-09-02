package com.maqiu.wsc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages = "com.maqiu.wsc")
@MapperScan("com.maqiu.wsc.dal")
public class WSCWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WSCWebApplication.class);
    }
}
