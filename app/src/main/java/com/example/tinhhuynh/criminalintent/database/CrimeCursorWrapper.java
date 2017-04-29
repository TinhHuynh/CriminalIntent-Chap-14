package com.example.tinhhuynh.criminalintent.database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.tinhhuynh.criminalintent.model.Crime;

import java.util.Date;
import java.util.UUID;

import static com.example.tinhhuynh.criminalintent.database.CrimeDbSchema.CrimeTable;

/**
 * Created by TINH HUYNH on 4/28/2017.
 */

public class CrimeCursorWrapper extends CursorWrapper {
    /**
     * Creates a cursor wrapper.
     *
     * @param cursor The underlying cursor to wrap.
     */
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuid = getString(getColumnIndex(CrimeTable.Cols.UUID));
        String title = getString(getColumnIndex(CrimeTable.Cols.TITLE));
        long date = getLong(getColumnIndex(CrimeTable.Cols.DATE));
        int isSolved = getInt(getColumnIndex(CrimeTable.Cols.SOVLED));
        Crime crime = new Crime(UUID.fromString(uuid));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setSolved(isSolved != 0);
        return crime;
    }


}
