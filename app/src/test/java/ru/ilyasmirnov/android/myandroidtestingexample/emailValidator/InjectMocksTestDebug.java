package ru.ilyasmirnov.android.myandroidtestingexample.emailValidator;

import android.content.SharedPreferences;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Calendar;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InjectMocksTestDebug {

    static final String KEY_NAME = "key_name";
    static final String KEY_DOB = "key_dob_millis";
    static final String KEY_EMAIL = "key_email";

    private static final String TEST_NAME = "Test name";

    private static final String TEST_EMAIL = "test@email.com";

    private static final Calendar TEST_DATE_OF_BIRTH = Calendar.getInstance();

    static {
        TEST_DATE_OF_BIRTH.set(1980, 1, 1);
    }

    @Mock
    SharedPreferences mMockSharedPreferences;

    @Before
    public void initMocks() {
        // Необходимая инициализация
        MockitoAnnotations.initMocks(this);
    }


    @Test
    // private void createMockSharedPreference() {
    public void createMockSharedPreference() {

        when(mMockSharedPreferences.getString(eq(KEY_NAME), anyString()))
                .thenReturn(TEST_NAME);
        when(mMockSharedPreferences.getString(eq(KEY_EMAIL), anyString()))
                .thenReturn(TEST_EMAIL);
        when(mMockSharedPreferences.getLong(eq(KEY_DOB), anyLong()))
                .thenReturn(TEST_DATE_OF_BIRTH.getTimeInMillis());

        String savedName = mMockSharedPreferences.getString(eq(KEY_NAME), anyString());

        String savedEmail = mMockSharedPreferences.getString(eq(KEY_EMAIL), anyString());

        long savedCalendarToLong = mMockSharedPreferences.getLong(eq(KEY_DOB), anyLong());

        /*
        assertThat("Checking that SharedPreferenceEntry.name has been persisted and read correctly",
                TEST_NAME,
                is(equalTo(mMockSharedPreferences.getString(eq(KEY_NAME), anyString()))));

        assertThat("Checking that SharedPreferenceEntry.dateOfBirth has been persisted and read "
                        + "correctly",
                TEST_DATE_OF_BIRTH.getTimeInMillis(),
                is(equalTo(mMockSharedPreferences.getLong(eq(KEY_DOB), anyLong()))));

        assertThat("Checking that SharedPreferenceEntry.email has been persisted and read "
                        + "correctly",
                TEST_EMAIL,
                is(equalTo(mMockSharedPreferences.getString(eq(KEY_EMAIL), anyString()))));
            */






        /*
        // Mocking a successful commit.
        when(mMockEditor.commit()).thenReturn(true);

        // Return the MockEditor when requesting it.
        when(mMockSharedPreferences.edit()).thenReturn(mMockEditor);
        */

    }



}