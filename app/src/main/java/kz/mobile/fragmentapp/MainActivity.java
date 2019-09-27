package kz.mobile.fragmentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Show fragment in container
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer1, new FirstFragment())
                .commit();
    }
}
