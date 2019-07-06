package com.springboot.rest_repositories.enity;

//======================= Accessing JPA Data with REST：https://spring.io/guides/gs/accessing-data-rest/ =======================

import javax.persistence.Entity;
import javax.persistence.GenerationType;

//======================= Accessing Neo4j Data with REST：https://spring.io/guides/gs/accessing-neo4j-data-rest/ =======================
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


//@Entity
@NodeEntity
public class Person {
    //    @Id
    //    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;


    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
