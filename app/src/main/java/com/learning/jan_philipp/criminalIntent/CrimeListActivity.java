package com.learning.jan_philipp.criminalIntent;

import android.app.Fragment;
/**
 * Created by janPhil on 18.07.14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
