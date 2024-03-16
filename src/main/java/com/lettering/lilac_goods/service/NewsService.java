package com.lettering.lilac_goods.service;

import com.lettering.lilac_goods.domain.dao.NewsDAO;
import com.lettering.lilac_goods.domain.vo.NewsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsService {
    private final NewsDAO NewsDAO;

    //    게시글 조회
    public NewsVO getNews(Long NewsId){
        return NewsDAO.findByNewsId(NewsId);
    };

    //    게시글 목록
    public List< NewsVO> getNewsList() {
        return NewsDAO.findAll();
    };

    //    게시글 추가
    public void writeNews( NewsVO  NewsVO){
        NewsDAO.save(NewsVO);
    };

    //    게시글 삭제
    public void removeNews(Long NewsId){
        NewsDAO.delete(NewsId);
    };

    //    게시글 수정
    public void modifyNews( NewsVO  NewsVO){
        NewsDAO.setNews(NewsVO);
    };
}
