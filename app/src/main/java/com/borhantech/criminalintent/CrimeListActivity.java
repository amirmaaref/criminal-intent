package com.borhantech.criminalintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by amirhossein on 3/21/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.w("AMIR","onCreate ListActivity()");
        createFragment();
    }

    @Override
    protected Fragment createFragment() {
        Log.w("AMIR","create fragment loaded()");

        return new CrimeListFragment();
    }
}
