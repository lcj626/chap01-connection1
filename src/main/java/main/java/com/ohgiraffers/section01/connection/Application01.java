package main.java.com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application01 {

    public static void main(String[] args){

        Connection con =null;

        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "guro", "guro");//리터럴
            System.out.println(con);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }



    }

}
