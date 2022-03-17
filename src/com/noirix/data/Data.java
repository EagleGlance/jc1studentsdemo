package com.noirix.data;

public class Data implements MyFirstInterface, MySecondInterface {

    public static final String SOME_CONSTANT_STRING;
    public static int commonValue = 777;

    /*Ctrl+Alt+O - imports optimization*/
    /*Ctrl+Alt+L - code formatting according installed formatter in IDE*/
    /*Default constructor*/
    private int value = 10;
    private String text = "default text";

    static {
        commonValue = 666;
        System.out.println("In static block of initialization#1");
    }

    static {
        commonValue = 999;
        System.out.println("In static block of initialization#2");
        SOME_CONSTANT_STRING = "Constant!";
    }

    {
        value = 20;
        System.out.println("In logic block of initialization#1");
    }

    public Data() {
        System.out.println("In default Constructor");
    }

    public Data(int value, String text) {
        System.out.println("In Constructor with params");
        this.value = value;
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    {
        value = 40;
        System.out.println("In logic block of initialization#2");
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    /*Overloading*/
    public int someLogicWithoutParams() {
        return 0;
    }

    /*Overloading*/
    public int someLogicWithoutParams(String str) {
        System.out.println("In Method some logic");
        return 0;
    }

    public int someLogicWithoutParams(String str, Float f) {
        System.out.println("In Method some logic");
        return 0;
    }

    public int someLogicWithoutParams(Float f, String str) {
        System.out.println("In Method some logic");
        return 0;
    }

    public int processVarArgs(Integer a, Object... args) {  //String[] args //Object[] args = varargs

        for (Object arg : args) {

        }

        return 0;
    }

    {
        value = 10000;
        System.out.println("In logic block of initialization#3");
    }

    //Method signature = method name + type of params + ordering of params
    //Overloading = methods name (constant) + different type and ordering of params
    //Overriding = full equality of methods signatures + extends


    //1. Collections API
    //2. Сравнение объектов
    @Override
    public boolean equals(Object o) {

        //Сравнение объекта с самим собой
        if (this == o) return true;
        //Проверка сравниваем ли мы одинаковые типы объектов (Data с объектом такого же класса или нет)
        if (o == null || getClass() != o.getClass()) return false;

        //Приведение типа после того, как мы проверили что классы идентичны
        Data data = (Data) o;

        //Сравнение двух объектов по полям
        if (value != data.value) return false;
        return text != null ? text.equals(data.text) : data.text == null;
    }

    //1. Collections API
    //2. Сравнение объектов
    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Data{" +
                "value=" + value +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public void someMethod() {
        System.out.println("Some overrided logic in Data class");
    }

    @Override
    public String someTextFunctionality(String txt) {
        return txt.toLowerCase();
    }
}
