package com.learning.jan_philipp.criminalIntent;

import android.app.Fragment;


public class CrimeActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeFragment();
    }
}
