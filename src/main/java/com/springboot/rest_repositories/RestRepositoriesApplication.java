package com.springboot.rest_repositories;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//======================= Accessing Neo4j Data with REST：https://spring.io/guides/gs/accessing-neo4j-data-rest/ =======================
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@EnableTransactionManagement
//@EnableNeo4jRepositories
@SpringBootApplication
public class RestRepositoriesApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestRepositoriesApplication.class, args);
    }

}
