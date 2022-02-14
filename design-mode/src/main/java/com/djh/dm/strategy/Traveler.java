package com.djh.dm.strategy;

/**
 * 环境类实现
 */
public class Traveler {

    /**
     * 出行策略接口
     */
    TravelStrategy travelStrategy;

    /**
     * 设置出行策略
     */
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    /**
     * 为当前用户设置出行策略
     */
    public void travelStyle(){
        travelStrategy.travelAlgorithm();
    }


    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.setTravelStrategy(new AirStrategy());
        //traveler.setTravelStrategy(new HighTrainStrategy());
        //traveler.setTravelStrategy(new TrainStrategy());

        traveler.travelStyle();
    }

}
