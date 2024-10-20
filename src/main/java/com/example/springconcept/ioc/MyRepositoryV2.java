package com.example.springconcept.ioc;

public class MyRepositoryV2 implements Repository {
    @Override
    public void queryDatabase() {
        System.out.println("데이터베이스 쿼리 실행 V2");
    }
}
