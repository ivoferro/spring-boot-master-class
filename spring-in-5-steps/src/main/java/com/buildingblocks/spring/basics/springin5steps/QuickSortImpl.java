package com.buildingblocks.spring.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortImpl implements Sort {

    @Override
    public int[] sort(int[] arr) {
        return new int[] {4, 5, 6};
    }

}
