package com.csoptt.custom.controller;

import com.csoptt.custom.service.UserService;
import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import com.csoptt.vo.LoginVO;
import com.csoptt.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户模块restController
 *
 * @author qishao
 * @date 2018-11-17
 */
@RestController
@RequestMapping("/csoptt_user/user")
@Api(description = "用户模块")
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
     * |用户模块|创建用户
     * @param userVO
     * @return
     * @author qishao
     * date 2018-11-22
     */
    @PostMapping("/create")
    @ApiOperation(value = "|用户模块|创建用户")
    public ResponseMessage createUser(@RequestBody UserVO userVO) {

        return Result.success();
    }
}
