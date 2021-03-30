package com.maximumintelligence.pinup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

public class MainFragment extends Fragment {

    public static MainFragment instance;
    public Database database;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.main_fragment, container, false);


        instance = this;
        database = Room.databaseBuilder(getActivity().getApplicationContext(), Database.class, "database")
                .build();

        User userData = new User();

        DataBaseThread dataBaseThread = new DataBaseThread();

        EditText userName = view.findViewById(R.id.userName);
        EditText userPhone = view.findViewById(R.id.userPhone);
        EditText userEmail = view.findViewById(R.id.userEmail);
        Button orderButton = view.findViewById(R.id.orderButton);

        View.OnClickListener ocl = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = String.valueOf(userName.getText());
                String phone = String.valueOf(userPhone.getText());
                String email = String.valueOf(userEmail.getText());


                dataBaseThread.setter(name, phone, email);
                /*userData.setUserName(name);
                userData.setUserPhone(phone);
                userData.setUserEmail(email);*/

                dataBaseThread.start();

                getParentFragmentManager().beginTransaction().setReorderingAllowed(true)
                        .replace(R.id.main_fragment, WebViewFragment.class, null).commit();

            }

        };
        orderButton.setOnClickListener(ocl);

        return view;
    }
    public static MainFragment getInstance(){
        return instance;
    }
    public Database getDatabase(){
        return database;
    }

}
