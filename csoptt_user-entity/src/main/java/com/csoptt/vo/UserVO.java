package com.csoptt.vo;

/**
 * 用户实体类
 * 用于创建、修改、查看时为前台显示的vo类
 *
 * @author qishao
 * @date 2018-11-17
 */
public class UserVO {

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 用户名（账户名）
     */
    private String username;

    /**
     * email
     */
    private String email;

    /**
     * 手机号
     */
    private String mobileNo;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * Gets the value of userId.
     *
     * @return the value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId
     * <p>You can use getUserId() to get the value of userId</p>
     *
     * @param userId userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the value of username.
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username
     * <p>You can use getUsername() to get the value of username</p>
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the value of email.
     *
     * @return the value of email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email
     * <p>You can use getEmail() to get the value of email</p>
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Gets the value of mobileNo.
     *
     * @return the value of mobileNo
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the mobileNo
     * <p>You can use getMobileNo() to get the value of mobileNo</p>
     *
     * @param mobileNo mobileNo
     */
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * Gets the value of realName.
     *
     * @return the value of realName
     */
    public String getRealName() {
        return realName;
    }

    /**
     * Sets the realName
     * <p>You can use getRealName() to get the value of realName</p>
     *
     * @param realName realName
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * Gets the value of idNumber.
     *
     * @return the value of idNumber
     */
    public String getIdNumber() {
        return idNumber;
    }

    /**
     * Sets the idNumber
     * <p>You can use getIdNumber() to get the value of idNumber</p>
     *
     * @param idNumber idNumber
     */
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * Gets the value of nickName.
     *
     * @return the value of nickName
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the nickName
     * <p>You can use getNickName() to get the value of nickName</p>
     *
     * @param nickName nickName
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
