package com.noirix.data;

import com.noirix.domain.Computer;
import com.noirix.domain.HumanMadeObject;

import java.io.Serializable;

public class CommonLogic {
    public <T extends Computer> String someLogic(T obj) {
        return obj.getRam() + "" + obj.getConnectors();
    }

    public String someLogic(String obj) {

        class LocalMethod extends HumanMadeObject implements Serializable {
            private String str;
            private int value;

            public LocalMethod(String str, int value) {
                this.str = str;
                this.value = value;
            }

            public String getStr() {
                return str;
            }

            public void setStr(String str) {
                this.str = str;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }

            @Override
            public void someBehaviour() {

            }

            @Override
            public void parentBehaviour() {

            }
        }

        LocalMethod localMethod = new LocalMethod(obj, 123123) {
            @Override
            public String toString() {
                return "ho ho ho!";
            }
        };
        System.out.println(localMethod.getStr());
        System.out.println(localMethod.getValue());

        return obj.toUpperCase();
    }

    public static void main(String[] args) {
        CommonLogic commonLogic = new CommonLogic();
        System.out.println(commonLogic.someLogic(new Computer()));
        System.out.println(commonLogic.someLogic("sdfghjkl;"));
    }
}
