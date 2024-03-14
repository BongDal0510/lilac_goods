package com.lettering.lilac_goods.controller.mainPageController;

import com.lettering.lilac_goods.domain.vo.UserVO;
import com.lettering.lilac_goods.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
public class UserController {
    private final UserService userSVC;

    @PostMapping("login")
    public String login(String userId, String userPw, Model model, HttpServletRequest request) {
        UserVO user = userSVC.login(userId, userPw);
        HttpSession session = request.getSession();
        if(null != user){
            session.setAttribute("user", user);
            return "/main/home/home";
        }else{
            session.setAttribute("user", null);
            model.addAttribute("");
            return null;
        }
    }
}
