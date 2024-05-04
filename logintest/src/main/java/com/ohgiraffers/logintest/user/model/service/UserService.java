package com.ohgiraffers.logintest.user.model.service;

import com.ohgiraffers.logintest.user.model.dao.UserMapper;
import com.ohgiraffers.logintest.user.model.dto.LoginUserDTO;
//import com.ohgiraffers.logintest.user.model.dto.SignupDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

// service 에서 암호화 진행

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

//    public int regist(SignupDTO signupDTO) {
//
//        // signupDTO 비밀번호 입력 -> getUserPass 담겨서 -> Bcrypt 담겨서 -> setUserPass 바꿔준다.
//        signupDTO.setUserPass(passwordEncoder.encode(signupDTO.getUserPass()));
//
//        int result = 0;
//
//        try {
//            result = userMapper.regist(signupDTO);
//        }catch (Exception e){
//            e.printStackTrace();    // 예외가 발생 했을 때, 발생한 위치와 상태를 반환하는 메소드
//        }
//
//        return result;
//    }

    public LoginUserDTO findByUsername(String username) {

        LoginUserDTO login = userMapper.findByUsername(username);

        if (!Objects.isNull(login)){
            return login;
        }else {
            return null;
        }
    }
}
