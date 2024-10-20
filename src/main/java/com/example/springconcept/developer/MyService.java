package com.example.springconcept.developer;

import com.example.springconcept.common.Repository;
import com.example.springconcept.common.Service;

public class MyService implements Service {

    private Repository repository;

    // 의존성 주입
    public MyService(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void doSomething() {
        System.out.println("서비스 작업 실행");
        repository.queryDatabase();
    }
}
