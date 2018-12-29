package com.personal.revenant.zhijianjinrong.utils;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.personal.revenant.zhijianjinrong.R;


/**
 * Created by lizheng on 17/2/28.
 */
public class LoadDialog extends Dialog {

    private TextView tips_loading_msg;
    private Builder mBuilder;

    public LoadDialog(Builder builder) {
        super(builder.mContext, R.style.load_dialog);
        mBuilder = builder;
        setCancelable(mBuilder.mCanCancel);
    }

    public static class Builder {
        private Context mContext;
        private CharSequence mLoadText;
        private boolean mCanCancel;

        public Builder(Context context) {
            mContext = context;
        }

        public Builder loadText(CharSequence loadText) {
            mLoadText = loadText;
            return this;
        }

        public Builder loadText(int resId) {
            mLoadText = mContext.getString(resId);
            return this;
        }

        public Builder canCancel(boolean canCancel) {
            mCanCancel = canCancel;
            return this;
        }

        public LoadDialog build() {
            return new LoadDialog(this);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_tips_loading);
        tips_loading_msg = findViewById(R.id.tips_loading_msg);

        if (!TextUtils.isEmpty(mBuilder.mLoadText)) {
            tips_loading_msg.setText(mBuilder.mLoadText);
            tips_loading_msg.setVisibility(View.VISIBLE);
        }
    }


    public void setText(String text) {
        tips_loading_msg.setText(text);
    }
}
