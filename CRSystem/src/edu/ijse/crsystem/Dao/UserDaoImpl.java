/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.crsystem.Dao;
import edu.ijse.crsystem.dto.UserDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rasuni
 */
public class UserDaoImpl implements UserDao {
    
    private final Connection connection;

    public UserDaoImpl(Connection connection) {
        this.connection = connection;
    }
    
    

    @Override
    public UserDto searchUserByUsername(String userName) throws Exception {
        String sql = "SELECT * FROM user WHERE username = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, userName);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new UserDto(
                rs.getString("username"),
                rs.getString("password"),
                rs.getString("role")
            );
        }
        return null;
    }

    @Override
    public boolean save(UserDto dto) throws Exception {
        String sql = "INSERT INTO user (username, password, role) VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, dto.getUsername());
        ps.setString(2, dto.getPassword());
        ps.setString(3, dto.getRole());

    int result = ps.executeUpdate();
    return result > 0;
}

}