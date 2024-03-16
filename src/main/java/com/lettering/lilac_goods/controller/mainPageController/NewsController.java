package com.lettering.lilac_goods.controller.mainPageController;

import com.lettering.lilac_goods.domain.vo.NewsVO;
import com.lettering.lilac_goods.service.NewsService;
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
@RequestMapping("/news/*")
public class NewsController {
    private final NewsService newsSVC;
    //목록
    @GetMapping("newsList")
    public void showList(Model model) {
        model.addAttribute("newsList", newsSVC.getNewsList());
    }

    //조회
    @GetMapping(value = {"readNews", "modifyNews"})
    public void getNews(Model model, Long newsId){
        model.addAttribute(newsSVC.getNews(newsId));
    }
    //글 작성 시작
    @GetMapping("newsWrite")
    public void write(Model model){
        model.addAttribute(new NewsVO());
    }

    //글 작성 완료
    @PostMapping("write")
    public RedirectView writeNews(NewsVO newsVO, RedirectAttributes redirectAttributes){
        newsSVC.writeNews(newsVO);
        redirectAttributes.addFlashAttribute("newsId", newsVO.getNewsId());
        return new RedirectView("/news/newsList");
    }

    // 글 삭제
    @GetMapping("remove")
    public RedirectView removeNews(Long newsId){
        newsSVC.removeNews(newsId);
        return new RedirectView("/news/newsList");
    }
}
