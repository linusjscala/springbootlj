package com.linus.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Linus on 21-11-2018.
 */
@RestController
public class WelcomeController {

    @Autowired
    private WelcomeService service;

    @RequestMapping("/Welcome")
    public String Welcome(){
        return service.retrieveWelcomeMessage();
    }
}

@Component
class WelcomeService{
    public String retrieveWelcomeMessage(){
        return "Good Morning 1.0";
    }
}