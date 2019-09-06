package ru.ilyasmirnov.android.myandroidtestingexample.emailValidator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

import ru.ilyasmirnov.android.myandroidtestingexample.R;

/**
 * {@link Activity} с формой, где пользователь может ввести свои данные,
 * имя, дату рождения, email. Персональная информация может быть сохранена в {@link SharedPreferences}
 * нажатием на кнопку.
 */

public class SettingsActivity extends AppCompatActivity {

    // Logger for this class.
    private static final String TAG = "SettingsActivity";

    // The helper that manages writing to SharedPreferences.
    private SharedPreferencesHelper mSharedPreferencesHelper;

    // The input field where the user enters his name.
    private EditText mNameText;

    // The date picker where the user enters his date of birth.
    private DatePicker mDobPicker;

    // The input field where the user enters his email.
    private EditText mEmailText;

    // The validator for the email input field.
    private EmailValidator mEmailValidator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings_activity);
    }
}
