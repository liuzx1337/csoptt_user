package com.csoptt.custom.service;

import com.csoptt.vo.LoginVO;
import com.csoptt.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户模块Service
 *
 * @author qishao
 * @date 2018-11-17
 */
@Service
public class UserService {

    /**
     * 登录
     * @param loginVO
     * @return 向header中增加的token
     * @author liuzixi
     * date 2018-11-22
     */
    public String login(LoginVO loginVO) {
        String csoToken = null;

        return csoToken;
    }

    /**
     * 创建用户
     * @param userVO
     * @author qishao
     * date 2018-11-22
     */
    @Transactional(rollbackFor = Throwable.class)
    public void createUser(UserVO userVO) {
        //
    }
}
