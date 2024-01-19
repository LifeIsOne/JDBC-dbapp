import db.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BankAppUpdate {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();
        try {
            String update = "update account_tb set balance = balance + ? where number = ?";
            PreparedStatement pstmt = conn.prepareStatement(update);    // 라이브러리 버퍼 사용
            pstmt.setInt(2, 5000);

            int num = pstmt.executeUpdate();    // flush 역할

            System.out.println(num);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}