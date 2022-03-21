package com.noirix.util;

import com.noirix.data.Data;

import java.util.Random;

public class DataUtil {
    public static Data[] generateData(int count) {
        Data[] result = new Data[count];
        Random random = new Random();

        for (int i = 0; i < result.length; i++) {
            result[i] = new Data(random.nextInt());
        }

        return result;
    }

    public static void showData(Data[] array) {
        for (Data data : array) {
            System.out.println(data);
        }
    }
}
