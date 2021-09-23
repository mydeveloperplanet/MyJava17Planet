package com.mydeveloperplanet.myjava17planet;

import java.awt.*;

public class Records {

    public static void main(String[] args) {
        oldStyle();
        basicRecord();
        basicRecordWithValidation();
    }

    private static void oldStyle() {
        System.out.println("""
                *************
                * Old style *
                *************""");
        GrapeClass grape1 = new GrapeClass(Color.BLUE, 1);
        GrapeClass grape2 = new GrapeClass(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeClass grape1Copy = new GrapeClass(grape1.getColor(), grape1.getNbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
    }

    private static void basicRecord() {
        System.out.println("""
                ****************
                * Basic record *
                ****************""");
        record GrapeRecord(Color color, int nbrOfPits) {}
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        GrapeRecord grape2 = new GrapeRecord(Color.WHITE, 2);
        System.out.println("Grape 1 is " + grape1);
        System.out.println("Grape 2 is " + grape2);
        System.out.println("Grape 1 equals grape 2? " + grape1.equals(grape2));
        GrapeRecord grape1Copy = new GrapeRecord(grape1.color(), grape1.nbrOfPits());
        System.out.println("Grape 1 equals its copy? " + grape1.equals(grape1Copy));
    }

    private static void basicRecordWithValidation() {
        System.out.println("""
                ********************************
                * Basic record with validation *
                ********************************""");
        record GrapeRecord(Color color, int nbrOfPits) {
            GrapeRecord {
                System.out.println("Parameter color=" + color + ", Field color=" + this.color());
                System.out.println("Parameter nbrOfPits=" + nbrOfPits + ", Field nbrOfPits=" + this.nbrOfPits());
                if (color == null) {
                    throw new IllegalArgumentException("Color may not be null");
                }
            }
        }
        GrapeRecord grape1 = new GrapeRecord(Color.BLUE, 1);
        System.out.println("Grape 1 is " + grape1);
        GrapeRecord grapeNull = new GrapeRecord(null, 2);
    }
}
