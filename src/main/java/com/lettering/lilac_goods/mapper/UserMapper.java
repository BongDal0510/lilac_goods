package com.lettering.lilac_goods.mapper;

import com.lettering.lilac_goods.domain.vo.TestimonialVO;
import com.lettering.lilac_goods.domain.vo.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {
    //    고객정보 조회
    public int checkId(String userId);

    //회원 가입
    public void join(UserVO userVO);

    //로그인
    public UserVO login(UserVO user);

    //아이디 찾기
    public String findId(UserVO user);

    //고객정보 확인하기
    public int checkUser(UserVO user);

    // 비밀번호 재설정
    public int resetPw(UserVO user);

    //회원탈퇴
    public int leave(UserVO user);

}
