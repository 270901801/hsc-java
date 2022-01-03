package com.example.h2database;

import com.example.h2database.entity.JhDaikouRecord;
import com.example.h2database.repository.JhDaikouRecordRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2DatabaseApplication {


    @Bean
    InitializingBean saveData(JhDaikouRecordRepository repo){
        repo.save(new JhDaikouRecord("Get to know Spring Boot","Today I will learn Spring Boot","01/01/2016"));
        repo.save(new JhDaikouRecord("Simple Spring Boot Project","I will do my first Spring Boot Project","01/02/2016"));
        repo.save(new JhDaikouRecord("Spring Boot Reading","Read more about Spring Boot","02/01/2016"));
        repo.save(new JhDaikouRecord("Spring Boot in the Cloud","Spring Boot using Cloud Foundry","03/01/2016"));
        repo.findAll().stream().forEach(System.out::println);
        return ()->{
            repo.findAll();
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(H2DatabaseApplication.class, args);
    }

}
