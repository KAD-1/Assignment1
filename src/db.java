import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class db {

    private Connection conn;

    public void connectToDatabase() {
        String url = "jdbc:postgresql://localhost:5432/OOP_DB";
        String user = "postgres";
        String password = "201007Dk";

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData(String name, int age, String gender) {

        String sqlInsert = "INSERT INTO person (name, age, gender) VALUES ('" + name + "', " + age + ", '" + gender + "')";

        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate(sqlInsert);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void printData() {
        String sqlSelect = "SELECT * FROM person";

        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sqlSelect)) {
            while (rs.next()) {
                int id = rs.getInt("person_id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String gender = rs.getString("gender");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Gender: " + gender);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void deleteDataById(int id) {
        String sqlDelete = "DELETE FROM person WHERE person_id = " + id;

        try (Statement stmt = conn.createStatement()) {
            int rowsAffected = stmt.executeUpdate(sqlDelete);
            System.out.println("Удалено строк: " + rowsAffected);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
