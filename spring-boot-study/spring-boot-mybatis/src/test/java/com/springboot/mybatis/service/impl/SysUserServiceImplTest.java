package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.mapper.SysUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {
    @Resource
    private SysUserMapper sysUserMapper;

    @Test
    public void selectAll() {
        List<SysUser> sysUserList=sysUserMapper.selectAll();
        sysUserList.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void getOne() {
        SysUser sysUser=sysUserMapper.getOne(1L);
        System.out.println(sysUser);
    }

    @Test
    public void insert() {
        SysUser sysUser=new SysUser();
        sysUser.setMobile("18166557755");
        sysUser.setPassword("123456");
        sysUser.setUsername("张三");
        sysUser.setAvatar("user999.jpg");
        sysUserMapper.insert(sysUser);
    }

    @Test
    public void delete() {
        sysUserMapper.delete(3L);
    }

    @Test
    public void update() {
        SysUser sysUser=sysUserMapper.getOne(4L);
        sysUser.setPassword("66666");
        sysUser.setAvatar("666.jpg");
        sysUserMapper.update(sysUser);
    }
}