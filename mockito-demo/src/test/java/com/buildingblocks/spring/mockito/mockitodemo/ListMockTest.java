package com.buildingblocks.spring.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListMockTest {

    @Mock
    List list;


    @Test
    public void getWithGivenIndex() {
        when(list.get(0)).thenReturn(20).thenReturn(30).thenReturn(40);
        assertEquals(20, list.get(0));
        assertEquals(30, list.get(0));
        assertEquals(40, list.get(0));
        assertEquals(40, list.get(0));
        assertEquals(null, list.get(2));
        assertEquals(40, list.get(0));
    }


    @Test
    public void processWithAnyInt() {
        when(list.get(Mockito.anyInt())).thenReturn(20).thenReturn(30);
        assertEquals(20, list.get(22));
        assertEquals(30, list.get(3));
        assertEquals(30, list.get(0));
        assertEquals(30, list.get(-1));
        assertEquals(30, list.get(222));
        assertEquals(30, list.get(02));
    }
}