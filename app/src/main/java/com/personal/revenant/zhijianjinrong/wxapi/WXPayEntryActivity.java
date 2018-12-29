package com.personal.revenant.zhijianjinrong.wxapi;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import com.apkfuns.logutils.LogUtils;
import com.personal.revenant.zhijianjinrong.MainActivity;
import com.personal.revenant.zhijianjinrong.R;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import static com.personal.revenant.zhijianjinrong.utils.Constant.WEIXINAPPID;


public class WXPayEntryActivity extends Activity implements IWXAPIEventHandler {

//    private static final String TAG = "MicroMsg.SDKSample.WXPayEntryActivity";

    private IWXAPI api;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wxpay_entry);

        api = WXAPIFactory.createWXAPI(this,WEIXINAPPID);
        api.handleIntent(getIntent(), this);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        api.handleIntent(intent, this);
    }

    @Override
    public void onReq(BaseReq req) {
    }

    @Override
    public void onResp(BaseResp resp) {

        if (resp.getType() == ConstantsAPI.COMMAND_PAY_BY_WX) {
            if (resp.errCode == 0) {
                LogUtils.d("AAAAAAAAAAAAAAAAAA支付成功");

                if (MainActivity.static_handler != null) {
                    MainActivity.static_handler.sendEmptyMessage(MainActivity.HANDLER_WXPAY_SUCCESS);
                }
                finish();

            } else {

                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("微信支付");
                builder.setMessage("支付失败");
                builder.show();
                finish();
            }
//            AlertDialog.Builder builder = new AlertDialog.Builder(this);
//            builder.setTitle(R.string.app_tip);
//            builder.setMessage(getString(R.string.pay_result_callback_msg, String.valueOf(resp.errCode)));
//            builder.show();
        }
//        else if (resp.getType() == ConstantsAPI.COMMAND_SENDAUTH) {
//            switch (resp.errCode) {
//                case BaseResp.ErrCode.ERR_OK:
//                    LogUtils.d(R.string.errcode_success);
//                    break;
//                case BaseResp.ErrCode.ERR_USER_CANCEL:
//                    LogUtils.d(R.string.errcode_cancel);
//                    break;
//                case BaseResp.ErrCode.ERR_AUTH_DENIED:
//                    LogUtils.d(R.string.errcode_deny);
//                    break;
//                case BaseResp.ErrCode.ERR_UNSUPPORT:
//                    LogUtils.d(R.string.errcode_unsupported);
//                    break;
//                default:
//                    LogUtils.d(R.string.errcode_unknown);
//
//            }
//        }
    }
}

