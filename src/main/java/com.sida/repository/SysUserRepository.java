package com.sida.repository;

import com.sida.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository extends JpaRepository<SysUser,Integer> {
    /**
     * 按用户名——密码查找
     */
    SysUser findFirstByNameAndPassword(String name, String password);

}
