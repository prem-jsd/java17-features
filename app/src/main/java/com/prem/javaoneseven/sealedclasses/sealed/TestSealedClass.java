package com.prem.javaoneseven.sealedclasses.sealed;

public class TestSealedClass {

    public static void main(String[] args) {
        sealedClasses();
    }

    private static void sealedClasses() {
        AppleSealed apple = new AppleSealed();
        PearSealed pear = new PearSealed();
        FruitSealed fruit = apple;
        class Avocado extends AppleSealed {};
    }

}
