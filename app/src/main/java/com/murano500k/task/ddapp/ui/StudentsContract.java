/*
 * Copyright 2016, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.murano500k.task.ddapp.ui;

import com.murano500k.task.ddapp.BasePresenter;
import com.murano500k.task.ddapp.BaseView;
import com.murano500k.task.ddapp.data.json.Course;
import com.murano500k.task.ddapp.data.json.Student;

import java.util.List;

/**
 * This specifies the contract between the view and the presenter.
 */
public interface StudentsContract {

    interface View extends BaseView<Presenter> {
        void showError(String msg);
        void showStudents(List<Student> students);
        void showFilterButton(List<Course> courses);
    }

    interface Presenter extends BasePresenter {
        void setFiltering(Course course);
        void requestStudents(int offset);

    }
}
