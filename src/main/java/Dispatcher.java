import controller.BankController;
import controller.RequestMapping;
import lombok.AllArgsConstructor;

import java.lang.reflect.Method;

/**
 *  책임  : routing
 */
@AllArgsConstructor
public class Dispatcher {

    private BankController con;

    //  uri를 받아 라우팅 (메서드 호출)
    public void route(String url) {
        Method[] methods = con.getClass().getDeclaredMethods();

        System.out.println(methods.length);

        for (Method method : methods){
//            System.out.println(method.getName());
            RequestMapping rm = method.getDeclaredAnnotation(RequestMapping.class);

            if (rm == null) continue;       // RequestMapping 이 null일 때 다음 반복문으로

            if(rm.uri().equals(url)){      // RequestiMapping 어노테이션 uri와 path가 일치하면
                try {
                    method.invoke(con);    //  == con.login(); / 해당 메서드 호출
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }




//        if (url.equals("insert")) {
//            con.insert();
//        } else if (url.equals("delete")) {
//            con.delete();
//        } else if (url.equals("update")) {
//            con.update();
//        } else if (url.equals("selectOne")) {
//            con.selectOne();
//        } else if (url.equals("selectAll")) {
//            con.selectAll();
//        }
    }
}
