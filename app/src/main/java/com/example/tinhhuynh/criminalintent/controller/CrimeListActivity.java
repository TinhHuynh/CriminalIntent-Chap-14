package com.example.tinhhuynh.criminalintent.controller;

import android.support.v4.app.Fragment;

/**
 * Created by TINH HUYNH on 4/20/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
