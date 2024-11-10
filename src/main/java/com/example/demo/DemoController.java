package com.example.demo;
import org.springframework.web.bind.annotation.*;


@RestController
public class DemoController {

    @GetMapping("/greet")

    //,defaultValue= "whatever yourname is"
    String greet (@RequestParam(required = false) String name) {
        return "Hello," + "["+name+"]!";
    }



    @PostMapping ("/farewell")

    String farewell (@RequestBody Person person) {
        return "Goodbye,"+"["+person.getName()+"] !";
    }



}