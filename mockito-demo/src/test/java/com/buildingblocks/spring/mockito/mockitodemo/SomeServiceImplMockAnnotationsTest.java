package com.buildingblocks.spring.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeServiceImplMockAnnotationsTest {

    @Mock
    SomeDao someDaoMock;

    @InjectMocks
    SomeServiceImpl someService;

    @Test
    public void process() {
        when(someDaoMock.getData()).thenReturn(50);
        assertEquals(60, someService.process());
    }

    @Test
    public void processWithAnotherStub() {
        when(someDaoMock.getData()).thenReturn(-50);
        assertEquals(-40, someService.process());
    }
}