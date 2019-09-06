package ru.ilyasmirnov.android.myandroidtestingexample.mockitoSimpleExample;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MockitoMockTest {

    @Mock
    List<String> mockedList;

    @Before
    public void initMocks() {
        // Необходимая инициализация
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseMockAnnotation_thenMockIsInjected() {

        mockedList.add("one");
        // Вызываем методы определенные в интерфейсе
        // Mockito.verify(mockedList).add("1");
        Mockito.verify(mockedList).add("one");

        // Так как это пустая заглушка, то размер не увеличивается
        assertEquals(0, mockedList.size());

        when(mockedList.size()).thenReturn(100);
        assertEquals(100, mockedList.size());
        // То же самое, но с hamcrest'ом
        assertThat(mockedList.size(), is(100));
    }
}