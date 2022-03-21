package com.noirix.domain;

public abstract class MaterialObject {
    protected double weight;

    public MaterialObject() {
        System.out.println("In MaterialObject Constructor");
    }

    public MaterialObject(double weight) {
        this.weight = weight;
        System.out.println("In MaterialObject Constructor with params");
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MaterialObject that = (MaterialObject) o;

        return Double.compare(that.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(weight);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "MaterialObject{" +
                "weight=" + weight +
                '}';
    }

    public abstract void parentBehaviour();
}
