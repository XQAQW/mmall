package com.mmall.service;


import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * @author M (xqwQAQwq@163.com)
 * @date 2019-01-02 16:22
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);

    ServerResponse<String> checkValid(String str, String type);
}
