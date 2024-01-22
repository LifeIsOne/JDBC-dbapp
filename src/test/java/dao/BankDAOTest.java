package dao;

import db.DBConnection;
import model.Account;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.atomic.DoubleAccumulator;


public class BankDAOTest {
    @Test
    public void selectAll_test(){
        //  given

        //  when

        //  then
        BankDAO dao = new BankDAO();
        List<Account> accountList = dao.selectAll();

        System.out.println(accountList.size());
        System.out.println(accountList);
        for (Account a : accountList){
            System.out.println(a);
        }
    }

    @Test
    public void selectByNumber_test(){
        int number = 9;

        BankDAO dao = new BankDAO();
        Account account = dao.selectByNumber(number);
        if (account == null){
            System.out.println(number + "로 조회된 값이 없어요.");
        }else{
            System.out.println(account);
//            System.out.println(account.getNumber());
//            System.out.println(account.getBalance());
//            System.out.println(account.getCreatedAT());
        }
    }

    @Test
    public void getInstance_test(){
        //  given == 파라메터
        String password = "나비";
        int balance = 1000;
        //  when == 본 코드 실행
        Connection conn = DBConnection.getInstance();

        //  then == 검증
        if (conn == null)
            System.out.println("실패");
        else
            System.out.println("성공");
    }

    @Test
    public void deleteByNumber_test(){
        //  given == 파라미터
        int number = 14;

        //  when == 본 코드 실행
        BankDAO dao = new BankDAO();
        int result = dao.deleteByNumber(number);

        //  then == 검증
        if (result == 1)
            System.out.println(number + "번이 삭제되었습다니.");
        else if (result == 0)
            System.out.println("해당 번호를 찾을 수 없습니다.");
        else
            System.out.println(number + "번 삭제 실패했습니ㅏㄷ.");
    }
}
