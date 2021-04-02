package com.springboot.misslee.system.user.service.impl;

import com.springboot.misslee.base.Result;
import com.springboot.misslee.system.user.dao.UserInfoMapper;
import com.springboot.misslee.system.user.service.UserInfoService;
import com.springboot.misslee.system.user.vo.UserInfo;
import com.springboot.misslee.system.user.vo.UserInfoExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public  class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;


    @Override
    public Result selectUserInfoById(UserInfo userInfo) {
        Result result=new Result();
        int status=200;
        String msg="查询成功";
        UserInfoExample userInfoExample=new UserInfoExample();
        UserInfoExample.Criteria cri=userInfoExample.createCriteria();
        List<UserInfo> userInfoList=null;
        if(StringUtils.isNotBlank(userInfo.getUsername())){
            cri.andUsernameEqualTo(userInfo.getUsername());
        }
        if(StringUtils.isNotBlank(userInfo.getPassword())){
            cri.andPasswordEqualTo(userInfo.getPassword());
        }
        userInfoList= userInfoMapper.selectByExample(userInfoExample);
        if(userInfoList==null || userInfoList.size()<=0){
            status=404;
            msg="登录信息错误";
            result.setSuccess(false);
        }
        result.setMsg(msg);
        result.setStatus(status);
        result.setData(userInfoList);
        return result;
    }


    @Override
    public Result insertUserInfo(UserInfo userInfo) {


        return null;
    }


}
