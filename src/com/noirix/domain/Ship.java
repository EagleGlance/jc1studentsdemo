package com.noirix.domain;

public class Ship extends HumanMadeObject {

    private String shipName;

    public Ship() {
    }

    public Ship(String shipName) {
        this.shipName = shipName;
    }

    public Ship(double weight, String someParam, String shipName) {
        super(weight, someParam);
        this.shipName = shipName;
    }

    @Override
    public void someBehaviour() {

    }

    @Override
    public void parentBehaviour() {

    }
}
