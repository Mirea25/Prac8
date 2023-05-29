package com.example.prac8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        UserDatabase db = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "users").allowMainThreadQueries().build();
        // db.userDao().insert(228, "zxc1337");
        List<User> users = db.userDao().getAll();
        Toast.makeText(this, String.valueOf(users.get(0).userID) + users.get(0).login, Toast.LENGTH_LONG).show();
    }
}