/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection_mysql;

import java.sql.*;

public class conexao {
    Connection con;
    Statement stmt;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/bancoteste?user=root&password=jura9090";
    String pass = "jura9090";
    String user = "root";
    String Driver = "com.mysql.cj.jdbc.Driver";
    
public void OpenConnection() throws ClassNotFoundException
{
try{
    
    Class.forName(Driver).newInstance();
    con = DriverManager.getConnection(url);
    stmt = con.createStatement();
            }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
            System.out.println("Conexão mal sucedida");
            }
}


}
