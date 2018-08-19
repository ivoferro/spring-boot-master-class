package com.buildingblocks.spring.basics.springin5steps.home;

import org.springframework.stereotype.Repository;

@Repository
public class RentingDaoImpl implements RentingDao {
    @Override
    public float[] getPricesInEuros() {
        return new float[] {450, 500, 550};
    }
}
