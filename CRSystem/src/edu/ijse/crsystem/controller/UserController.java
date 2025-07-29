package edu.ijse.crsystem.controller;

import edu.ijse.crsystem.Dao.UserDao;
import edu.ijse.crsystem.Dao.UserDaoImpl;
import edu.ijse.crsystem.db.DBConnection;
import edu.ijse.crsystem.dto.UserDto;
import edu.ijse.crsystem.model.UserModel;

public class UserController {

    private final UserModel userModel;
    private final UserDao userDao;

    public UserController() throws Exception {
        this.userModel = new UserModel();
        this.userDao = new UserDaoImpl(DBConnection.getInstance().getConnection());
    }

    public UserDto login(String username, String password) throws Exception {
        return userModel.login(username, password);
    }

    public boolean register(UserDto userDto) throws Exception {
        return userDao.save(userDto);
    }
}
