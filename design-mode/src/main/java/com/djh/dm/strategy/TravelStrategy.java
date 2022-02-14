package com.djh.dm.strategy;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author: dujunhua
 * @create: 2022/02/14 21:49
 * @description:
 */
@FunctionalInterface
public interface TravelStrategy<T> {

    void travelAlgorithm();
}
