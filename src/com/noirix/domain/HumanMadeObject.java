package com.noirix.domain;

import java.io.Serializable;

public abstract class HumanMadeObject extends MaterialObject implements Cloneable, Serializable {
    protected String someParam;

    public HumanMadeObject() {
        weight = 10;
        someParam = "aasdasd";
        //System.out.println("In HumanMadeObject Constructor");
    }

    public HumanMadeObject(double weight, String someParam) {
        super(weight);

        this.someParam = someParam;

        //System.out.println("In HumanMadeObject Constructor with params");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        HumanMadeObject that = (HumanMadeObject) o;

        return someParam.equals(that.someParam);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + someParam.hashCode();
        return result;
    }

    public abstract void someBehaviour();
}
