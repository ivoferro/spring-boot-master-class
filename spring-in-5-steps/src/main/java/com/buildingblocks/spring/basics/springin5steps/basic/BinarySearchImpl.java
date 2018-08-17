package com.buildingblocks.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BinarySearchImpl implements Search {

    @Autowired
    Sort sortAlgorithm;

    @Override
    public int search(int[] array, int numberToSearch) {
        return sortAlgorithm.sort(array)[0];
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("POST CONSTRUCT HERE");
    }

    @PreDestroy
    public void PreDestroy() {
        System.out.println("PRE DESTROY HERE");
    }

}
