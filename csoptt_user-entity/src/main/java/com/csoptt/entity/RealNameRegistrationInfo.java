package com.csoptt.entity;

/**
 * 实名信息
 *
 * @author liuzixi
 * @date 2018-12-18
 */
public class RealNameRegistrationInfo {

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 本人手机号
     */
    private String mobileNumber;

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
}
