package com.linda.demo.controller;

import com.linda.demo.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting", method= {RequestMethod.GET,RequestMethod.POST})
    //@ResponseBody
    public Greeting greeting(@RequestParam(value = "name") String name){
        return new Greeting(counter.incrementAndGet(),String.format(template, name));
    }




}
