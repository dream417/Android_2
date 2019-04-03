package com.example.myjunior.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public class Utils {
    // 根据手机的分辨率从 dp 的单位 转成为 px(像素)
    public static int dip2px(Context context, float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);
    }

    public static int px2dip(Context context,float pxValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5f);
    }

    public static int getScreenWidth(Context ctx){
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.widthPixels;
    }

    public static int getScreenHeight(Context ctx){
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(dm);
        return  dm.heightPixels;
    }

    public static float getScreenDensity(Context ctx){
        WindowManager wm = (WindowManager)ctx.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();

        wm.getDefaultDisplay().getMetrics(dm);
        return dm.density;
    }
}
