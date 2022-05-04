package com.noirix.domain;

import com.noirix.reflection.CustomAnnotation;
import com.noirix.reflection.NotNullCustomAnnotation;

import java.util.Comparator;

public class Computer extends HumanMadeObject implements Comparator<Computer> {

    /*Lowest volume of RAM for computers in our system*/
    private static final int DEFAULT_RAM = 8;

    private static final Connectors DEFAULT_CONNECTOR = Connectors.USB_3_0;

    @NotNullCustomAnnotation
    @CustomAnnotation
    private int ram;
    @NotNullCustomAnnotation
    @CustomAnnotation
    private Connectors connectors;

    public Computer() {
        //System.out.println("In Computer Constructor");
        ram = DEFAULT_RAM;
        connectors = DEFAULT_CONNECTOR;
    }

    public Computer(double weight, String someParam, int ram) {
        super(weight, someParam);
        this.ram = ram;
        //System.out.println("In Computer Constructor with params");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        System.out.println("inside setRam method");
        this.ram = ram;
    }

    public Connectors getConnectors() {
        return connectors;
    }

    public void setConnectors(Connectors connectors) {
        this.connectors = connectors;
    }

    /*
     * throws RuntimeException if we call this method
     * */
    @Override
    @Deprecated
    public void someBehaviour() {

        System.out.println("Inside someBehaviour computer");
        throw new RuntimeException(); //analog some code with problems

    }

    @Override
    public void parentBehaviour() {
        System.out.println("Inside parentBehaviour computer");
    }

    @Override
    public int compare(Computer o1, Computer o2) {
        return Integer.compare(o1.getRam(), o2.getRam());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Computer computer = (Computer) o;

        if (ram != computer.ram) return false;
        return connectors == computer.connectors;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ram;
        result = 31 * result + (connectors != null ? connectors.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", connectors=" + connectors +
                "} " + super.toString();
    }
}
