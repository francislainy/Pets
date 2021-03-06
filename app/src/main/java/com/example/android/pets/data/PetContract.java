package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Francislainy on 10/01/2017.
 */

public final class PetContract {
    // To prevent someone from accidentally instantiating the contract class,
    // Make the constructor private
    private PetContract() {

    }

    /* Inner class that defines the table contents */
    public static class PetEntry implements BaseColumns {

        public static final String TABLE_NAME = "pets";

        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";

        /**
         * Possible values for the pet gender.
         */
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }


}
