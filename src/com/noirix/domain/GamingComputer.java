package com.noirix.domain;

public class GamingComputer extends Computer {
    private String gpu;

    public GamingComputer() {
    }

    public GamingComputer(String gpu) {
        this.gpu = gpu;
    }

    public GamingComputer(double weight, String someParam, int ram, String gpu) {
        super(weight, someParam, ram);
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GamingComputer that = (GamingComputer) o;

        return gpu != null ? gpu.equals(that.gpu) : that.gpu == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (gpu != null ? gpu.hashCode() : 0);
        return result;
    }

    @Override
    public void someBehaviour() {
        System.out.println("Inside someBehaviour Gaming computer");
    }

    @Override
    public void parentBehaviour() {
        System.out.println("Inside parentBehaviour Gaming computer");
    }
}
