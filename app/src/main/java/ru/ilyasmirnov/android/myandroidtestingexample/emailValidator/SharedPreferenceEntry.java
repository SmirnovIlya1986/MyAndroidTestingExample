/*
 * Copyright 2015, The Android Open Source Project
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

package ru.ilyasmirnov.android.myandroidtestingexample.emailValidator;


import java.util.Calendar;

/**
 * POJO для хранения всех данных о пользователе в одном месте.
 */
public class SharedPreferenceEntry {

    // Имя пользователя.
    private final String mName;

    // Дата рождения.
    private final Calendar mDateOfBirth;

    // Email.
    private final String mEmail;

    public SharedPreferenceEntry(String name, Calendar dateOfBirth, String email) {
        mName = name;
        mDateOfBirth = dateOfBirth;
        mEmail = email;
    }

    public String getName() {
        return mName;
    }

    public Calendar getDateOfBirth() {
        return mDateOfBirth;
    }

    public String getEmail() {
        return mEmail;
    }

}
