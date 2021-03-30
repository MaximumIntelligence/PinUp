package com.maximumintelligence.pinup;


import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

import java.util.Collections;
import java.util.List;


public class Converters {

    @TypeConverter
    public static List<User> storedStringToMyObjects(String data) {
        Gson gson = new Gson();
        if (data == null) {
            return Collections.emptyList();
        }
        Type listType = new TypeToken<List<User>>() {}.getType();
        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String myObjectsToStoredString(List<User> myObjects) {
        Gson gson = new Gson();
        return gson.toJson(myObjects);
    }

}