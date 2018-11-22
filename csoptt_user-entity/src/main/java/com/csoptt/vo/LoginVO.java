package com.csoptt.vo;

/**
 * 用户登录所需入参
 *
 * @author qishao
 * @date 2018-11-22
 */
public class LoginVO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 验证码
     */
    private String validCode;

    /**
     * 登录凭据
     */
    private String loginToken;

    /**
     * Gets the value of username.
     *
     * @return the value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the username.
     * <p>
     * <p>You can use getUsername() to get the value of username</p>
     *
     * @param username username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * Gets the value of password.
     *
     * @return the value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password.
     * <p>
     * <p>You can use getPassword() to get the value of password</p>
     *
     * @param password password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Gets the value of validCode.
     *
     * @return the value of validCode
     */
    public String getValidCode() {
        return validCode;
    }

    /**
     * Sets the validCode.
     * <p>
     * <p>You can use getValidCode() to get the value of validCode</p>
     *
     * @param validCode validCode
     */
    public void setValidCode(String validCode) {
        this.validCode = validCode;
    }

    /**
     * Gets the value of loginToken.
     *
     * @return the value of loginToken
     */
    public String getLoginToken() {
        return loginToken;
    }

    /**
     * Sets the loginToken.
     * <p>
     * <p>You can use getLoginToken() to get the value of loginToken</p>
     *
     * @param loginToken loginToken
     */
    public void setLoginToken(String loginToken) {
        this.loginToken = loginToken;
    }
}
