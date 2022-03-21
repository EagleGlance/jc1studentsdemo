package com.noirix.domain;

public class Computer extends HumanMadeObject {

    private int ram;

    public Computer() {
        System.out.println("In Computer Constructor");
    }

    public Computer(double weight, String someParam, int ram) {
        super(weight, someParam);
        this.ram = ram;
        System.out.println("In Computer Constructor with params");
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

        return ram == computer.ram;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + ram;
        return result;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", someParam='" + someParam + '\'' +
                ", weight=" + weight +
                "} " + super.toString();
    }
}
