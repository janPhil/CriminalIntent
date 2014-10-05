package com.learning.jan_philipp.criminalIntent;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by jan-philipp on 18.09.14.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
    }

    @Override
    protected CrimeCameraFragment createFragment() {
        return new CrimeCameraFragment();
    }
}
