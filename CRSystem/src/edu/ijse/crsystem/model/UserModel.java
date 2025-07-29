/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.model;

import edu.ijse.crsystem.Dao.UserDao;
import edu.ijse.crsystem.Dao.UserDaoImpl;
import edu.ijse.crsystem.db.DBConnection;
import edu.ijse.crsystem.dto.UserDto;

import java.sql.Connection;


public class UserModel {
     private final UserDao userDao;

    public UserModel() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        this.userDao = new UserDaoImpl(connection);
    }

    public UserDto login(String username, String password) throws Exception {
        UserDto dbUser = userDao.searchUserByUsername(username);
        if (dbUser != null && dbUser.getPassword().equals(password)) {
            return dbUser;
        }
        return null;
    }
    
}
