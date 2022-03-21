package com.noirix.data;

import com.noirix.util.DataUtil;
import com.noirix.util.TestJavaUtil;

import java.util.Arrays;

import static com.noirix.util.DataUtil.showData;

public class Test {
    public static void main(String ... args) {

        Data data = new Data();
        Data data1 = new Data();

//        System.out.println("Before using setters");
//        System.out.println(data.getValue());
//        System.out.println(data.getText());
//
//        data.setValue(1000);
//        data.setText("Set text in action!");
//
//        System.out.println("\nAfter using setters");
//        System.out.println(data.getValue());
//        System.out.println(data.getText());
//
//        System.out.println("*********************");
//        System.out.println(data1.getValue());
//        System.out.println(data1.getText());
//
        System.out.println(TestJavaUtil.processSomeString("ASDFGHJK"));

        System.out.println(data.hashCode());
        System.out.println(data1.hashCode());

        System.out.println(data);

        System.out.println(Data.commonValue);
        Data.commonValue = 888;

        System.out.println(data.commonValue);

        data.commonValue = 1111;
        System.out.println(data1.commonValue);
        System.out.println(data.commonValue);
        System.out.println(Data.commonValue);

        data.someMethod();

        Data data2 = new Data();
        data2.someMethod();

        MyFirstInterface data3 = new Data();
        data3.someMethod();
        data3.functionality();

        MySecondInterface l2 = (MySecondInterface) data3;
        l2.someTextFunctionality("ASDFGHJKL;");

        MySecondInterface data4 = new Data();
        data4.someTextFunctionality("ASDFGHJKL");

        Data[] dataArray = DataUtil.generateData(10);
        System.out.println("Before sorting");
        showData(dataArray);
        //Necessary to implements Comparable, Comparator will be used in Collections API
        Arrays.sort(dataArray);

        System.out.println("After sorting");
        showData(dataArray);

    }
}
