import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {
    Connection connection;
    Statement statement;
    public JDBCConnection(){
        String url = "jdbc:mysql://localhost:3306/voting_system";
        String user = "root";
        String password = "Rupani@0410";
        try{
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
