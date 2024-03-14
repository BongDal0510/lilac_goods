package com.lettering.lilac_goods.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class TestimonialVO {

    private Long testimonialId;
    private String testimonialTitle;
    private String testimonialContent;
    private String registerDate;
    private String updateDate;
    private Long userId;

}
