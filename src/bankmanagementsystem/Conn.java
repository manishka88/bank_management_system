/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankmanagementsystem;
import java.sql.*;

/**
 *
 * @author dell
 */
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
    try{
//    Class.forName(com.mysql.cj.jdbc.Driver);
    c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","manishka26");
    s=c.createStatement();
    }
    catch(Exception e){
    System.out.println(e);
}
    }
}

///**
// *
// * @author dell
// */
//public class Conn {
//    
//}
