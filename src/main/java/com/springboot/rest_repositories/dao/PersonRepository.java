package com.springboot.rest_repositories.dao;

import com.springboot.rest_repositories.enity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * This repository is an interface and will allow you to perform various operations involving Person objects. It gets these operations by extending the PagingAndSortingRepository interface defined in Spring Data Commons.
 * At runtime, Spring Data REST will create an implementation of this interface automatically. Then it will use the @RepositoryRestResource annotation to direct Spring MVC to create RESTful endpoints at /people.
 *
 * @RepositoryRestResource is not required for a repository to be exported. It is only used to change the export details, such as using /people instead of the default value of /persons.
 */
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface PersonRepository extends PagingAndSortingRepository<Person, Long> {
    List<Person> findByLastName(@Param("name") String name);
}
