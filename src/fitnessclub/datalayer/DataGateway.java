package fitnessclub.datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author magni
 */
public class DataGateway {
    public final static String strDatabasePath = System.getProperty("user.dir") + "\\resource\\clubdb.fdb";
    public final static String strURL = "jdbc:firebirdsql:localhost:" + strDatabasePath;
    public final static String strUser = "SYSDBA";
    public final static String strPassword = "masterkey";
    public static Connection conn = null;

    public static void initdb() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            System.out.println("db init error: " + ex);
        }
    }

    public static void connect() {
        try {
            //Создаём подключение к базе данных
            conn = DriverManager.getConnection(strURL, strUser, strPassword);

            if (conn == null) {
                System.err.println("Could not connect to database");
            }
        } catch (SQLException ex) {
            System.out.println("db connect error " + ex);
        }
    }

    public static String request(String str) {
        ResultSet rs;
        String temp = "";
        
        System.out.println("request: " + str);
        System.out.println("result: ");

        try {
            Statement stmt = conn.createStatement();

            rs = stmt.executeQuery(str);

            int nColumnsCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                for (int n = 1; n < nColumnsCount + 1; n++) {
                    Object obj = rs.getObject(n);
                    if (obj != null) {
                        temp = temp.concat(obj.toString()).concat("\n");
                    }
                }
            }
            System.out.println(temp);
            System.out.println("-------------------------");

            stmt.close();
        } catch (SQLException ex) {
            System.out.println("db request error: " + ex);
        }

        return temp;
    }
    
    public static void update(String str) {
        try {
            System.out.println("update: " + str);
            System.out.println("-------------------------");
            
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("db request error: " + ex);
        }
    }
    
    public static void close() {
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("closing connection error: " + ex);
        }
    }
}
