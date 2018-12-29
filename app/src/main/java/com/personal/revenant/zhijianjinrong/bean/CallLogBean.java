package com.personal.revenant.zhijianjinrong.bean;

public class CallLogBean {
    public String number;
    public long date;
    public int type;

    public CallLogBean(String number, long date, int type) {
        super();
        this.number = number;
        this.date = date;
        this.type = type;
    }

    public CallLogBean() {
        super();
    }
}
