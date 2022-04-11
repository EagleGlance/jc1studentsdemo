package com.noirix;

import com.noirix.domain.Computer;

public class ExceptionTests {
    public static void main(String[] args) {

        Computer comp = null;
        try {
            comp = new Computer();
        } catch (Exception e) {
            System.out.println(" We are inside catch");
        }

        System.out.println(comp.getRam());


    }
}
