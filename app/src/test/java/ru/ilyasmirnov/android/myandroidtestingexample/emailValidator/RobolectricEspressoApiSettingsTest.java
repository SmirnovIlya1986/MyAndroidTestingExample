package ru.ilyasmirnov.android.myandroidtestingexample.emailValidator;

import androidx.test.espresso.intent.Intents;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.ilyasmirnov.android.myandroidtestingexample.MainActivity;
import ru.ilyasmirnov.android.myandroidtestingexample.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

// build.gradle (Module: app) dependencies { testImplementation 'androidx.test:runner:1.1.1' }
@RunWith(AndroidJUnit4.class)
public class RobolectricEspressoApiSettingsTest {
    @Rule
    public ActivityTestRule<MainActivity> rule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void settingsButtonClick() {

        // build.gradle (Module: app) dependencies { testImplementation 'androidx.test.espresso:espresso-intents:3.1.1' }
        Intents.init();
        onView(withId(R.id.settings)).perform(click());
        intended(hasComponent(SettingsActivity.class.getName()));
    }
}