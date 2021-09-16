package com.imukov.bdeck.dao;

public interface PersonDao{
    public void createUser(String name, String nickname, String password);

    public void deleteUser(String nickname, String password);
}
