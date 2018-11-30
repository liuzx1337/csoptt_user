package com.csoptt.custom.service;

import com.csoptt.constant.BaseConstant;
import com.csoptt.vo.LoginVO;
import com.csoptt.vo.UserVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

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
     * @author qishao
     * date 2018-11-22
     */
    public String login(LoginVO loginVO) {
        String csoToken = null;

        return csoToken;
    }

    /**
     * 登出
     * @author qishao
     * date 2018-11-30
     */
    public void logout() {
        // 1. 从请求头中取出csotoken
        String csoToken = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest().getHeader(BaseConstant.CSO_HEADER);

        // 2. 解密
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
