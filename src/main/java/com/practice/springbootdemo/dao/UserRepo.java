package com.practice.springbootdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.practice.springbootdemo.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {
    // Crud repository < kis type ka data handle karna hai , uski id kis type ki hai
    // >

    // we have to only create this interface

    // to create custom finder methods
    // here find is introducer and byname is criteria and name is property
    public List<User> findByName(String name);

    public List<User> findByNameAndCity(String name, String city);

    // using JPQL
    @Query("select u from User u")
    public List<User> findAllUsers();

    // Using parameterized JPQL here :n is binding name to n
    @Query("select u from User u where u.name =:n")
    public List<User> getUserByName(@Param("n") String name);

    // using native SQL query
    @Query(value = "select * from user", nativeQuery = true)
    public List<User> getUsers();
}
