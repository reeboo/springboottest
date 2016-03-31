package com.spring.boot.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 实现描述: Main
 *
 * @version v1.0.0
 * @author: reeboo
 * @since: 2016-03-31 11:50
 */
@EnableAutoConfiguration
@RestController
public class Application2 {

    @RequestMapping("/")
    String index() {
        return "just a test";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application2.class, args);
    }
}
