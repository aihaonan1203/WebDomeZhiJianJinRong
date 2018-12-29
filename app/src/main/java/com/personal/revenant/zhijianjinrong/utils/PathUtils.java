package com.personal.revenant.zhijianjinrong.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Environment;

import java.io.File;

/**
 * Created by lizheng
 */
public class PathUtils {
    private static File checkAndMkdirs(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        return Environment.MEDIA_MOUNTED.equals(state);
    }

    /**
     * 有 sdcard 的时候，小米是 /storage/sdcard0/Android/data/com.avoscloud.chat/cache/
     * 无 sdcard 的时候，小米是 /data/data/com.avoscloud.chat/cache
     *
     * @return
     */
    private static File getAvailableCacheDir() {
        if (isExternalStorageWritable()) {
            return Utils.getContext().getExternalCacheDir();
        } else {
            // 只有此应用才能访问。拍照的时候有问题，因为拍照的应用写入不了该文件
            return Utils.getContext().getCacheDir();
        }
//		return getChatFileDir();
    }


    public static String checkAndMkdirs(String dir) {
        File file = new File(dir);
        if (file.exists() == false) {
            file.mkdirs();
        }
        return dir;
    }

    private static File getCacheDir() {
        File sdcard = Environment.getExternalStorageDirectory();
        File cacheDir = new File(sdcard, "foryouCache");
        return checkAndMkdirs(cacheDir);
    }

    private static File getVoiceFileDir() {
        File filesDir = new File(getCacheDir(), "voices");
        return checkAndMkdirs(filesDir);
    }

    /**
     * 可能文件会被清除掉，需要检查是否存在
     *
     * @param id
     * @return
     */
    public static String getVoiceFilePath(String id) {
        String path = new File(getVoiceFileDir(), id).getAbsolutePath();
        return path;
    }

    /**
     * 录音保存的地址
     *
     * @return
     */
    public static String getRecordPathByCurrentTime() {
        return new File(getVoiceFileDir(), "record_" + System.currentTimeMillis()).getAbsolutePath() + ".amr";
    }

    /**
     * 拍照保存的地址
     *
     * @return
     */
    public static String getPicturePathByCurrentTime() {
        String path = new File(getAvailableCacheDir(), "picture_" + System.currentTimeMillis()).getAbsolutePath() + ".jpg";
        return path;
    }

    /**
     * 检查SD卡是否存在
     */
    public static boolean checkSdCard() {
        if (Environment.getExternalStorageState().equals(
                Environment.MEDIA_MOUNTED))
            return true;
        else
            return false;
    }

    /**
     * 检测是否是APK文件
     *
     * @param apkFilePath
     * @return
     */
    public static boolean checkApkFile(Context context, String apkFilePath) {
        boolean result = false;
        try {
            PackageManager pManager = context.getPackageManager();
            PackageInfo pInfo = pManager.getPackageArchiveInfo(apkFilePath, PackageManager.GET_ACTIVITIES);
            if (pInfo == null) {
                result = false;
            } else {
                result = true;
            }
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 安装APK文件
     *
     * @param apkFile
     */
    public static void install(Context context, File apkFile) {
        Uri uri = Uri.fromFile(apkFile);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.setDataAndType(uri, "application/vnd.android.package-archive");
        context.startActivity(intent);
    }

    public static File makeDir(String path) {
        File file = new File(getAvailableCacheDir(), path);
        return checkAndMkdirs(file);
    }

    public static File makeCacheDir(String path) {
        File file = new File(getCacheDir(), path);
        return checkAndMkdirs(file);
    }


    public static File getTemplateFileDir() {
        File file = makeDir("tmp");
        return file;
    }


    public static File getDownPathByCurrentTime() {
        File appDir = PathUtils.getTemplateFileDir();
        String fileName = System.currentTimeMillis() + "";
        return new File(appDir.getPath() + File.separator + fileName);
    }


    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.exists())
            file.delete();
    }

}
