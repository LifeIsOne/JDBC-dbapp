package db;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionTest {

    // Return Type과 Parameter를 적을 수 없습니다.
    // @Test 붙이면 Method 별로 실행할 수 있다!
    @Test
    public void getInstance_test(){
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://127.0.0.1:3306/cosdb";
        // Protocal이 적용된 Socket
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
