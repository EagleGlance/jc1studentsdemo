package com.noirix;

import com.noirix.domain.Computer;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsTests {
    public static void main(String[] args) {

        Map<String, Computer> computers = new HashMap<>();
        computers.put("Slava", new Computer());
        computers.put("Slava", new Computer());
        computers.put("Slava2", new Computer());
        computers.put("Slava4", new Computer());
        computers.put("Yahoo!", new Computer());
        computers.put(null, new Computer(2, "asdasd", 123));
        computers.put(null, new Computer(3, "dfgdfg", 256));

        /*This is how we can show all pairs from Map*/
        for (String key : computers.keySet()) {
            System.out.println(key + " " + computers.get(key));
        }

        System.out.println(computers.values().size());

        System.out.println("LinkedHashMap realization");
        Map<String, Computer> computers2 = new LinkedHashMap<>();
        computers2.put("Slava", new Computer());
        computers2.put("Slava", new Computer());
        computers2.put("Slava2", new Computer());
        computers2.put("Slava4", new Computer());
        computers2.put("Yahoo!", new Computer());
        computers2.put(null, new Computer(2, "asdasd", 123));
        computers2.put(null, new Computer(3, "dfgdfg", 256));

        for (String key : computers2.keySet()) {
            System.out.println(key + " " + computers2.get(key));
        }

        System.out.println(computers2.values().size());

        Computer comp1 = new Computer(20, "Test Computer", 1);
        Computer comp2 = new Computer(20, "Test Computer", 2);
        Computer comp3 = new Computer(20, "Test Computer", 3);
        Computer comp4 = new Computer(20, "Test Computer", 4);
        Computer comp5 = new Computer(20, "Test Computer", 5555);
        Computer comp6 = new Computer(20, "Test Computer", 6);
        Computer comp7 = new Computer(20, "Test Computer", 7);
        Computer comp8 = new Computer(20, "Test Computer", 8);

        /*Sorted by key*/
        System.out.println("TreeMap realization");
        Map<String, Computer> computerComparison = new TreeMap<>();
        computerComparison.put("Computer1", comp1);
        computerComparison.put("Computer2", comp2);
        computerComparison.put("Computer3", comp3);
        computerComparison.put("Computer4", comp4);
        computerComparison.put("Computer5", comp5);
        computerComparison.put("Computer6", comp6);
        computerComparison.put("Computer7", comp7);
        computerComparison.put("Computer8", comp8);

        for (Map.Entry<String, Computer> stringComputerEntry : computerComparison.entrySet()) {
            System.out.println(stringComputerEntry.getKey() + " " + stringComputerEntry.getValue());
        }

        /*Necessary to add comparator to collection creation*/
        Set<Computer> setComputers = new TreeSet<>();
        setComputers.add(comp1);
        setComputers.add(comp2);
        setComputers.add(comp3);
        setComputers.add(comp4);
        setComputers.add(comp5);
        setComputers.add(comp6);
        setComputers.add(comp7);
        setComputers.add(comp8);

        for (Computer setComputer : setComputers) {
            System.out.println(setComputer);
        }
    }
}
