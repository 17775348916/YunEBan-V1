package com.example.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.server.pojo.Admin;
import com.example.server.pojo.RespBean;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ChaochaoYao
 * @since 2022-02-05
 */
public interface IAdminService extends IService<Admin> {
    /**
     * 登录之后返回token
     * @param username
     * @param password
     * @param request
     * @return
     */
    public RespBean login(String username, String password, HttpServletRequest request);

    /**
     * 根据用户名返回用户信息
     * @param username
     * @return
     */
    public Admin getAdminByUserName(String username);
}
