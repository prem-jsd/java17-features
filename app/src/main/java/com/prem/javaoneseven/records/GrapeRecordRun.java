package com.prem.javaoneseven.records;

public class GrapeRecordRun {

    //todo:: The GrapeRecord has the same functionality of the GrapeClass but it is much less verbose. You create a record and indicate what the fields should be and you are done.
    // The GrapeRecord has the same functionality of the GrapeClass but it is much less verbose. You create a record and indicate what the fields should be and you are done.
    // The output is identical as above. It is important to notice that copies of records should end up in identical copies. Adding extra functionality in e.g. grape1.nbrOfPits()
    // in order to do some processing and returning a different value than the initial nbrOfPits is a bad practice. It is allowed, however, but you should not do this.
    public static void main(String[] args) {
        basicRecord();
        basicRecordWithValidation();
    }

    private static void basicRecord() {
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
