package com.xuwt.compatab;

import android.app.Activity;
import android.widget.TabHost;

/**
 * Created by xuwt on 2014/12/9.
 */
public class TabHelperEclair extends TabHelper {
    private TabHost mTabHost;

    protected Activity mActivity;

    public TabHelperEclair(Activity activity){
        this.mActivity=activity;
    }
    public void setUp() {
        if (mTabHost == null) {
            // Our activity layout for pre-Honeycomb devices
            // must contain a TabHost.
            mTabHost = (TabHost) mActivity.findViewById(
                    android.R.id.tabhost);
            mTabHost.setup();
        }
    }

    @Override
    public CompatTab newTab(String tag) {
        return new CompatTabEclair(mActivity,tag);
    }

    public void addTab(CompatTab tab) {
        TabHost.TabSpec spec = mTabHost
                .newTabSpec((String) tab.getTab())
                .setIndicator(tab.getText()); // And optional icon
        mTabHost.addTab(spec);
    }


    // The other important method, newTab() is part of
    // the base implementation.
}
