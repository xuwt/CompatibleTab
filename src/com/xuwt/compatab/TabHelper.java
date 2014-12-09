package com.xuwt.compatab;

import android.app.Activity;
import android.os.Build;

/**
 * Created by xuwt on 2014/12/9.
 */
public abstract class TabHelper {


    // Usage is TabHelper.createInstance(activity)
    public static TabHelper createInstance(Activity activity) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            return new TabHelperHoneycomb(activity);
        } else {
            return new TabHelperEclair(activity);
        }
    }



    public abstract void addTab(CompatTab tab);
    public abstract void setUp();
    public abstract CompatTab newTab(String tag);
}
