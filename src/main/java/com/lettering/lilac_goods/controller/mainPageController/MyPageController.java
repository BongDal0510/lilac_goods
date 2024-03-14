package com.lettering.lilac_goods.controller.mainPageController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/mypage/*")
public class MyPageController {
    @GetMapping(value = {"info", "modify"})
    private String myInfo(){
        return "/main/myPages/myinfo";
    }
    @GetMapping("product")
    private String myProducts(){
        return "/main/myPages/myProductsList";
    }
    @GetMapping("testimonial")
    private String myTestimonial(){
        return "/main/myPages/myTestimonialList";
    }
    @GetMapping("logout")
    private String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.invalidate();
        return "/main/home/home";
    }

}
