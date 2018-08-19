package com.buildingblocks.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Service;

@Service
public class BubbleSortImpl implements Sort {

    @Override
    public int[] sort(int[] arr) {
        return new int[] {1, 2, 3};
    }

}
