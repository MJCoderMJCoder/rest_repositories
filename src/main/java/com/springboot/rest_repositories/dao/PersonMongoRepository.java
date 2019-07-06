package com.springboot.rest_repositories.dao;

import com.springboot.rest_repositories.enity.Person;
import com.springboot.rest_repositories.enity.PersonMongo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "mongo", path = "mongo")
public interface PersonMongoRepository extends MongoRepository<PersonMongo, String> {
    List<PersonMongo> findByLastName(@Param("name") String name);
}
