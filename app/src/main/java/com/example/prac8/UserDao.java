package com.example.prac8;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserDao {
    @Query("SELECT * FROM User")
    List<User> getAll();

    @Query("SELECT * FROM User WHERE userId IN (:userIds)")
    List<User> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM User WHERE login LIKE :login LIMIT 1")
    User findByLogin(String login);

    @Query("INSERT INTO User(userID, login) VALUES (:id,:login)")
    void insert(int id, String login);

    @Query("DELETE FROM User WHERE userID LIKE :id")
    void delete(int id);
}
