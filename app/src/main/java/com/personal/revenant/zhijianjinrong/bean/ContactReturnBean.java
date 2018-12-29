package com.personal.revenant.zhijianjinrong.bean;

import java.util.List;

public class ContactReturnBean {
    private String uid;
    private List<ContactBean> list;
//    private List<CallLogBean> phones;

    public String getuid() {
        return uid;
    }

    public void setuid(String userId) {
        this.uid = userId;
    }

    public List<ContactBean> getList() {
        return list;
    }

    public void setList(List<ContactBean> list) {
        this.list = list;
    }

//    public List<CallLogBean> getPhones() {
//        return phones;
//    }
//
//    public void setPhones(List<CallLogBean> phones) {
//        this.phones = phones;
//    }
}
