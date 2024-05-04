package com.ohgiraffers.logintest.auth;

import com.ohgiraffers.logintest.user.model.dto.LoginUserDTO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

public class AuthDetails implements UserDetails {

    private LoginUserDTO loginUserDTO;
    public AuthDetails() {}
    public AuthDetails(LoginUserDTO loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }

    public LoginUserDTO getLoginUserDTO() {
        return loginUserDTO;
    }

    public void setLoginUserDTO(LoginUserDTO loginUserDTO) {
        this.loginUserDTO = loginUserDTO;
    }

    /* 필기.
    *   권한 정보를 반환하는 메소드
    *   UsernamePasswordAuthenticationToken 에 사용자의 권한 정보를 넣을 때 사용한다.
    *   다중 권한(user 이면서 admin 일수도 있고 user 이면서 다른 권한자 일수도 있다.) 처리 가능하다.
    *   Authorities : 다중권한 메소드
     * */

    // GrantedAuthority : 권한
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> authorities = new ArrayList<>();

        loginUserDTO.getRole().forEach(role -> authorities.add(() -> role));

        return authorities;
    }

    /* 필기.
    *   사용자의 비밀번호를 반환하는 메소드
    *   UsernamePasswordAuthenticationToken 과 사용자의 비밀번호를 비교할 때 사용한다. */
    @Override
    public String getPassword() {
        return loginUserDTO.getEmployee_password();
    }

    /* 필기.
     *   사용자의 아이디를 반환하는 메소드이다.
     *   UsernamePasswordAuthenticationToken 과 사용자의 아이디를 비교할때 사용한다.*/@Override
    public String getUsername() {return String.valueOf(loginUserDTO.getEmployee_id());}

    //isAccountNonExpired: 계정 만료
    /* 필기.
    *   계정 만료 여부를 표현하는 메소드로 false 이면 해당 계정을 사용할 수 없다.
    * */
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    // isAccountNonLocked : 계정 잠겼는지
    /* 필기.
    *   잠겨있는 계정을 확인하는 메소드 false 이면 해당 계정을 사용할 수 없다.
    *   비밀번호 반복 실패로 일시적인 계정 lock 인 경우 혹은 오랜시간
    *   비 접속으로 휴면 처리
    * */
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    // isCredentialsNonExpired : 탈퇴여부
    /* 필기.
    *   탈퇴 계정 여부를 표현하는 메소드 false 이면 해당 계정을 사용할 수 없다.
    * */
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /* 필기.
    *   계정 비활성화 여부로 사용자가 사용할 수 없는 상태
    *   false 이면 계정을 사용할 수 없다. 삭제 처리 같은 경우.
    * */
    @Override
    public boolean isEnabled() {
        return true;
    }
}
