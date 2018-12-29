package com.personal.revenant.zhijianjinrong.bean;

public class SendImage {

    /**
     * meta : {"code":200,"msg":"http://192.168.83.1:8081/files/images/c9d7b1cbc2e64ddd8c47113be810e559.jpeg"}
     */

    private MetaBean meta;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public static class MetaBean {
        /**
         * code : 200
         * msg : http://192.168.83.1:8081/files/images/c9d7b1cbc2e64ddd8c47113be810e559.jpeg
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
}
