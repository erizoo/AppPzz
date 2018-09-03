package by.pzz.erizo.apppzz.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;


import by.pzz.erizo.apppzz.di.ActivityContext;
import by.pzz.erizo.apppzz.di.PerScreen;
import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

@Module
public class ScreenModule {

    private final AppCompatActivity activity;

    public ScreenModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return activity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return activity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }


}
