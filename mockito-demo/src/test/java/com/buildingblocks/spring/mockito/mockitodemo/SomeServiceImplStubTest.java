package com.buildingblocks.spring.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SomeServiceImplStubTest {

    @Test
    public void processWithStub() {
        SomeServiceImpl someService = new SomeServiceImpl(new SomeDaoStub());
        assertEquals(60, someService.process());
    }

    @Test
    public void processWithAnotherStub() {
        SomeServiceImpl someService = new SomeServiceImpl(new AnotherSomeDaoStub());
        assertEquals(-40, someService.process());
    }
}

class SomeDaoStub implements SomeDao {
    @Override
    public int getData() {
        return 50;
    }
}

class AnotherSomeDaoStub implements SomeDao {
    @Override
    public int getData() {
        return -50;
    }
}