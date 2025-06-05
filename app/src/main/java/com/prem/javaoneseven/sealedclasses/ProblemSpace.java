package com.prem.javaoneseven.sealedclasses;

public class ProblemSpace {

    public static void main(String[] args) {
        problemSpace();
    }

    private static void problemSpace() {
        Apple apple = new Apple();
        Pear pear = new Pear();
        AbstractFruit fruit = apple;
        class Avocado extends AbstractFruit {};
    }

}
