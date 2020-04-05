package jgarciabt.renderingissues.comparelayouts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import jgarciabt.renderingissues.R;
import jgarciabt.renderingissues.overdraw.OverdrawFragment;

public class CompareLayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_overdraw);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragment_container, new CompareLayoutsFragment())
                    .commit();
        }
    }

}
