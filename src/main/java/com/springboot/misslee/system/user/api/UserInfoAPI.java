package com.springboot.misslee.system.user.api;


import com.springboot.misslee.base.Result;
import com.springboot.misslee.system.user.service.UserInfoService;
import com.springboot.misslee.system.user.vo.UserInfo;
import com.springboot.misslee.system.user.vo.UserInfoExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api(tags={"系统管理-用户信息"})
@RequestMapping("/UserInfoAPI")
@RestController
public class UserInfoAPI {

    @Autowired
    private UserInfoService userInfoService;

    @PostMapping("/selectUserInfoById")
    @ApiOperation(value="用户登录")
    public Result selectUserInfoById(@RequestParam("userName") String userName,  @RequestParam("passWord") String passWord){
        UserInfo  userInfo=new UserInfo();
        userInfo.setUsername(userName);
        userInfo.setPassword(passWord);
        Result result=new Result();
        result=userInfoService.selectUserInfoById(userInfo);
        return result;
    }

    @PostMapping("/insertUserInfo")
    @ApiOperation(value="用户注册")
    public Result insertUserInfo(@RequestBody UserInfo  userInfo){
        Result result=new Result();
        result=userInfoService.selectUserInfoById(userInfo);
        return result;
    }

}
