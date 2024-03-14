package com.lettering.lilac_goods.controller.mainPageController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/event/*")
public class EventController {
    @GetMapping("list")
    private String domain(){
        return "/main/board/eventList";
    }
}
