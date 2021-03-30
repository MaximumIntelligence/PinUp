package com.maximumintelligence.pinup;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;


@androidx.room.Database(entities = {User.class}, version = 1)
@TypeConverters({Converters.class})
public abstract class Database extends RoomDatabase {

    public abstract UserDataDao userDataDao();

}
