package com.buildingblocks.spring.basics.springin5steps.basic;

import com.buildingblocks.spring.basics.springin5steps.SpringBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBasicApplication.class)
public class BinarySearchImplTest {

    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {
        int expectedResult = 4;
        int result = binarySearch.search(new int[] {1, 2, 3}, 1);
        assertEquals(expectedResult, result);
    }

}