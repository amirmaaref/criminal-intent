package com.borhantech.criminalintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by amirhossein on 3/21/18.
 */

public abstract class SingleFragmentActivity extends AppCompatActivity {

    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment =
                fm.findFragmentById(R.id.fragment_container);

        if(fragment == null){
            fragment = createFragment();

            fm.beginTransaction()
                    .add(R.id.fragment_container,fragment)
                    .commit();
        }
        Log.w("AMIR","on create loaded()");

    }
}
