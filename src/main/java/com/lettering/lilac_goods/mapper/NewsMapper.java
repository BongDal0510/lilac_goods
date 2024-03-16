package com.lettering.lilac_goods.mapper;

import com.lettering.lilac_goods.domain.vo.NewsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NewsMapper {
    //    게시글 조회
    public NewsVO select(Long newsId);

    //    게시글 목록
    public List<NewsVO> selectAll();

    //    게시글 추가
    public void insert(NewsVO newVO);

    //    게시글 삭제
    public void delete(Long newsId);

    //    게시글 수정
    public void update(NewsVO newVO);
}
