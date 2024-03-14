package com.lettering.lilac_goods.mapper;

import com.lettering.lilac_goods.domain.vo.TestimonialVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface TestimonialMapper {
    //    게시글 조회
    public TestimonialVO select(Long testimonialId);

    //    게시글 목록
    public List< TestimonialVO> selectAll();

    //    게시글 추가
    public void insert( TestimonialVO  testimonialVO);

    //    게시글 삭제
    public void delete(Long testimonialId);

    //    게시글 수정
    public void update( TestimonialVO  testimonialVO);
}
