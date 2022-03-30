package com.noirix.inner;

public class Outer {
    private static int count = 10;
    private String str;
    private int value;

    public Outer() {
    }

    public Outer(String str, int value) {
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

    public static class InnerStatic {
        public static void someStaticLogic() {
            count++;
            Outer outer = new Outer();
        }
    }

    public class Inner {
        public static final String SOME_INNER_CONSTANT = "SOME_INNER_CONSTANT";

        private String innerStr;
        private int innerValue;

        public Inner() {
        }

        public Inner(String innerStr, int innerValue) {
            this.innerStr = innerStr;
            this.innerValue = innerValue;
        }

        public void someLogic() {

        }

        public String getInnerStr() {
            return innerStr;
        }

        public void setInnerStr(String innerStr) {
            this.innerStr = innerStr;
        }

        public int getInnerValue() {
            return innerValue;
        }

        public void setInnerValue(int innerValue) {
            this.innerValue = innerValue;
        }
    }

    class Child extends Inner {
    }
}
