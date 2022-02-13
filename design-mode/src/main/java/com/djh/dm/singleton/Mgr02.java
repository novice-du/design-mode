package com.djh.dm.singleton;

/**
 * 和Mgr01没区别，一样
 */
public class Mgr02 {

    private static final Mgr02 INSTANCE;

    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02 () {}

    private static Mgr02 getInstance(){
        return INSTANCE;
    }
}
