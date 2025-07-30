package com.newProject.firstWorking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// if annotations defined before the class or method, runs the respectives.
@RestController//control layer
@RequestMapping("/new")//maps url for entire class, / as homepage
public class demoController {
    @GetMapping("/gets")// gets data only for method
    public String message(){
        return "Hello, this is the first message";
    }
    @GetMapping("/map")
    public String check(){
        return "Another method for understanding";
    }
}
