package com.noirix.data;

import com.noirix.domain.Computer;

/* K - key of object, will be unique
    V - value of object, can be Integer, or different object with Integer field
    T - type of some field that should be used
* */

public class CommonData <K extends Number, V> { //not more than 4 types per class
    private K id;
    private V name;

    public CommonData() {
    }

    public CommonData(K id, V name) {
        this.id = id;
        this.name = name;
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        this.id = id;
    }

    public V getName() {
        return name;
    }

    public void setName(V name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        //? - wildcard,
        CommonData<?, ?> that = (CommonData<?, ?>) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CommonData{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
