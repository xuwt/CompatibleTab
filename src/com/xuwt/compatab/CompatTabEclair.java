package com.xuwt.compatab;

import android.app.Activity;

/**
 * Created by xuwt on 2014/12/9.
 */
public class CompatTabEclair extends CompatTab {

    protected Activity mActivity;

    private String mTag;
    public CompatTabEclair(Activity activity,String tag){
        this.mActivity=activity;
        this.mTag=tag;
    }
    // Store these properties in the instance,
    // as there is no ActionBar.Tab object.
    private CharSequence mText;

    public CompatTab setText(int resId) {
        // Our older implementation simply stores this
        // information in the object instance.
        mText = mActivity.getResources().getText(resId);
        return this;
    }

    @Override
    public Object getTab() {
        return mTag;
    }

    public CharSequence getText(){
        return mText;
    }

    // Do the same for other properties (icon, callback, etc.)
}
