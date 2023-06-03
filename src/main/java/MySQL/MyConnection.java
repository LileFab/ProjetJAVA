package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MyConnection {
    private String Database_Name;
    private String User;
    private String Password;
    public Connection Conn;

    public MyConnection(String database_Name, String user, String password) {
        this.Database_Name = database_Name;
        this.User = user;
        this.Password = password;
    }
    public void Connection() {
        try {
            this.Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+this.Database_Name, this.User, this.Password);
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getDatabase_Name() {
        return Database_Name;
    }

    public void setDatabase_Name(String database_Name) {
        Database_Name = database_Name;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
