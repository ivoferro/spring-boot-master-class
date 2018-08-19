package com.buildingblocks.spring.basics.springin5steps.home;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class RentingServiceImplTest {

    @Mock
    RentingDao rentingDaoMock;

    @InjectMocks
    RentingServiceImpl rentingService;

    @Test
    public void getCheapest() {
        when(rentingDaoMock.getPricesInEuros()).thenReturn(new float[] {10, 20, 30});
        float expectedValue = 10;
        float actualValue = rentingService.getCheapest();
        assertEquals(expectedValue, actualValue, 0.001);
    }

    @Test(expected = IllegalStateException.class)
    public void getCheapestWithoutAnyHomeToRent() {
        when(rentingDaoMock.getPricesInEuros()).thenReturn(new float[] {});
        rentingService.getCheapest();
    }
}