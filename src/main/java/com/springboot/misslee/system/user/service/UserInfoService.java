package com.springboot.misslee.system.user.service;

import com.springboot.misslee.base.Result;
import com.springboot.misslee.system.user.vo.UserInfo;

public interface UserInfoService {

    Result selectUserInfoById(UserInfo userInfo);

    Result insertUserInfo(UserInfo userInfo);
}
