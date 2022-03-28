package com.noirix.domain;

public class Computer extends HumanMadeObject {

    private int ram;
    private Connectors connectors = Connectors.USB_3_0;

    public Computer() {
        System.out.println("In Computer Constructor");
    }

    public Computer(double weight, String someParam, int ram) {
        super(weight, someParam);
        this.ram = ram;
        System.out.println("In Computer Constructor with params");
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Connectors getConnectors() {
        return connectors;
    }

    public void setConnectors(Connectors connectors) {
        this.connectors = connectors;
    }

    @Override
    public void someBehaviour() {
        System.out.println("Inside someBehaviour computer");
    }

    @Override
    public void parentBehaviour() {
        System.out.println("Inside parentBehaviour computer");
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
