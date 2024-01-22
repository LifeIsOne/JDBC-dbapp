package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.sql.Timestamp;

/**
 *  DB에 SELECT한 데이터를 담을 Object
 */
@ToString           //  롬복
@Getter
@AllArgsConstructor //  매개변수를 받는 모든 생성자를 생성
public class Account {
    private int number;
    private String password;
    private int balance;

    // java/sql의 Timestamp
    // 카멜표기 사용
    private Timestamp createdAT;
}
