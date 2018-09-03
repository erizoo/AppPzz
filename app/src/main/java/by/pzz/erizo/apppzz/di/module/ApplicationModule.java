package by.pzz.erizo.apppzz.di.module;

import android.content.Context;

import javax.inject.Singleton;


import by.pzz.erizo.apppzz.AppPzz;
import by.pzz.erizo.apppzz.data.RepositoryManager;
import by.pzz.erizo.apppzz.data.RepositoryManagerImpl;
import by.pzz.erizo.apppzz.di.ApplicationContext;
import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private final AppPzz application;

    public ApplicationModule(AppPzz application) {
        this.application = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return application;
    }

    @Provides
    AppPzz provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    RepositoryManager provideRepositoryManager(RepositoryManagerImpl repositoryManager) {
        return repositoryManager;
    }
}

