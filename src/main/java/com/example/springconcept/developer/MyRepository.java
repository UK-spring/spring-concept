package com.example.springconcept.developer;

import com.example.springconcept.common.Repository;

public class MyRepository implements Repository {
    @Override
    public void queryDatabase() {
        System.out.println("데이터베이스 쿼리 실행");
    }
}
