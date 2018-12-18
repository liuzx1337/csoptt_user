package com.csoptt.entity;

/**
 * 用户
 * 包含用户应有的所有信息
 *
 * @author liuzixi
 * @date 2018-12-18
 */
public class CsopttUser {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 用户名（账户名）
     */
    private String username;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 个人资料
     */
    private PersonalInfo personalInfo;

    /**
     * 实名信息
     */
    private RealNameRegistrationInfo realNameRegistrationInfo;

    /**
     * 实时状态信息
     */
    private CurrentStatusInfo currentStatusInfo;
}
