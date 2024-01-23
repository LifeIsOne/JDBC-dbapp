package controller;

import dao.BankDAO;
import lombok.AllArgsConstructor;

/**
 *  책임  : 유효성검사(body data), parsing(body data), 적절한 DAO 찾기
 */
@AllArgsConstructor
public class BankController {

    private BankDAO dao;

    public void insert(){
        //  1. 파싱

        //  2. 유효성검사
        System.out.println("controller : insert");
        dao.insert("1234", 32200);
    }

    public void delete(){
        System.out.println("controller : delete");
        dao.deleteByNumber(1);

    }

    public void update(){
        System.out.println("controller : update");
        dao.updateByNumber(2000,1);
    }

    public void selectOne(){
        System.out.println("controller : selectOne");
        dao.selectByNumber(20);
    }

    public void selectAll(){
        System.out.println("controller : selectAll");
        dao.selectAll();
    }
}
