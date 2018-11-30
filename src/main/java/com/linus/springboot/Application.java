/**
 * Created by Linus on 21-11-2018.
 */
package com.linus.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main (String[] args ){
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
    }
}
