import java.sql.*;
public class ReadStudentDetails {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/your_database_name"; 
        String user = "root";      
        String password = "root";   
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            String query = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("ID\tName\t\tAge");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "\t" + name + "\t\t" + age);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
