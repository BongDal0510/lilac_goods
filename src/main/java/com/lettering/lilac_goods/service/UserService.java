package com.lettering.lilac_goods.service;

import com.lettering.lilac_goods.domain.dao.UserDAO;
import com.lettering.lilac_goods.domain.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDAO userDAO;

    //아이디 검사
    public boolean checkId(String userId) {
        return userDAO.checkId(userId);
    }

    //회원 가입
    public void join(UserVO user) {
        userDAO.join(user);
    }

    //로그인-세션에 담을꼬라 리턴값없어도 될듯??
    public UserVO login(String userId, String userPw) {
        UserVO user = userDAO.login(userId,userPw);
        return user;
    }

    //아이디 찾기
    public String findId(UserVO user) {
        return userDAO.findId(user);
    }

    //고객정보 확인하기
    public boolean checkUser(UserVO user) {
        return userDAO.checkUser(user);
    }

    // 비밀번호 재설정
    public boolean resetPw(UserVO user){
        return userDAO.resetPw(user);
    }

    //회원탈퇴
    public boolean leave(UserVO user) {
        return userDAO.leave(user);
    }
}
