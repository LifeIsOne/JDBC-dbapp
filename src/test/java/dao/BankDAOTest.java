package dao;

import org.junit.jupiter.api.Test;


public class BankDAOTest {

    @Test
    public void deleteByNumber_test(){
        //  given == 파라미터
//        int number = 2;
        String password = "이우형";
        int balance = 1000;
        //  when == 본 코드 실행
        BankDAO dao = new BankDAO();
//        int result = dao.deleteByNumber(number);
        int resultInsert = dao.insert(password, balance);

        //  then == 검증
        if (resultInsert == 1)
            System.out.println("번이 삭제되었습다니.");
        else if (resultInsert == 0)
            System.out.println("해당 번호를 찾을 수 없습니다.");
        else
            System.out.println(resultInsert + "번 삭제 실패했습니ㅏㄷ.");
    }
}
