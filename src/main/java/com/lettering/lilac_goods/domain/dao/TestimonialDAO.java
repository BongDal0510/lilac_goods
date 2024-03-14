package com.lettering.lilac_goods.domain.dao;

import com.lettering.lilac_goods.domain.vo.TestimonialVO;
import com.lettering.lilac_goods.mapper.TestimonialMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class TestimonialDAO {
    private final TestimonialMapper testimonialMapper;

    //    게시글 조회
    public TestimonialVO find(Long testimonialId){
        return testimonialMapper.select(testimonialId);
    };

    //    게시글 목록
    public List< TestimonialVO> findAll() {
        return testimonialMapper.selectAll();
    };

    //    게시글 추가
    public void save( TestimonialVO  testimonialVO){
        testimonialMapper.insert(testimonialVO);
    };

    //    게시글 삭제
    public void delete(Long testimonialId){
        testimonialMapper.delete(testimonialId);
    };

    //    게시글 수정
    public void update( TestimonialVO  testimonialVO){
        testimonialMapper.update(testimonialVO);
    };
}
