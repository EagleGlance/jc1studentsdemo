package com.noirix.util;

import com.noirix.domain.MaterialObject;

import java.util.List;

public class CollectionUtils {
    public static <T extends MaterialObject> void getListStats(List<T> list) {
        System.out.println(

                "List size is: " +
                        list.size() +
                        "\nIs list empty: " + list.isEmpty()
        );
    }
}
