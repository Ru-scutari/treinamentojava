import db.DB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

    public static void main(String[] args) {


        Connection  conn;
        Statement st;
        ResultSet rs;

        try {
            conn = DB.getConnection();

            st = conn.createStatement();

            rs = st.executeQuery("select * from department");

            while (rs.next()){
                System.out.println(rs.getInt("Id") + ". " + rs.getString("Name"));
            }

        } catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatement();
            DB.closeResultSet();
            DB.closeConnection();
        }
    }
}
