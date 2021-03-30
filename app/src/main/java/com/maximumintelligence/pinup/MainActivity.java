package com.maximumintelligence.pinup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.room.Room;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

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







        /*database = Room.databaseBuilder(getApplicationContext(), Database.class, "database")
                .allowMainThreadQueries()
                .build();*/



        /*Database db = MainActivity.getInstance().getDatabase();

        UserDataDao userDataDao = db.userDataDao();*/
        /*User userData = new User();

        DataBaseThread dataBaseThread = new DataBaseThread();
        //dataBaseThread.start();

        userName = findViewById(R.id.userName);
        userPhone = findViewById(R.id.userPhone);
        userEmail = findViewById(R.id.userEmail);
        orderButton = findViewById(R.id.orderButton);
        pinUpWebView = findViewById(R.id.webView);


        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    name = String.valueOf(userName.getText());
                    phone = String.valueOf(userPhone.getText());
                    email = String.valueOf(userEmail.getText());

                    userData.setUserName(name);
                    userData.setUserPhone(phone);
                    userData.setUserEmail(email);
                    dataBaseThread.start();

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true)
                            .replace(R.id.webViewFragment, WebViewFragment.class, null);




            }

        };
        orderButton.setOnClickListener(ocl);


    }
*/


}
    public static MainActivity getInstance(){
        return instance;
    }

    public Database getDatabase(){
        return database;
    }



}