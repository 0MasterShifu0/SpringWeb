package com.mon.project.model.welcomleDemo.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {

    /**
     * hello.html页面
     * @return
     */
    @RequestMapping("welcomeIndex")
    public String welcomeIndex(Model model){
        return "hello";
    }

}
