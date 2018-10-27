package com.sida.service;


import com.sida.entity.SysUser;

public interface SysUserService {

    SysUser saveUser(SysUser user);

    SysUser checkLogin(String name, String password);
}
