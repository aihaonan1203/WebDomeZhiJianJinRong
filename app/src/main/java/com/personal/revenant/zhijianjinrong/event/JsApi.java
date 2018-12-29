package com.personal.revenant.zhijianjinrong.event;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by Administrator on 2018/8/23.
 */

public class JsApi {
    private JsCallback jsCallback;

    public JsApi(JsCallback callback) {
        this.jsCallback = callback;
    }


    @JavascriptInterface
    public void toPay(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.jsGetAlipayParams(params);
    }

    @JavascriptInterface
    public void addHeadImg(Object params) {
        Log.d("图片数据是",params.toString());
        jsCallback.addHeadImg(params);
    }
    @JavascriptInterface
    public void sendImg(Object params) {
        Log.d("图片数据是",params.toString());
        jsCallback.sendImg(params);
    }
    @JavascriptInterface
    public void addBackImg(Object params) {
        Log.d("图片数据是",params.toString());
        jsCallback.addBackImg(params);
    }

    @JavascriptInterface
    public void addManyImg(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.addManyImg(params);
    }

    @JavascriptInterface
    public void share(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.takeShare(params);
    }

    @JavascriptInterface
    public void third_party_login(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.third_party_login(params);
    }

    @JavascriptInterface
    public void copyordercode(Object params) {
        Log.d("---->>>>", params.toString());
        jsCallback.takeShare(params);
    }


    @JavascriptInterface
    public void canExit(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.takeExit(params);
    }
    @JavascriptInterface
    public void sendAudio(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.sendAudio(params);
    }
    @JavascriptInterface
    public void identity(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.identity(params);
    }

    @JavascriptInterface
    public void identitysumit(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.identitysumit(params);
    }

    @JavascriptInterface
    public void zfb_pay(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.zfb_pay(params);
    }

    @JavascriptInterface
    public void wx_pay(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.wx_pay(params);
    }

    @JavascriptInterface
    public void uploadImage(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.uploadImage(params);
    }

    @JavascriptInterface
    public void getContactAndCallLog(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.getContactAndCallLog(params);
    }

    @JavascriptInterface
    public void takeCamera(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.takeCamera(params);
    }


    @JavascriptInterface
    public void downloadFile(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.downloadFile(params);
    }

    @JavascriptInterface
    public void callPhone(Object params) {
        Log.d("jsApi: params ---->>>>", params.toString());
        jsCallback.callPhone(params);
    }

    public interface JsCallback {

        void callPhone(Object params);

        void wx_pay(Object params);

        void zfb_pay(Object params);

        void takeCamera(Object params);

        /**
         * 上传照片
         */
        void uploadImage(Object params);

        /**
         * 获取通讯录
         */
        void getContactAndCallLog(Object params);

        /**
         * 调用支付
         **/
        void jsGetAlipayParams(Object params);

        /**
         * 上传头像
         **/
        void addHeadImg(Object params);

        /**
         * 多图上传
         **/
        void addManyImg (Object params);

        /**
         * 上传背景
         **/
        void addBackImg(Object params);

        /**
         * 分享
         **/
        void takeShare(Object params);

        /**
         * 拷贝到剪切板
         **/
        void takeCopy(Object params);

        /**
         * 是否可以退出
         **/
        void takeExit(Object params);
        void sendImg(Object params);
        void  third_party_login(Object params);
        void sendAudio(Object params);
        void identity(Object params);
        void downloadFile(Object params);
        void identitysumit(Object params);
    }
}
