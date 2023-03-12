package com.djh.dm.strategy;


/**
 * 乘坐火车
 */
public class TrainStrategy implements TravelStrategy<TrainStrategy> {

    @Override
    public void travelAlgorithm() {
        System.out.println("乘坐火车。。。");
    }
}
