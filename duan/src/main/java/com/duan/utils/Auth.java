/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duan.utils;

import com.duan.entity.nhanvien;

/**
 *
 * @author Admin
 */
public class Auth {
    public static nhanvien user = null;
    public static void lean(){
        Auth.user = null;
    }
    public static boolean isLogin(){
       return Auth.user != null;
    }
    public static boolean isManager(){
        return Auth.isLogin() && user.isVaiTro();
    }
}
