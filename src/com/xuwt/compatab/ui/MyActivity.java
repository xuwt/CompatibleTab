package com.xuwt.compatab.ui;

import android.app.Activity;
import android.os.Bundle;
import com.xuwt.compatab.CompatTab;
import com.xuwt.compatab.R;
import com.xuwt.compatab.TabHelper;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TabHelper tabHelper = TabHelper.createInstance(this);
        tabHelper.setUp();
        CompatTab photosTab = tabHelper
                .newTab("photos")
                .setText(R.string.tab_photos);
        tabHelper.addTab(photosTab);
        CompatTab videosTab = tabHelper
                .newTab("videos")
                .setText(R.string.tab_videos);
        tabHelper.addTab(videosTab);

    }
}
