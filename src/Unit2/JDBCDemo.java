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
            
            Statement st =  conn.createStatement();
            
//            //query for creating table
//            String tblQuery = "create table tbl_std(id int primary key,name varchar(50),password varchar(50)"
//                    + ",repassword varchar(50), gender varchar(50),course varchar(50))";
            
//            st.execute(tblQuery);

//            System.out.println("Insert operation");
//            
//            String insQuery = "insert into tbl_std values(2,'Ram','12345678','12345678','Female','BIM')";
//            
//            int res = st.executeUpdate(insQuery);
//            if(res >=1)
//            {
//                System.out.println(res+ " record update");
//            }
//   

              System.out.println("Updating data");
              //updating name to gita and course to bca of std whose id is 2
              String upData = "update tbl_std set name='Hari' where id =1";
              st.execute(upData);

//            System.out.println("Fetching Data");
//            
//            String disQuery = "select * from tbl_std";
//            ResultSet rs = st.executeQuery(disQuery);
//            
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String pass = rs.getString("password");
//                String repassword = rs.getString("repassword");
//                String gender = rs.getString("gender");
//                String course = rs.getString("course");
//                
//                System.out.println("id is " +id +" name is "+name+ " password is "+pass+" repassword is "+repassword+""
//                    + " gender is "+gender+ " course is "+course);
//                
//            }
            
        }catch(ClassNotFoundException c){
            System.out.println(c);
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
