package com.maximumintelligence.pinup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    public static MainActivity instance;
    public Database database;

    public MainFragment mainFragment;
    public WebViewFragment webViewFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();

        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                .add(R.id.activity_fragment, MainFragment.class, null).commit();

}
    public static MainActivity getInstance(){
        return instance;
    }

    public Database getDatabase(){
        return database;
    }



}