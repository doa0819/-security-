package com.ohgiraffers.logintest.common;

public enum UserRole {

    /* 필기.
    *   enum 은 열거형 상수 라고 한다.
    *   미리 정의 된 상수 값들의 집합인 클래스이며,
    *   하나의 집합으로서 반복문을 사용할 수 있으며
    *   컬렉션과 함께 사용할 수 있다.
    *   코드의 의미를 전달하는데 도움을 줄 수 있으며
    *
    *   private final / private final  => 이 두가지를 배열로 만들수 없다.(변수는 하나로 묶을수 없어서 배열이 나옴)
    *   상수 또한 하나로 묶을수 없어서 이넘이 나왔다.
    *   user,어드미 =>
    * */

    USER("USER"),
    ADMIN("ADMIN");

    private String role;

    UserRole(String role) {this.role = role;}

    public String getRole() {return role;}

    @Override
    public String toString() {
        return "UserRole{" +
                "role='" + role + '\'' +
                '}';
    }


}
