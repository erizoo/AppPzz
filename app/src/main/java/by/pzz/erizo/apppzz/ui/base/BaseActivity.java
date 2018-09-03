package by.pzz.erizo.apppzz.ui.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import by.pzz.erizo.apppzz.AppPzz;
import by.pzz.erizo.apppzz.di.component.DaggerScreenComponent;
import by.pzz.erizo.apppzz.di.component.ScreenComponent;
import by.pzz.erizo.apppzz.di.module.ScreenModule;
import io.reactivex.disposables.CompositeDisposable;

public abstract class BaseActivity extends AppCompatActivity implements MvpView {

    @Inject
    CompositeDisposable compositeDisposable;
    ScreenComponent screenComponent;

    private Unbinder unbinder;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
        unbinder = ButterKnife.bind(this);
        screenComponent = DaggerScreenComponent.builder()
                .screenModule(new ScreenModule(this))
                .applicationComponent(((AppPzz) getApplication()).getApplicationComponent())
                .build();

    }

    protected abstract int getContentView();

    public ScreenComponent getScreenComponent(){
        return screenComponent;
    }

    @Override
    public Context getContext() {
        return getApplicationContext();
    }


    @Override
    protected void onDestroy() {
        unbinder.unbind();
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        super.onDestroy();
    }

    @Override
    public void startScreen(Class activity, boolean isClearTop) {
        startActivity(new Intent(this, activity));
        if (isClearTop) finishAffinity();
    }

    public CompositeDisposable getCompositeDisposable() {
        return compositeDisposable;
    }

}
