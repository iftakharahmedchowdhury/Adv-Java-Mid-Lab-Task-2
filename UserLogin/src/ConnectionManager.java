/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:3306/apwj";

    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}*/

/*Data Source=LAPTOP-JM49R2Q7\SQL_IFTAKHAR;Initial Catalog=apwj;Integrated Security=True*/
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:sqlserver://LAPTOP-JM49R2Q7\\SQL_IFTAKHAR;databaseName=apwj;integratedSecurity=true";
   */
/* private static final String USER = "LAPTOP-JM49R2Q7\\Niloy"; // For integrated security, the username can be left empty
  // For integrated security, the password can be left empty*//*


    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load SQL Server JDBC driver", e);
        }

        return DriverManager.getConnection(URL);
    }
}
*/


/*XAMPP*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    private static final String URL = "jdbc:mysql://localhost:3307/userregistrationlabtasktwo";
    private static final String USER = "root";
/*private static final String PASSWORD = ""; */


    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Failed to load MySQL JDBC driver", e);
        }

        return DriverManager.getConnection(URL, USER, "");
    }
}

