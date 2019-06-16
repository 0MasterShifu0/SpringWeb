package com.mon.project.model.welcomleDemo.contorller;

import com.mon.project.model.welcomleDemo.vo.Welcome;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/welcome")
public class WelcomeController {

//    /**
//     * hello.html页面
//     * @return
//     */
//    @RequestMapping("welcomeIndex")
//    public String welcomeIndex(Model model){
//        return "hello";
//    }
    /**
     * hello.html页面并输入动态值
     * @return
     */
    @RequestMapping("welcomeIndex")
    public String welcomeIndex(Model model){
        Welcome people = new Welcome();
        people.setId(1L);
        people.setName("Tom");
        people.setAge(20);
        model.addAttribute("singlePerson",people);
        return "hello";
    }

}
