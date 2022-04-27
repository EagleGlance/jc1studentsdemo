package com.noirix.domain;

@FunctionalInterface
public interface CustomOperation<T, U> {

    String process(T arg, U param);
}
