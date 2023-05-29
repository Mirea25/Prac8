package com.example.prac8;
import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {
    @PrimaryKey
    public int userID;
    @ColumnInfo(name = "login")
    public String login;
    @ColumnInfo(name = "passwd")
    public String passwd;
}
