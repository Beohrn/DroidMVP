/*
 * Copyright (C) 2016 Appflate.io
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.appflate.droidvmp.androidsample.di;

import dagger.Component;
import io.appflate.droidvmp.androidsample.domain.GithubApi;
import io.appflate.droidvmp.androidsample.ui.activities.MainActivity;
import io.appflate.droidvmp.androidsample.ui.activities.RepositoriesActivity;
import io.appflate.droidvmp.androidsample.ui.fragments.RepositoriesFragment;
import javax.inject.Singleton;

/**
 * Created by andrzejchm on 23/04/16.
 */
@Singleton @Component(modules = { AppModule.class }) public interface AppComponent {
    GithubApi getRestService();

    void inject(MainActivity mainActivity);

    void inject(RepositoriesActivity repositoriesActivity);

    void inject(RepositoriesFragment repositoriesFragment);
}
