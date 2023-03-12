package com.djh.dm.singleton;

/**
 * 懒汉式
 * 虽然达到了按需初始化的目的，但是线程不安全
 * 可以通过synchronized解决，但是效率会下降
 */
public class Mgr04 {

    private static Mgr04 INSTANCE;

    private Mgr04 () {}

    private static synchronized Mgr04 getInstance(){
        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    /**
     * 测试
     * 同一个类的对象的hashCode值不同，说明不是同个对象
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}
