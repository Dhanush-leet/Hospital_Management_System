package Hospital.Management.System;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    public Statement statement;





    public conn(){
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system","root", "dhanush");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
