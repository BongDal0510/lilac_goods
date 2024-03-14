package com.lettering.lilac_goods.controller.mainPageController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/main/*")
public class MainController {
    @GetMapping("home")
    private String home(){
        return "/main/home/home";
    }

    @GetMapping("about")
    private String aboutUs(){
        return "/main/home/about";
    }

    @GetMapping("contact")
    private String contact(){
        return "/main/home/contact";
    }

    @GetMapping("login")
    private String login(){
        return "/main/home/login";
    }

    @GetMapping("findid")
    private String findId(){
        return "/main/home/findId";
    }

    @GetMapping("findinfo")
    private String findInfo(){
        return "/main/home/findInfo";
    }

    @GetMapping("resetpw")
    private String resetPw(){
        return "/main/home/resetPw";
    }


    @GetMapping("join")
    private String join(){
        return "/main/home/join";
    }

}
