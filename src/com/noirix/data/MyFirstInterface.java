package com.noirix.data;

public interface MyFirstInterface {

    public static final String SOME_INTERFACE_CONSTANT = "Constant!";

    /*This method does something amazing! Can convert, dance and blabla bla
    * */
    public abstract void someMethod();

    default void functionality() {
        System.out.println("In default method in interface");
    }
}
