package by.pzz.erizo.apppzz;

import android.app.Application;

import by.pzz.erizo.apppzz.di.component.ApplicationComponent;
import by.pzz.erizo.apppzz.di.component.DaggerApplicationComponent;
import by.pzz.erizo.apppzz.di.module.ApplicationModule;


public class AppPzz extends Application {


    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();
        applicationComponent.inject(this);
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
