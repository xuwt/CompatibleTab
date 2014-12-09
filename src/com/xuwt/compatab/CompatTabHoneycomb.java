package com.xuwt.compatab;


import android.app.ActionBar;
import android.app.Activity;
import android.app.FragmentTransaction;

/**
 * Created by xuwt on 2014/12/9.
 */
public class CompatTabHoneycomb extends CompatTab {
    // The native tab object that this CompatTab acts as a proxy for.
    ActionBar.Tab mTab;

    @Override
    public CharSequence getText() {
        return null;
    }

    protected CompatTabHoneycomb(Activity activity, String tag) {
        // Proxy to new ActionBar.newTab API
        mTab = activity.getActionBar().newTab();
        mTab.setText(tag);

        //下面这个也应该封装一下的，现在懒得做了，先这样吧。
        mTab.setTabListener(new ActionBar.TabListener() {
            @Override
            public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }

            @Override
            public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

            }
        });
    }

    public CompatTab setText(int resId) {
        // Proxy to new ActionBar.Tab.setText API
        mTab.setText(resId);
        return this;
    }

    @Override
    public Object getTab() {
        return mTab;
    }

    // Do the same for other properties (icon, callback, etc.)
}