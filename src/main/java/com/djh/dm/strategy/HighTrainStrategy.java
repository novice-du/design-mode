package com.djh.dm.strategy;

/**
 * 乘坐高铁
 */
public class HighTrainStrategy implements TravelStrategy<HighTrainStrategy> {

    @Override
    public void travelAlgorithm() {
        System.out.println("乘坐高铁。。。");
    }
}
