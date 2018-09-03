package by.pzz.erizo.apppzz.di.component;

import android.content.Context;

import javax.inject.Singleton;


import by.pzz.erizo.apppzz.AppPzz;
import by.pzz.erizo.apppzz.data.RepositoryManager;
import by.pzz.erizo.apppzz.di.ApplicationContext;
import by.pzz.erizo.apppzz.di.module.ApiModule;
import by.pzz.erizo.apppzz.di.module.ApplicationModule;
import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModule.class})
public interface ApplicationComponent {

    void inject(AppPzz application);

    @ApplicationContext
    Context context();

    RepositoryManager getRepositoryManager();

}

