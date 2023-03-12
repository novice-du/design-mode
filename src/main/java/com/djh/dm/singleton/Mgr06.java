package com.djh.dm.singleton;

/**
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类的时候不会加载内部类，这样可以实现懒加载
 */
public class Mgr06 {

    private Mgr06 () {}

    private static class Mgr06Holder{
        private static final Mgr06 INSTANCE = new Mgr06();
    }

    private static Mgr06 getInstance(){
        return Mgr06Holder.INSTANCE;
    }

    /**
     * 测试
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(Mgr06.getInstance().hashCode())
            ).start();
        }
    }
}
