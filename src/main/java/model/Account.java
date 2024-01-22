package model;

import lombok.Getter;

import java.sql.Timestamp;

/**
 *  DB에 SELECT한 데이터를 담을 Object
 */
@Getter
public class Account {
    private int number;
    private String password;
    private int balance;

    // java/sql의 Timestamp
    // 카멜표기 사용
    private Timestamp createdAT;
}
