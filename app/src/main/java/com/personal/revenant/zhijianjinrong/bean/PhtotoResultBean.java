package com.personal.revenant.zhijianjinrong.bean;

public class PhtotoResultBean {

    /**
     * status : 0
     * msg : 上传成功
     * data : img/identityz/13-identityz.jpeg
     * success : true
     */

    private int status;
    private String msg;
    private String data;
    private boolean success;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
