package com.csoptt.vo;

/**
 * 修改密码入参
 *
 * @author qishao
 * @date 2018-11-26
 */
public class PasswordChangeVO {

    /**
     * 用户id
     */
    private String userId;

    /**
     * 旧密码
     */
    private String oldPassword;

    /**
     * 新密码
     */
    private String newPassword;

    /**
     * Gets the value of userId.
     *
     * @return the value of userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the userId.
     * <p>
     * <p>You can use getUserId() to get the value of userId</p>
     *
     * @param userId userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * Gets the value of oldPassword.
     *
     * @return the value of oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * Sets the oldPassword.
     * <p>
     * <p>You can use getOldPassword() to get the value of oldPassword</p>
     *
     * @param oldPassword oldPassword
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * Gets the value of newPassword.
     *
     * @return the value of newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the newPassword.
     * <p>
     * <p>You can use getNewPassword() to get the value of newPassword</p>
     *
     * @param newPassword newPassword
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
