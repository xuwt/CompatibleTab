package com.xuwt.compatab;

import android.app.ActionBar;
import android.app.Activity;

/**
 * Created by xuwt on 2014/12/9.
 */
public class TabHelperHoneycomb extends TabHelper {
    ActionBar mActionBar;

    protected Activity mActivity;

    public TabHelperHoneycomb(Activity activity){
        this.mActivity=activity;
    }
    public void setUp() {
        if (mActionBar == null) {
            mActionBar = mActivity.getActionBar();
            mActionBar.setNavigationMode(
                    ActionBar.NAVIGATION_MODE_TABS);
        }
    }

    @Override
    public CompatTab newTab(String tag) {
        return new CompatTabHoneycomb(mActivity,tag);
    }

    public void addTab(CompatTab tab) {
        // Tab is a CompatTabHoneycomb instance, so its
        // native tab object is an ActionBar.Tab.
        mActionBar.addTab((ActionBar.Tab) tab.getTab());
    }

    // The other important method, newTab() is part of
    // the base implementation.
}
