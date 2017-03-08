package net.toeye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by song on 2017-03-08.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String hello(){
        return "hello";
    }

}
