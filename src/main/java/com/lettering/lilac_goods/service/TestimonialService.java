package com.lettering.lilac_goods.service;

import com.lettering.lilac_goods.domain.dao.TestimonialDAO;
import com.lettering.lilac_goods.domain.vo.TestimonialVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestimonialService {
    private final TestimonialDAO testimonialDAO;

    //    게시글 조회
    public TestimonialVO getTestimonial(Long testimonialId){
        return testimonialDAO.find(testimonialId);
    };

    //    게시글 목록
    public List< TestimonialVO> getTestimonialList() {
        return testimonialDAO.findAll();
    };

    //    게시글 추가
    public void writeTestimonial( TestimonialVO  testimonialVO){
        testimonialDAO.save(testimonialVO);
    };

    //    게시글 삭제
    public void removeTestimonial(Long testimonialId){
        testimonialDAO.delete(testimonialId);
    };

    //    게시글 수정
    public void modifyTestimonial( TestimonialVO  testimonialVO){
        testimonialDAO.update(testimonialVO);
    };
}
