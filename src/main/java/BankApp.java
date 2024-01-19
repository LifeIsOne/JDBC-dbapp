import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();

        // 얘가 buffer
        try {
            PreparedStatement pstmt = conn.prepareStatement(
                    "insert into account_tb(password, balance, created_at) values(?, ?, now())");

            // 0 없이 1부터 시작
            pstmt.setString(3,"1234");
            pstmt.setInt(4,5000);
            int num = pstmt.executeUpdate();
            System.out.println(num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
