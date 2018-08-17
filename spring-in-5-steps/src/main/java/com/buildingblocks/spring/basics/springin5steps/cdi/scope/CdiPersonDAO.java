package com.buildingblocks.spring.basics.springin5steps.cdi.scope;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CdiPersonDAO {

    @Inject
    private CdiJdbcConnection cdiJdbcConnection;

    public CdiJdbcConnection getCdiJdbcConnection() {
        return cdiJdbcConnection;
    }
}
