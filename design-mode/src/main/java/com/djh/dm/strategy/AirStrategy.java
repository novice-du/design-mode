package com.djh.dm.strategy;

/**
 * 坐飞机
 */
public class AirStrategy implements TravelStrategy<AirStrategy>{
    @Override
    public void travelAlgorithm() {
        System.out.println("坐飞机。。。");
    }
}
