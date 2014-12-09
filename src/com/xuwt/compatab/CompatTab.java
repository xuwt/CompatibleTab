package com.xuwt.compatab;

/**
 * Created by xuwt on 2014/12/9.
 */
public abstract class CompatTab {



    public abstract CompatTab setText(int resId);
    public abstract Object getTab();

    public abstract CharSequence getText();


    /**
     * 下面也可以实现一些比较复杂的tab
     */
   /* public abstract CompatTab setIcon(int resId);
    public abstract CompatTab setTabListener(
            CompatTabListener callback);
    public abstract CompatTab setFragment(Fragment fragment);

    public abstract CharSequence getText();
    public abstract Drawable getIcon();
    public abstract CompatTabListener getCallback();
    public abstract Fragment getFragment();*/
}
