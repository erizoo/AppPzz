package by.pzz.erizo.apppzz.ui.base;

import android.content.Context;

public interface MvpView {

    Context getContext();

    void startScreen(Class activity, boolean isCleatTop);

}
