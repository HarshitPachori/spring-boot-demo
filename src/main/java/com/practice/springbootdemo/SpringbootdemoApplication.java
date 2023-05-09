package com.practice.springbootdemo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.practice.springbootdemo.dao.UserRepo;
import com.practice.springbootdemo.entities.User;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);
		UserRepo userRepo = context.getBean(UserRepo.class);

		// ........................ CRUD OPERATIONS ...........................
		// insert

		// User user = new User();
		// user.setName("Harshit Pachori");
		// user.setCity("Aligarh");
		// user.setStatus("I am full stack developer...");
		// for saving single user
		// User user1 = userRepo.save(user);
		// System.out.println(user1);

		// create object of user, product, books, etc

		// User user1 = new User();
		// user1.setName("Harshit Pachori");
		// user1.setCity("Aligarh");
		// user1.setStatus("I am full stack developer...");

		// User user2 = new User();
		// user2.setName("Harshit Pachori");
		// user2.setCity("Aligarh");
		// user2.setStatus("I am full stack developer...");

		// for saving multiple objects

		// List<User> users = List.of(user1, user2);
		// Iterable<User> res = userRepo.saveAll(users);
		// // lambda function
		// res.forEach(user -> {
		// System.out.println(user);
		// });
		// System.out.println(user1);

		// update

		// Optional<User> optional = userRepo.findById(2);
		// User user = optional.get();
		// user.setName("Rahul Sharma");
		// user.setCity("Mathura");
		// userRepo.save(user);
		// System.out.println(user);

		// read data

		// findById(id) --> return optional containing data
		// findAll() --> returns Iterable<Object> containing data

		// Iterable<User> itr = userRepo.findAll();
		// itr.forEach(user -> {
		// System.out.println(user);
		// });

		// ...........or............

		// Iterator<User> iterator = itr.iterator();
		// while (iterator.hasNext()) {
		// User user = iterator.next();
		// System.out.println(user);
		// }

		// Delete

		// to delete single entity
		// userRepo.delete(user);
		// to delete all the entities
		// userRepo.deleteAll();
		// delete all the entities given in the provided list of users
		// userRepo.deleteAll(userslist);
		// delete all the entities given in the provided list of user id
		// userRepo.deleteAllById(userlist);
		// delete the entity with given id
		// userRepo.deleteById(2);
		// System.out.println(userRepo.findAll());

		// List<User> res = userRepo.findByName("Harshit Pachori");
		// res.forEach(user -> System.out.println(user));

		List<User> userByName = userRepo.getUserByName("Harshit Pachori");
		userByName.forEach(user -> {
			System.out.println(user);
		});
	}

}
