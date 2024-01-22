import dao.BankDAO;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("삭제할 계좌번호를 입력해주세요 : ");
        int number = sc.nextInt();

        BankDAO dao = new BankDAO();

        dao.deleteByNumber(number);

        int result = dao.deleteByNumber(number);

        if (result == 1)
            System.out.println("삭제하지 못했습니다.");
        else
            System.out.println("삭제되었습니다.");

    }
}
