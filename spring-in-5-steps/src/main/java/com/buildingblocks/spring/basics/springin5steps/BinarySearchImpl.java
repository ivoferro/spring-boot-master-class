package com.buildingblocks.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl implements Search {

    @Autowired
    Sort sortAlgorithm;

    @Override
    public int search(int[] array, int numberToSearch) {
        return sortAlgorithm.sort(array)[0];
    }

}
