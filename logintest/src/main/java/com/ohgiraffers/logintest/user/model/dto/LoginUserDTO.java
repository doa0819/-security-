package com.ohgiraffers.logintest.user.model.dto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LoginUserDTO {

    private int Employee_id;
    private String Employee_password;
    private String Employee_name;
    private String Employee_birth;
    private String Employee_gender;
    private String Manager_id;

    public List<String> getRole() {
        List<String> roles = new ArrayList<>();
        // Manager_id에 따라 권한 부여
        if ("manager".equals(this.Manager_id)) {
            roles.add("ROLE_MANAGER");
        } else {
            roles.add("ROLE_USER");
        }
        return roles;
    }

    public LoginUserDTO() {
    }


    public LoginUserDTO(int employee_id, String employee_password, String employee_name, String employee_birth, String employee_gender, String manager_id) {
        Employee_id = employee_id;
        Employee_password = employee_password;
        Employee_name = employee_name;
        Employee_birth = employee_birth;
        Employee_gender = employee_gender;
        Manager_id = manager_id;
    }

    public int getEmployee_id() {
        return Employee_id;
    }

    public void setEmployee_id(int employee_id) {
        Employee_id = employee_id;
    }

    public String getEmployee_password() {
        return Employee_password;
    }

    public void setEmployee_password(String employee_password) {
        Employee_password = employee_password;
    }

    public String getEmployee_name() {
        return Employee_name;
    }

    public void setEmployee_name(String employee_name) {
        Employee_name = employee_name;
    }

    public String getEmployee_birth() {
        return Employee_birth;
    }

    public void setEmployee_birth(String employee_birth) {
        Employee_birth = employee_birth;
    }

    public String getEmployee_gender() {
        return Employee_gender;
    }

    public void setEmployee_gender(String employee_gender) {
        Employee_gender = employee_gender;
    }

    public String getManager_id() {
        return Manager_id;
    }

    public void setManager_id(String manager_id) {
        Manager_id = manager_id;
    }

    @Override
    public String toString() {
        return "LoginUserDTO{" +
                "Employee_id=" + Employee_id +
                ", Employee_password='" + Employee_password + '\'' +
                ", Employee_name='" + Employee_name + '\'' +
                ", Employee_birth='" + Employee_birth + '\'' +
                ", Employee_gender='" + Employee_gender + '\'' +
                ", Manager_id='" + Manager_id + '\'' +
                '}';
    }
}