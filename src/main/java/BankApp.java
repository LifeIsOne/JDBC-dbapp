import controller.BankController;
import dao.BankDAO;

public class BankApp {
    public static void main(String[] args) {
        String url = "selectAll";

        BankDAO dao = new BankDAO();
        BankController con = new BankController(dao);   //  의존성 주입(Dependency Injection) : 객체 간의 의존성을 외부에서 주입. WHY? 객체 간의 결합도를 낮춰 유연하고 테스트 가능한 코드를 만들수 있음.
        Dispatcher dis = new Dispatcher(con);
        dis.route(url);
    }
}
