package com.csoptt.custom.controller;

import com.csoptt.utils.base.controller.BaseController;
import com.csoptt.utils.http.ResponseMessage;
import com.csoptt.utils.http.Result;
import com.csoptt.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 用户模块restController
 * 此controller主要包含对所有用户修改的功能
 *
 * @author liuzixi
 * @date 2018-11-26
 */
@RestController
@RequestMapping("/csoptt_user/userManage")
@Api(description = "|用户模块|维护所有用户")
public class UserManageController extends BaseController {

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

    /**
     * |用户模块|编辑用户信息
     * @param userVO
     * @return
     * @author qishao
     * date 2018-11-26
     */
    @PostMapping("/update")
    @ApiOperation(value = "|用户模块|编辑用户信息")
    public ResponseMessage updateUser(@RequestBody UserVO userVO) {

        return Result.success();
    }

    /**
     * |用户模块|删除用户
     * @param ids
     * @return
     * @author qishao
     * date 2018-11-26
     */
    @PostMapping("/delete")
    @ApiOperation(value = "|用户模块|删除用户")
    public ResponseMessage batchDelete(@RequestBody List<String> ids) {

        return Result.success();
    }

    /**
     * |用户模块|重置密码
     * @param userId
     * @return
     * @author qishao
     * date 2018-11-26
     */
    @PostMapping("/resetPassword")
    @ApiOperation(value = "|用户模块|重置密码")
    public ResponseMessage resetPassword(String userId) {

        return Result.success();
    }
}
