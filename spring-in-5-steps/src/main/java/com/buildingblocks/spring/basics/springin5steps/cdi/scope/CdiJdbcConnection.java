package com.buildingblocks.spring.basics.springin5steps.cdi.scope;

import javax.inject.Named;

@Named
public class CdiJdbcConnection {

    public CdiJdbcConnection() {
        System.out.println("CDI JDBC Connection");
    }

}
