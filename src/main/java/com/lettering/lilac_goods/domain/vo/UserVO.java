package com.lettering.lilac_goods.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserVO {
    long userNo;
    String userId;
    String userPw;
    String userName;
    String userPhoneNumber;
    String userGender;
    String userEmail;
    String userZipcode;
    String userAddress;
    String userAddressDetail;
    String userAddressEtc;
}
