package com.mydeveloperplanet.myjava17planet;

import com.mydeveloperplanet.myjava17planet.nonsealed.Apple;
import com.mydeveloperplanet.myjava17planet.nonsealed.Fruit;
import com.mydeveloperplanet.myjava17planet.nonsealed.Pear;
import com.mydeveloperplanet.myjava17planet.sealed.AppleSealed;
import com.mydeveloperplanet.myjava17planet.sealed.FruitSealed;
import com.mydeveloperplanet.myjava17planet.sealed.PearSealed;

public class SealedClasses {

    public static void main(String[] args) {

    }

    private static void problemSpace() {
        Apple apple = new Apple();
        Pear pear = new Pear();
        Fruit fruit = apple;
        class Avocado extends Fruit {};
    }

    private static void sealedClasses() {
        AppleSealed apple = new AppleSealed();
        PearSealed pear = new PearSealed();
        FruitSealed fruit = apple;
        class Avocado extends AppleSealed {};
    }

}
