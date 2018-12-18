package com.csoptt.entity;

/**
 * 实时状态信息
 *
 * @author liuzixi
 * @date 2018-12-18
 */
public class CurrentStatusInfo {

    /**
     * 是否删除
     */
    private int del;

    /**
     * 用户状态
     */
    private UserStatusEnums status;

    /**
     * 设置默认值
     */
    public CurrentStatusInfo() {
        del = 0;
        status = UserStatusEnums.NORMAL;
    }

    /**
     * Gets the value of del.
     *
     * @return the value of del
     */
    public int getDel() {
        return del;
    }

    /**
     * Sets the del
     * <p>You can use getDel() to get the value of del</p>
     *
     * @param del del
     */
    public void setDel(int del) {
        this.del = del;
    }

    /**
     * Gets the value of status.
     *
     * @return the value of status
     */
    public UserStatusEnums getStatus() {
        return status;
    }

    /**
     * Sets the status
     * <p>You can use getStatus() to get the value of status</p>
     *
     * @param status status
     */
    public void setStatus(UserStatusEnums status) {
        this.status = status;
    }

    public enum UserStatusEnums {

        /**
         * 正常
         */
        NORMAL(0, "正常"),
        /**
         * 禁用
         */
        FORBIDDEN(-1, "禁用");

        /**
         * 代号
         */
        private int code;

        /**
         * 名称
         */
        private String label;

        UserStatusEnums(int code, String label) {
            this.code = code;
            this.label = label;
        }

        /**
         * Gets the value of code.
         *
         * @return the value of code
         */
        public int getCode() {
            return code;
        }

        /**
         * Gets the value of label.
         *
         * @return the value of label
         */
        public String getLabel() {
            return label;
        }
    }
}
