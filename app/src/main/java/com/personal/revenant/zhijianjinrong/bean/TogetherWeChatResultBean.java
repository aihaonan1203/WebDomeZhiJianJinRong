package com.personal.revenant.zhijianjinrong.bean;

public class TogetherWeChatResultBean {


    /**
     * meta : {"code":200,"msg":"OK"}
     * data : {"user_id":1000400079,"phone":null,"user_name":"t_fjLEZ","user_weixin":null,"user_qq":null,"user_img":null,"createtime":null,"updatetime":null,"user_sex":null,"user_age":0,"content":null,"star":null,"onlinestatus":"1","token":"1xwtHG2WP5JKQ9LyXIhDWQ6yzP6GpjeG","back_img":null,"checkstatus":null,"photos":null,"longitude":0,"attitude":0,"rel_name":null,"idcard":null,"deleted":null,"proclaim":null}
     */

    private MetaBean meta;
    private DataBean data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class MetaBean {
        /**
         * code : 200
         * msg : OK
         */

        private int code;
        private String msg;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }
    }

    public static class DataBean {
        /**
         * user_id : 1000400079
         * phone : null
         * user_name : t_fjLEZ
         * user_weixin : null
         * user_qq : null
         * user_img : null
         * createtime : null
         * updatetime : null
         * user_sex : null
         * user_age : 0
         * content : null
         * star : null
         * onlinestatus : 1
         * token : 1xwtHG2WP5JKQ9LyXIhDWQ6yzP6GpjeG
         * back_img : null
         * checkstatus : null
         * photos : null
         * longitude : 0
         * attitude : 0
         * rel_name : null
         * idcard : null
         * deleted : null
         * proclaim : null
         */

        private int user_id;
        private Object phone;
        private String user_name;
        private Object user_weixin;
        private Object user_qq;
        private Object user_img;
        private Object createtime;
        private Object updatetime;
        private Object user_sex;
        private int user_age;
        private Object content;
        private Object star;
        private String onlinestatus;
        private String token;
        private Object back_img;
        private Object checkstatus;
        private Object photos;
        private int longitude;
        private int attitude;
        private Object rel_name;
        private Object idcard;
        private Object deleted;
        private Object proclaim;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public Object getPhone() {
            return phone;
        }

        public void setPhone(Object phone) {
            this.phone = phone;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public Object getUser_weixin() {
            return user_weixin;
        }

        public void setUser_weixin(Object user_weixin) {
            this.user_weixin = user_weixin;
        }

        public Object getUser_qq() {
            return user_qq;
        }

        public void setUser_qq(Object user_qq) {
            this.user_qq = user_qq;
        }

        public Object getUser_img() {
            return user_img;
        }

        public void setUser_img(Object user_img) {
            this.user_img = user_img;
        }

        public Object getCreatetime() {
            return createtime;
        }

        public void setCreatetime(Object createtime) {
            this.createtime = createtime;
        }

        public Object getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(Object updatetime) {
            this.updatetime = updatetime;
        }

        public Object getUser_sex() {
            return user_sex;
        }

        public void setUser_sex(Object user_sex) {
            this.user_sex = user_sex;
        }

        public int getUser_age() {
            return user_age;
        }

        public void setUser_age(int user_age) {
            this.user_age = user_age;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        public Object getStar() {
            return star;
        }

        public void setStar(Object star) {
            this.star = star;
        }

        public String getOnlinestatus() {
            return onlinestatus;
        }

        public void setOnlinestatus(String onlinestatus) {
            this.onlinestatus = onlinestatus;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public Object getBack_img() {
            return back_img;
        }

        public void setBack_img(Object back_img) {
            this.back_img = back_img;
        }

        public Object getCheckstatus() {
            return checkstatus;
        }

        public void setCheckstatus(Object checkstatus) {
            this.checkstatus = checkstatus;
        }

        public Object getPhotos() {
            return photos;
        }

        public void setPhotos(Object photos) {
            this.photos = photos;
        }

        public int getLongitude() {
            return longitude;
        }

        public void setLongitude(int longitude) {
            this.longitude = longitude;
        }

        public int getAttitude() {
            return attitude;
        }

        public void setAttitude(int attitude) {
            this.attitude = attitude;
        }

        public Object getRel_name() {
            return rel_name;
        }

        public void setRel_name(Object rel_name) {
            this.rel_name = rel_name;
        }

        public Object getIdcard() {
            return idcard;
        }

        public void setIdcard(Object idcard) {
            this.idcard = idcard;
        }

        public Object getDeleted() {
            return deleted;
        }

        public void setDeleted(Object deleted) {
            this.deleted = deleted;
        }

        public Object getProclaim() {
            return proclaim;
        }

        public void setProclaim(Object proclaim) {
            this.proclaim = proclaim;
        }
    }
}
