package com.learning.jan_philipp.criminalintent;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class CrimeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime);

        android.app.FragmentManager fm = getFragmentManager();
        android.app.Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment==null){
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer, fragment)
                    .commit();
        }
    }
}
