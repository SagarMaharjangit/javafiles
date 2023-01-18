/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;

import java.sql.*;

public class JDBCDemo {
    public static void main(String[] args) {
        Connection conn;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/db_nccsa";
            String username="root";
            String password = "";
            conn =  DriverManager.getConnection(url,username,password);
            System.out.println("Connected");
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
