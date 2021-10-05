/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AirTicketing;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author acer
 */
public class dbconnect {
    Connection con;
public dbconnect(){
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/atbs","root", "root");
        System.out.println("Succesfully connected");

}
catch(Exception e){
    System.out.println(e.toString());
};
}
}
