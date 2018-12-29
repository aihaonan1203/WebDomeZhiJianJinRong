package com.personal.revenant.zhijianjinrong.App;

import android.app.Application;

import com.facebook.stetho.Stetho;
import com.lzy.okgo.OkGo;
import com.personal.revenant.zhijianjinrong.utils.Constant;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;

import okhttp3.OkHttpClient;

import com.umeng.commonsdk.BuildConfig;

import static com.personal.revenant.zhijianjinrong.utils.Constant.QQAPP_ID;
import static com.personal.revenant.zhijianjinrong.utils.Constant.QQSECRET;
import static com.personal.revenant.zhijianjinrong.utils.Constant.WEIXINSECRET;

/**
 * Created by Administrator on 2018/8/23.
 */

public class App extends Application {
    public static OkHttpClient okHttpClient;
    public static IWXAPI mWxApi;
    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
        Stetho.initializeWithDefaults(this);
        if (BuildConfig.DEBUG) {
            UMConfigure.setLogEnabled(true);
        }
        UMConfigure.init(this, "5bb9bee0b465f50029000aec", "Umeng", UMConfigure.DEVICE_TYPE_PHONE,
                "");
        PlatformConfig.setWeixin(Constant.WEIXINAPPID, WEIXINSECRET);
        PlatformConfig.setQQZone(QQAPP_ID,QQSECRET);
        initOkHttp();
        mWxApi = WXAPIFactory.createWXAPI(this, Constant.WEIXINAPPID, false);
        // 将该app注册到微信
        mWxApi.registerApp(Constant.WEIXINAPPID);
    }

    private void initOkHttp() {
//        okHttpClient =  new OkHttpClient()
//                .newBuilder()
//                .addNetworkInterceptor(new StethoInterceptor()) // 这里添加一个拦截器即可
//                .build();
    }


}
