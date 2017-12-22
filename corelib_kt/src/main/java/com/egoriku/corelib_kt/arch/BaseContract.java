package com.egoriku.corelib_kt.arch;

import android.arch.lifecycle.Lifecycle;
import android.os.Bundle;

public interface BaseContract {

    interface View {
    }

    interface Presenter<V extends BaseContract.View> {

        Bundle getStateBundle();

        void attachLifecycle(Lifecycle lifecycle);
        void detachLifecycle(Lifecycle lifecycle);

        void attachView(V view);
        void detachView();

        V getView();

        boolean isViewAttached();

        void onPresenterCreated();
        void onPresenterDestroy();
    }
}
