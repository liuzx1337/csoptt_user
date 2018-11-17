package com.csoptt.custom.controller;

import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import com.csoptt.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
     * 创建用户
     * @param userVO
     * @return
     */
    @PostMapping("/create")
    @ApiOperation(value = "用户模块|创建用户")
    public ResponseMessage createUser(@RequestBody UserVO userVO) {
        return Result.success();
    }
}
