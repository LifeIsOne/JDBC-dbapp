import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();

        // 얘가 buffer
        try {
            PreparedStatement pstmt = conn.prepareStatement("inset ino account_tb(password, balance, created_at) values(?, ?, now())");
            // 0이 없이 1부터 시작
            pstmt.setString(1,"1234");
            pstmt.setInt(2,1000);
            pstmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
