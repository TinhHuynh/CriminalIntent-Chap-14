package com.example.tinhhuynh.criminalintent.database;

/**
 * Created by TINH HUYNH on 4/28/2017.
 */

public class CrimeDbSchema {

    public static final class CrimeTable {

        public static final String NAME = "Crimes";

        public static final class Cols {
            public static final String UUID = "uuid";
            public static final String TITLE = "title";
            public static final String DATE = "date";
            public static final String SOVLED = "solved";
        }
    }
}
