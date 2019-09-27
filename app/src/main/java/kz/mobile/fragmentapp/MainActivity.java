package kz.mobile.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements FirstFragment.FirstFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show fragment in container
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer1, new FirstFragment())
                .commit();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer2, new SecondFragment())
                .commit();
    }

    @Override
    public void counterResult(int count) {
        SecondFragment fragment = (SecondFragment)
                getSupportFragmentManager().findFragmentById(R.id.fragmentContainer2);
        fragment.showCounterValue(count);
    }
}
