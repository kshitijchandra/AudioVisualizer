package android.example.com.visualizerpreferences;

import android.os.Build;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.RequiresApi;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by kcp on 11/1/17.
 */

public class SettingsFragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);

    }
}
