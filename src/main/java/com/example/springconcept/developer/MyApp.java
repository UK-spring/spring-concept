package com.example.springconcept.developer;

import com.example.springconcept.common.Repository;
import com.example.springconcept.common.Service;

public class MyApp {
    public static void main(String[] args) {
        Repository repository = new MyRepository();

        // Repository repo = new MyRepositoryV2();

        Service service = new MyService(repository);
        // Service service = new MyServiceV2(repository);

        service.doSomething();
    }
}
