package com.djh.dm.singleton;

/**
 * 不仅可以解决线程同步，还可以防止反序列化
 * 枚举没有构造方法，根据class文件反序列化时，得到的也是INSTANCE这个已经实例化后的对象
 * 最完美写法
 */
public enum Mgr07 {

    INSTANCE;

    /**
     * 业务逻辑
     */
    public void m () {}

    /**
     * 测试
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->
                    System.out.println(Mgr07.INSTANCE.hashCode())
            ).start();
        }
    }
}
