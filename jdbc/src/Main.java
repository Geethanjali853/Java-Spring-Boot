import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Class.forName("java.util.ArrayList"));
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/p2", "root", "root");
            System.out.println(con);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
