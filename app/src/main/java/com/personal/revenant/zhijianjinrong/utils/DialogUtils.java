package com.personal.revenant.zhijianjinrong.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;


public class DialogUtils {

    /**
     * 回调
     *
     * @author lizheng
     */
    public interface DialogListener {
        void onClickBtn(boolean flag, String teamTag, String showNames, String date, String price, String showIds);
    }

    public interface ChooseListener {
        void chooseCamear(boolean flag);
    }

    public interface ChooseItemListener {
        void chooseOne(int position);
    }

    public interface ChooseDateListener {
        void chooseDate(String date);
    }

    public interface BaseDialogListener {
        void leftPress(DialogInterface dialog);

        void rightPress(DialogInterface dialog);
    }

    public static void showDefaultAlert(Context context, String msg) {
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setMessage(msg);
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();//显示对话框
    }


    public static void showAlert(Context context, String msg, final BaseDialogListener listener) {
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setMessage(msg);
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                listener.rightPress(dialog);
            }
        });

        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();//关闭对话框
            }
        });
        dialog.show();//显示对话框
    }


    public static void showAlert(Context context, String msg, String leftText, String rightText, boolean canCancle, final BaseDialogListener listener) {
        AlertDialog dialog = new AlertDialog.Builder(context).create();
        dialog.setMessage(msg);
        dialog.setCancelable(canCancle);
        dialog.setButton(DialogInterface.BUTTON_POSITIVE, rightText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                listener.rightPress(dialog);
            }
        });

        dialog.setButton(DialogInterface.BUTTON_NEGATIVE, leftText, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                listener.leftPress(dialog);
            }
        });
        dialog.show();//显示对话框
    }


}
