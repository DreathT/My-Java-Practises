import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {

    private String userName = "root";
    private String password = "123456";
    private String dbUrl = "jdbc:mysql://localhost:3306/world";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Error code: "+ exception.getErrorCode());
    }
}

// Note:
//      Bu projeye MySql sunucusu, kullanıcı adı ve şifresi örnek olarak verilmiştir.
//      Eğer projeyi doğru şekilde çalıştırmak istiyorsanız;
//          MySql sunucusunu kurun -> jar dosyasınını projeye ekleyin -> doğru giriş bilgilerini girin -> projeyi tekrar çalıştırın.