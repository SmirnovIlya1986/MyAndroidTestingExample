package ru.ilyasmirnov.android.myandroidtestingexample.emailValidator;

import android.view.View;

import androidx.test.core.app.ActivityScenario;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowView;

import ru.ilyasmirnov.android.myandroidtestingexample.MainActivity;
import ru.ilyasmirnov.android.myandroidtestingexample.R;

import static org.junit.Assert.*;

@RunWith(RobolectricTestRunner.class)
// @Config(shadows = {MyShadowView.class})
public class RobolectricShadowTest {

    // Чтобы тест проходил добавил в build.gradle (Module: app) строки :
    // testOptions.unitTests.includeAndroidResources = true
    // Поменял targetSdkVersion 29 на 28
    // В LocatrRepo compileSdkVersion 28, targetSdkVersion 26

    ActivityScenario<MainActivity> activityScenario;
    @Before
    public void setUp() {
        activityScenario = ActivityScenario.launch(MainActivity.class);
    }

    @Test
    public void settingsClick() {
        MainActivity mainActivity = Robolectric.setupActivity(MainActivity.class);
        View viewById = mainActivity.findViewById(R.id.settings);
        ShadowView.dump(viewById);
        ShadowView.clickOn(viewById);
    }
}