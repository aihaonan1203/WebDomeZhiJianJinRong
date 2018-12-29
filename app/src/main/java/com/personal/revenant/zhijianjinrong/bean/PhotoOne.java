package com.personal.revenant.zhijianjinrong.bean;

import java.util.List;

/**
 * Created by Administrator on 2018/8/28.
 */

public class PhotoOne {


    /**
     * meta : {"code":200,"msg":"OK"}
     * data : ["pbyatzk15.bkt.clouddn.com/Fjvvcshvo8YY-pm5yJCd1Pc4RyYU","pbyatzk15.bkt.clouddn.com/Fj46E6nIKgpIg1-MvFIIRQjE1-m-"]
     */

    private MetaBean meta;
    private List<String> data;

    public MetaBean getMeta() {
        return meta;
    }

    public void setMeta(MetaBean meta) {
        this.meta = meta;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
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
}
