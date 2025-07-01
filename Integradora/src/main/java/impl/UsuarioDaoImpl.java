package impl;

import config.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDaoImpl implements IUsuarioDao{

    @Override 
    public boolean login(String correo, String pass) throws Exception{
        String sql = "select ID,CORREO,PASS FROM USUARIO WHERE CORREO = ? AND PASS = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, correo);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;
        }catch (Exception e){
            throw new Exception(e);
        }
    }

    public static void main (String[] args){
        UsuarioDaoImmpl dao = new UsuarioDoaImpl();
        try{
            System.out.println(dao.login("correo","pass"));
        }catch (Exception e){
            throw new RuntimeExcpetion(e);
        }
    }
}
