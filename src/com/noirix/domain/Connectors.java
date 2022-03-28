package com.noirix.domain;

import com.noirix.data.MyFirstInterface;

public enum Connectors implements MyFirstInterface {
    USB_3_0(2011, "Better than USB 2.0"),
    USB_2_0,
    HDMI,
    WLAN,
    TYPE_C;

    private int yearOfDevelopment;
    private String connectorDescription;

    Connectors() {
    }

    Connectors(int yearOfDevelopment, String connectorDescription) {
        this.yearOfDevelopment = yearOfDevelopment;
        this.connectorDescription = connectorDescription;
    }

    public String getFullInfo() {
        return connectorDescription + " " + yearOfDevelopment;
    }

    public int getYearOfDevelopment() {
        return yearOfDevelopment;
    }

    public String getConnectorDescription() {
        return connectorDescription;
    }

    @Override
    public void someMethod() {
        System.out.println("in void someMethod()");
    }

    @Override
    public void someMethod(String someString, int a) {
        System.out.println("in void someMethod(String someString, int a)");
    }

    @Override
    public void someMethod(int a) {
        System.out.println("in void someMethod(int a)");
    }
}
