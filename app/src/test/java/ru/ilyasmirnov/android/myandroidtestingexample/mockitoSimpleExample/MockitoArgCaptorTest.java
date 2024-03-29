package ru.ilyasmirnov.android.myandroidtestingexample.mockitoSimpleExample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;

public class MockitoArgCaptorTest {

    @Mock
    List<String> mockedList;

    // С помощью каптора можем проверять значения аргументов.
    @Captor
    ArgumentCaptor<String> argCaptor;

    @Before
    public void initMocks() {
        // Необходимая инициализация
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseCaptorAnnotation_thenTheSam() {
        mockedList.add("one");
        Mockito.verify(mockedList).add(argCaptor.capture());

        assertEquals("one", argCaptor.getValue());
    }
}