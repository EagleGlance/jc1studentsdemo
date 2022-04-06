import com.noirix.domain.Computer;
import com.noirix.util.CollectionUtils;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        ArrayList<Computer> objects = new ArrayList<>();

        for (int i = 0; i < 100000000; i++) {
            objects.add(new Computer());
        }

        long finish = System.currentTimeMillis();
        long result = finish - start;
        System.out.println("It takes " + result + " ms");

        LinkedList<Computer> linkedList = new LinkedList<>();
        start = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            linkedList.add(new Computer());
        }

        finish = System.currentTimeMillis();
        result = finish - start;
        System.out.println("It takes " + result + " ms");


        CollectionUtils.getListStats(objects);
        CollectionUtils.getListStats(linkedList);


    }
}
