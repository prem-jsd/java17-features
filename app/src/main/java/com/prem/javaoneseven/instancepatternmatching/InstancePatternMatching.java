package com.prem.javaoneseven.instancepatternmatching;

import com.prem.javaoneseven.records.Color;
import com.prem.javaoneseven.records.GrapeClass;

public class InstancePatternMatching {

    public static void main(String[] args) {
        oldStyle();
        patternMatching();
        patternMatchingScope();
        patternMatchingScopeException();
    }


    private static void oldStyle() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass) {
            GrapeClass grape = (GrapeClass) o;
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatching() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScope() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape && grape.getNbrOfPits() == 2) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScopeException() {
        Object o = new GrapeClass(Color.BLUE, 2);
        if (!(o instanceof  GrapeClass grape)) {
            throw new RuntimeException();
        }
        System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
    }

}
