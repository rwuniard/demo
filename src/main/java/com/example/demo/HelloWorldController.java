package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hello")
public class HelloWorldController {

    @RequestMapping(value="world", method= RequestMethod.GET)
    public String helloWorld() {
        return "Hello World!";
    }

    @RequestMapping(value="print/{myString}", method=RequestMethod.GET)
    public String print(@PathVariable String myString) {
        return "hello " + myString;
    }

    @RequestMapping(value="test", method=RequestMethod.GET)
    public String test() {
        return "This is test branch";
    }
}
