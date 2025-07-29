/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.Dao;

import edu.ijse.crsystem.dto.UserDto;


/**
 *
 * @author Rasuni
 */
public interface UserDao {
    UserDto searchUserByUsername(String userName) throws Exception;

    public boolean save(UserDto dto) throws Exception;
}
