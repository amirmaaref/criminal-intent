package com.borhantech.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    public static final String EXTRA_CRIME_ID =
            "crime_id";
    public static Intent newIntent(Context packageContext , UUID crimeId){
        Intent intent = new Intent(packageContext , CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID,crimeId);
        return intent;
    }
    @Override
    protected Fragment createFragment() {
        Log.w("AMIR", "create fragment loaded()");

        return new CrimeFragment();
    }
}
