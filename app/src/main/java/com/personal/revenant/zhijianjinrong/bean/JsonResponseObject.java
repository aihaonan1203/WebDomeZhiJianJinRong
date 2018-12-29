package com.personal.revenant.zhijianjinrong.bean;

public class JsonResponseObject {

    /**
     * meta : {"code":200,"msg":"OK"}
     * data : {"imgpath":"/img/1545983497425.png","imgorginname":"探花直播给你最好的江湖古风@3x"}
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
         * imgpath : /img/1545983497425.png
         * imgorginname : 探花直播给你最好的江湖古风@3x
         */

        private String imgpath;
        private String imgorginname;

        public String getImgpath() {
            return imgpath;
        }

        public void setImgpath(String imgpath) {
            this.imgpath = imgpath;
        }

        public String getImgorginname() {
            return imgorginname;
        }

        public void setImgorginname(String imgorginname) {
            this.imgorginname = imgorginname;
        }
    }
}
