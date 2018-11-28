package com.csoptt.custom.controller;

import com.csoptt.custom.service.UserService;
import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import com.csoptt.vo.LoginVO;
import com.csoptt.vo.PasswordChangeVO;
import com.csoptt.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户模块restController
 * 此controller主要包含对当前用户修改的功能
 *
 * @author qishao
 * @date 2018-11-17
 */
@RestController
@RequestMapping("/csoptt_user/user")
@Api(description = "|用户模块|维护当前用户")
public class UserController extends BaseController {

    /**
     * 业务逻辑层
     */
    @Autowired
    private UserService userService;

    /**
     * |用户模块|登录
     * @param loginVO
     * @return
     * @author qishao
     * date 2018-11-22
     */
    @PostMapping("/login")
    @ApiOperation(value = "|用户模块|登录")
    public ResponseMessage login(@RequestBody LoginVO loginVO) {
        String csoToken;
        try {
            csoToken = userService.login(loginVO);
        } catch (Exception e) {
            return Result.error(getErrorMsg(e));
        }
        return Result.success(csoToken);
    }

    /**
     * |用户模块|编辑用户信息
     * @param userVO
     * @return
     * @author qishao
     * date 2018-11-26
     */
    @PostMapping("/update")
    @ApiOperation(value = "|用户模块|编辑个人用户信息")
    public ResponseMessage updateUser(@RequestBody UserVO userVO) {

        return Result.success();
    }

    @GetMapping("/getEmailValidCode")
    @ApiOperation(value = "|用户模块|获取邮箱验证码")
    public ResponseMessage checkEmail() {

        return Result.success();
    }

    /**
     * |用户模块|修改密码
     * @param passwordChangeVO
     * @return
     * @author qishao
     * date 2018-11-26
     */
    @PostMapping("/changePassword")
    @ApiOperation(value = "|用户模块|修改密码")
    public ResponseMessage changePassword(@RequestBody PasswordChangeVO passwordChangeVO) {

        return Result.success();
    }
}
