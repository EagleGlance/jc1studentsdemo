package com.noirix;

import com.noirix.data.Data;
import com.noirix.domain.CustomOperation;
import com.noirix.util.TestJavaUtil;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasTest {
    public static void main(String[] args) {
        Runnable r = () -> {
            System.out.println("We are trying to print something inside lambda");
            System.out.println("hello world");
        };

        Consumer<Integer> numberSquare = TestJavaUtil::printObject; //method reference
        Consumer<Data> dataConsumer = (object) -> System.out.println(object.getValue() + object.getText());

        BiConsumer<Integer, String> biConsumer = (x, y) -> System.out.println(x + " : " + y);

        CustomOperation<String, Data> customOperation = (x, y) -> x.toUpperCase() + "___" + y.getText();

        Predicate<String> checkStringLengthPredicate = (s) -> s.length() > 10;

        numberSquare.accept(10);

        dataConsumer.accept(new Data());
        dataConsumer.accept(new Data());

        biConsumer.accept(10, "20");

//        Thread thread = new Thread(r);
//        thread.start();

        someLogic("sdfghjk,mnbvcxcvbnm,", checkStringLengthPredicate, numberSquare, dataConsumer);

        System.out.println("\n\n");
        System.out.println("Test custom Functional interface implementation");
        System.out.println(customOperation.process("hello", new Data()));
    }

    public static void someLogic(String dataToProcess, Predicate<String> data, Consumer<Integer> first, Consumer<Data> dataConsumer) {
        if (data.test(dataToProcess)) {
            dataConsumer.accept(new Data());
        } else {
            first.accept(100);
        }
    }
}
