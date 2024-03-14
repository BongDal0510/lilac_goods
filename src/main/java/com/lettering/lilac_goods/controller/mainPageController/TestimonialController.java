package com.lettering.lilac_goods.controller.mainPageController;

import com.lettering.lilac_goods.domain.vo.TestimonialVO;
import com.lettering.lilac_goods.domain.vo.UserVO;
import com.lettering.lilac_goods.service.TestimonialService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/testimonial/*")
public class TestimonialController {
    private final TestimonialService testimonialSvc;

    //목록
//    @GetMapping("list")
//    public String showList(Model model){
//        model.addAttribute("testimonials", testimonialSvc.getTestimonialList());
//        return "/main/board/testimonial";
//    }

    //
    @GetMapping("list")
    private String showList(){
        return "/main/board/testimonialList";
    }

    //후기 보기
    @GetMapping("read")
    public String getTestimonial(Long testimonialId, Model model){
        model.addAttribute(testimonialSvc.getTestimonial(testimonialId));
        return "/main/board/showTestimonial";
    }

    //후기 작성
    @GetMapping(value = {"write", "modify"})
    public String write(Model model){
//        model.addAttribute(new TestimonialVO());
        return "/main/board/write";
    }

    // 후기 작성완료
    @PostMapping("save")
    public RedirectView write(TestimonialVO testimonialVO, RedirectAttributes redirectAttributes){
        testimonialSvc.writeTestimonial(testimonialVO);
        redirectAttributes.addFlashAttribute("testimonialId", testimonialVO.getTestimonialId());
        return new RedirectView("/testimonial/list");
    }

    //후기 삭제
    @GetMapping("remove")
    public RedirectView remove(Long testimonialId){
        testimonialSvc.removeTestimonial(testimonialId);
        return new RedirectView("/testimonial/list");
    }

    // 내가 작성한 후기 목록
    @PostMapping("modifylist")
    public String modify(UserVO userVO, Model model){
        model.addAttribute("testimonials", testimonialSvc.getTestimonialList());
        return "testimonialList";
    }

    //수정할 후기 선택
    public String modify(Long testimonialId, Model model){
        model.addAttribute(testimonialSvc.getTestimonial(testimonialId));
        return "/main/board/update";
    }

    @PostMapping("modifyend")
    public RedirectView modify(TestimonialVO testimonialVO,  RedirectAttributes redirectAttributes){
        testimonialSvc.modifyTestimonial(testimonialVO);
        redirectAttributes.addFlashAttribute("testimonialId", testimonialVO.getTestimonialId());
        return new RedirectView("/testimonial/list");
    }
}