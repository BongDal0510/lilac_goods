package com.lettering.lilac_goods.domain.dao;

import com.lettering.lilac_goods.domain.vo.NewsVO;
import com.lettering.lilac_goods.mapper.NewsMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NewsDAO {
    private final NewsMapper newsMapper;

    //    게시글 조회
    public NewsVO findByNewsId(Long newsId){
        return newsMapper.select(newsId);
    };

    //    게시글 목록
    public List<NewsVO> findAll() {
        return newsMapper.selectAll();
    };

    //    게시글 추가
    public void save(NewsVO newsVO){
        newsMapper.insert(newsVO);
    };

    //    게시글 삭제
    public void delete(Long testimonialId){
        newsMapper.delete(testimonialId);
    };

    //    게시글 수정
    public void setNews(NewsVO newsVO){
        newsMapper.update(newsVO);
    };
}
