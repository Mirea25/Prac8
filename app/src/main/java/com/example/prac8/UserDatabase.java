package com.example.prac8;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends RoomDatabase{
    public abstract UserDao userDao();
}
