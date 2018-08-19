package com.buildingblocks.spring.mockito.mockitodemo;

public class SomeServiceImpl {

    private SomeDao someDao;

    public SomeServiceImpl(SomeDao someDao) {
        this.someDao = someDao;
    }

    public int process() {
        return someDao.getData() + 10;
    }
}
