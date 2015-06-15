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
public class Data {
    String strDatabasePath;
    String strURL;
    String strUser;
    String strPassword;
    Connection conn;

    Data() {
        strDatabasePath = "d:/student/progr_arch/git/resource/clubdb.fdb";
        strURL = "jdbc:firebirdsql:localhost:" + strDatabasePath;
        strUser = "SYSDBA";
        strPassword = "masterkey";
        conn = null;
    }

    public void initdb() {
        try {
            Class.forName("org.firebirdsql.jdbc.FBDriver").newInstance();
        } catch (IllegalAccessException | InstantiationException | ClassNotFoundException ex) {
            System.out.println("db init error: " + ex);
        }
    }

    public void connect() {
        try {
            //Создаём подключение к базе данных
            conn = DriverManager.getConnection(strURL, strUser, strPassword);

            if (conn == null) {
                System.err.println("Could not connect to database");
            }
        } catch (SQLException ex) {
            System.out.println("db connect error" + ex);
        }
    }

    public String request(String str) {
        String temp = "";

        try {
            // Создаём класс, с помощью которого будут выполняться 
            // SQL запросы.
            Statement stmt = conn.createStatement();

            //Выполняем SQL запрос.
            ResultSet rs = stmt.executeQuery(str);

            // Смотрим количество колонок в результате SQL запроса.
            int nColumnsCount = rs.getMetaData().getColumnCount();

            while (rs.next()) {
                for (int n = 1; n < nColumnsCount + 1; n++) {
                    Object obj = rs.getObject(n);
                    if (obj != null) {
                        temp = temp.concat(obj.toString()).concat("\n");
                    }
                }
            }
            //System.out.println(temp);

            stmt.close();


        } catch (SQLException ex) {
            System.out.println("db request error " + ex);
        }

        return temp;
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("closing connection error: " + ex);
        }
    }
    
    
}
