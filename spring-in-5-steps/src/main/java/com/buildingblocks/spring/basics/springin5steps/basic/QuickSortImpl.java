package com.buildingblocks.spring.basics.springin5steps.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class QuickSortImpl implements Sort {

    @Override
    public int[] sort(int[] arr) {
        return new int[] {4, 5, 6};
    }

}
