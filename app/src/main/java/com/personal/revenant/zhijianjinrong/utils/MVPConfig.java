package com.personal.revenant.zhijianjinrong.utils;

import android.graphics.Color;
import android.os.Build;
import android.support.annotation.DrawableRes;

public class MVPConfig {
    public static int statusDrawable;
    public static int toolbarBackgroundColor;
    public static int toolbarBackgroundDrawable;
    public static int backDrawable;
    public static boolean isStatusBarLight;

    public static void setStatusbarDrawable(@DrawableRes int statusDraw) {
        statusDrawable = statusDraw;
    }

    public static boolean isStatusBar() {
        return statusDrawable > 0;
    }

    public static void setToolbarDrawable(int toolbarBackgroundDrawable) {
        MVPConfig.toolbarBackgroundDrawable = toolbarBackgroundDrawable;
    }

    public static void setBackDrawable(int backDrawable) {
        MVPConfig.backDrawable = backDrawable;
    }

    public static void setIsStatusBarLight(boolean isStatusBarLight) {
        if (Build.VERSION.SDK_INT <= Build.VERSION_CODES.LOLLIPOP_MR1) {
            MVPConfig.statusDrawable = Color.parseColor("#33ffffff");
        }
        MVPConfig.isStatusBarLight = isStatusBarLight;
    }
}