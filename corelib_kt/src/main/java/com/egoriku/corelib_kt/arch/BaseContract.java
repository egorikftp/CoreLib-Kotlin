package com.egoriku.corelib_kt.arch;

/**
 * Copyright (C) 2018 egorikftp
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
