package com.lettering.lilac_goods.controller.mainPageController;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/store/*")
public class OrderController {

    //목록
    @GetMapping("list")
    public String productsList(Model model){
        return "/main/store/storeList";
    }

    //상품
    @GetMapping("products")
    public String products(Long testimonialId, Model model){
        return "/main/store/products";
    }

    //상품 구매
    @GetMapping("buy")
    public String buyProducts(Long testimonialId, Model model){
        return "/main/store/buyProducts";
    }

}
