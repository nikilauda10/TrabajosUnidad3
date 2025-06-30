package impl;

import config.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDaoImpl implements IUsuarioDao{
    public boolean login(String correo, String pass) throws Exception{

        String sql = "select ID,CORREO,PASS FROM USUARIO WHERE CORREO = ? AND PASS = ?";
        try {

        }catch (Exception e){}
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, correo);
        ps.setString(2, pass);
        ResultSet rs = ps.executeQuery();

        return false;
    }
}
