package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

public class ChickenCoopTest {

    private static final Logger LOGGER = Logger.getLogger(FarmHouseTest.class.getName());

    ChickenCoop currentChickenCoop = new ChickenCoop();
    Chicken chicken = new Chicken();
    Chicken chick = new Chicken();

    @Test
    public void constructChickenCoopTest() {
        Integer actualChickenCoopSize = currentChickenCoop.chickens.size();
        Integer expectedChickenCoopSize = 0;

        Assert.assertEquals(expectedChickenCoopSize, actualChickenCoopSize);
    }

    @Test
    public void addChickenTest() {
        currentChickenCoop.addChicken(chicken);
        currentChickenCoop.addChicken(chick);

        Integer actualChickenCoopSize = currentChickenCoop.chickens.size();
        Integer expectedChickenCoopSize = 2;

        Assert.assertEquals(expectedChickenCoopSize, actualChickenCoopSize);
    }

    @Test
    public void removeChickenTest() {
        currentChickenCoop.addChicken(chicken);
        currentChickenCoop.addChicken(chick);

        currentChickenCoop.removeChicken(chicken);
        currentChickenCoop.removeChicken(chick);

        Integer actualChickenCoopSize = currentChickenCoop.chickens.size();
        Integer expectedChickenCoopSize = 0;

        Assert.assertEquals(expectedChickenCoopSize, actualChickenCoopSize);
    }

    @Test
    public void getChickenTest() {
        currentChickenCoop.addChicken(chicken);
        currentChickenCoop.addChicken(chick);

        currentChickenCoop.getChicken(0);

        Integer actualChickenCoopSize = currentChickenCoop.chickens.size();
        Integer expectedChickenCoopSize = 2;

        Assert.assertEquals(expectedChickenCoopSize, actualChickenCoopSize);
    }

}
