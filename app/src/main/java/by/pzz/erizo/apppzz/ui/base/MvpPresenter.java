package by.pzz.erizo.apppzz.ui.base;

import by.pzz.erizo.apppzz.data.RepositoryManager;
import io.reactivex.disposables.CompositeDisposable;

public interface MvpPresenter<V> {

    void onAttach(V mvpView);

    void onDetach();

    void onDestroy();

    CompositeDisposable getCompositeDisposable();

    V getMvpView();

    RepositoryManager getRepositoryManager();

}
