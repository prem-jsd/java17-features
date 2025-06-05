package com.prem.javaoneseven.records;

public class GrapeOldStyleRun {


    public static void main(String[] args) {
        oldStyle();
    }

    private static void oldStyle() {
        GrapeClass grape1 = new GrapeClass(Color.BLUE, 1);
        GrapeClass grape2 = new GrapeClass(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeClass grape1Copy = new GrapeClass(grape1.getColor(), grape1.getNbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
    }

}
