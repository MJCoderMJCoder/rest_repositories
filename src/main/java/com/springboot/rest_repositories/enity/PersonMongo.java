package com.springboot.rest_repositories.enity;

//======================= Accessing MongoDB Data with REST：https://spring.io/guides/gs/accessing-mongodb-data-rest/ =======================

import org.springframework.data.annotation.Id;

public class PersonMongo {
    @Id
    private String id;
    private String firstName;
    private String lastName;

    public PersonMongo() {
    }

    public PersonMongo(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        return "PersonMongo{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
