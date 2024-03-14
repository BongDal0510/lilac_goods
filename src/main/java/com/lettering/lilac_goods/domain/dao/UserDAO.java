package com.lettering.lilac_goods.domain.dao;

import com.lettering.lilac_goods.domain.vo.UserVO;
import com.lettering.lilac_goods.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;
    //아이디 검사
    public boolean checkId(String userId) {
        return userMapper.checkId(userId) == 1;
    }

    //회원 가입
    public void join(UserVO user) {
        userMapper.join(user);
    }

    //로그인
    public UserVO login(String userId, String userPw) {
        UserVO user = new UserVO();
        user.setUserId(userId);
        user.setUserPw(userPw);
        return userMapper.login(user);
    }

    //아이디 찾기
    public String findId(UserVO user) {
        return userMapper.findId(user);
    }

    //고객정보 확인하기
    public boolean checkUser(UserVO user) {
        return userMapper.checkUser(user) == 1;
    }

    // 비밀번호 재설정
    public boolean resetPw(UserVO user){
        return userMapper.checkUser(user) == 1;
    }

    //회원탈퇴
    public boolean leave(UserVO user) {
        return userMapper.checkUser(user) == 1;
    }
}
