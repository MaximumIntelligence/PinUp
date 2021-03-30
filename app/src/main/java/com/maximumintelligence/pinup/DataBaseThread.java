package com.maximumintelligence.pinup;


public class DataBaseThread extends Thread{

    String name, phone, email;

    public void setter(String name, String phone, String email){

        this.name = name;
        this.phone = phone;
        this.email = email;

    }


    public void run(){


        Database db = MainFragment.getInstance().getDatabase();

        UserDataDao userDataDao = db.userDataDao();



        User userData = new User();
        userData.setUserName(name);
        userData.setUserPhone(phone);
        userData.setUserEmail(email);
        userDataDao.insert(userData);


    }



}
