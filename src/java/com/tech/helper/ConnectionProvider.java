
package com.tech.helper;
import java.sql.*;
public class ConnectionProvider {
    private static Connection conn;
    public static Connection getConnection(){
        try{
            if(conn==null)
            {
                Class.forName("com.mysql.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/techblog", "root", "3972");
            }
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
}
