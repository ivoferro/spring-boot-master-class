package com.buildingblocks.spring.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeServiceImplMockTest {

    @Test
    public void process() {
        SomeDao someDaoMock = mock(SomeDao.class);
        when(someDaoMock.getData()).thenReturn(10);
        SomeServiceImpl someService = new SomeServiceImpl(someDaoMock);
        assertEquals(20, someService.process());
    }

    @Test
    public void processAnother() {
        SomeDao someDaoMock = mock(SomeDao.class);
        when(someDaoMock.getData()).thenReturn(-10);
        SomeServiceImpl someService = new SomeServiceImpl(someDaoMock);
        assertEquals(0, someService.process());
    }
}