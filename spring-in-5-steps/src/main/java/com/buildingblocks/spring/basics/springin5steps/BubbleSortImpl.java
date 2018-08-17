package com.buildingblocks.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortImpl implements Sort {

    @Override
    public int[] sort(int[] arr) {
        return new int[] {1, 2, 3};
    }

}
