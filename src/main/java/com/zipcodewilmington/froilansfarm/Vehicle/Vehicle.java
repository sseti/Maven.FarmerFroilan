package com.zipcodewilmington.froilansfarm.Vehicle;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;

public abstract class Vehicle implements NoiseMaker, Rideable {

    private Integer gasLevel = 10;

    private Integer id;

    public Vehicle(Integer id) {
        this.id = id;
    }

    public Vehicle() {
    }
    public Integer getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(Integer gasLevel) {
        this.gasLevel = gasLevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
