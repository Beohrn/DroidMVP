/*
 * Copyright (C) 2016 Appflate.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package io.appflate.droidvmp.androidsample.ui.mvpviews;

import io.appflate.droidmvp.DroidMVPView;
import io.appflate.droidvmp.androidsample.model.Repository;
import java.util.List;

/**
 * Created by andrzejchm on 22/06/16.
 */
public interface RepositoriesView extends DroidMVPView {
    void showTitle(String username);

    void showLoadingProgress();

    void showRepositoriesList(List<Repository> repositories);

    void showRepositoriesFetchError();
}
