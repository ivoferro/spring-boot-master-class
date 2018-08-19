package com.buildingblocks.spring.basics.springin5steps.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentingServiceImpl implements RentingService {

    @Autowired
    RentingDao rentingDao;

    @Override
    public float getCheapest() {
        float[] rentingPrices = rentingDao.getPricesInEuros();
        if (rentingPrices.length == 0) {
            throw new IllegalStateException("There are no homes to rent");
        }

        float cheapest = Float.MAX_VALUE;
        for (float price : rentingPrices) {
            if (price < cheapest) {
                cheapest = price;
            }
        }

        return cheapest;
    }
}
