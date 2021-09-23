package com.mydeveloperplanet.myjava17planet;

import java.awt.*;

public class PatternMatchingForInstanceof {

    public static void main(String[] args) {
        oldStyle();
        patternMatching();
        patternMatchingScope();
        patternMatchingScopeException();
    }

    private static void oldStyle() {
        System.out.println("""
                *************
                * Old Style *
                *************""");
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass) {
            GrapeClass grape = (GrapeClass) o;
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatching() {
        System.out.println("""
                ********************
                * Pattern matching *
                ********************""");
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScope() {
        System.out.println("""
                *******************************
                * Pattern matching scope test *
                *******************************""");
        Object o = new GrapeClass(Color.BLUE, 2);
        if (o instanceof GrapeClass grape && grape.getNbrOfPits() == 2) {
            System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
        }
    }

    private static void patternMatchingScopeException() {
        System.out.println("""
                **********************************************
                * Pattern matching scope test with exception *
                **********************************************""");
        Object o = new GrapeClass(Color.BLUE, 2);
        if (!(o instanceof  GrapeClass grape)) {
            throw new RuntimeException();
        }
        System.out.println("This grape has " + grape.getNbrOfPits() + " pits.");
    }
}
