/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;

import java.sql.SQLException;
/**
 *
 * @author achra
 */
public class koneksi {
    static Connection c;
    
    public static Connection connection(){
        if (c == null){
            MysqlDataSource data = new MysqlDataSource();
            data.setDatabaseName("belajar");
            data.setUser("root");
            data.setPassword("");
            try{
                c = data.getConnection();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
        return c;
    }
    
}
