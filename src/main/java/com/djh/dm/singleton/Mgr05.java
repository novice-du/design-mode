package com.djh.dm.singleton;

/**
 * 双重检查锁
 */
public class Mgr05 {

    private static volatile Mgr05 INSTANCE;

    private Mgr05 () {}

    private static Mgr05 getInstance(){
        if (INSTANCE == null) {
            synchronized (Mgr05.class){
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr05();
                }
            }
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
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }
    }
}
