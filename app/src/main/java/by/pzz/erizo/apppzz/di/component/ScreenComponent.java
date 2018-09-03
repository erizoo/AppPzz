package by.pzz.erizo.apppzz.di.component;

import by.pzz.erizo.apppzz.MainActivity;
import by.pzz.erizo.apppzz.di.PerScreen;
import by.pzz.erizo.apppzz.di.module.ScreenModule;
import dagger.Component;

@PerScreen
@Component(modules = ScreenModule.class, dependencies = ApplicationComponent.class)
public interface ScreenComponent {

    void inject(MainActivity activity);

}
