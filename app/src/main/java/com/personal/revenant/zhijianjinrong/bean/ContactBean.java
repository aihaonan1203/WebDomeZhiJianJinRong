package com.personal.revenant.zhijianjinrong.bean;

public class ContactBean {
    private String name;
    private String phone;

    public ContactBean() {

    }

    public ContactBean(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
