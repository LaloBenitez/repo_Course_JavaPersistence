import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getConnection(){
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
        }catch(Exception e) {
            System.out.println(e);
        }

        return connection;
    }
}
