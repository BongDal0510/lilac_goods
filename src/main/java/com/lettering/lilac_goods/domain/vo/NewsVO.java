package com.lettering.lilac_goods.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NewsVO {
    private Long newsId;
    private String newsTitle;
    private String newsWriter;
    private String newsContent;
    private String newsRegisterDate;
    private String newsUpdateDate;
}
