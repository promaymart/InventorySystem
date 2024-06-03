package MainFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
   
    @SuppressWarnings({"BroadCatchBlock", "TooBroadCatch"})
    public DBConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bus","root","");
            st = con.createStatement();
    
        } catch(Exception e) {
            System.out.println("Error"+e);
        }
    }
    
    public Connection ConnectDb() {
        return con;
    }
}
