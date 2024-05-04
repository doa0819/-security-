package com.ohgiraffers.logintest.user.controller;

//import com.ohgiraffers.logintest.user.model.dto.SignupDTO;
import com.ohgiraffers.logintest.user.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// controller 검증만 진행
@Controller
public class UserController {

    // UserService 호출 위해 의존성(@Autowired) 주입
    @Autowired
    private UserService userService;

    // user 하위 singup 리턴
//    @GetMapping("/signup")
//    public void signup() {}
//
//    @PostMapping("/signup")
//    public ModelAndView signup(ModelAndView mv, @ModelAttribute SignupDTO signupDTO){
//
//        int result = userService.regist(signupDTO);
//
//        String message = "";
//
//        if(result > 0){
//            message = "회원가입이 정상적으로 완료되었습니다!!!";
//        }else {
//            message = "회원가입이 실패하셨습니다.";
//        }
//
//        mv.addObject("message",message);
//
//        return mv;
//    }

}
