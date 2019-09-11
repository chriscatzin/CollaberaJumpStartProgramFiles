package com.collabera.todoapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.todoapp.model.User;

@Service
public class UserService {

	// CRUD

	private static List<User> users = new ArrayList<User>();
	
	private static int userCount=2;
	
	static {
		users.add(new User(1, "vijay",  "vijay", "Vijay Reddy" ));
		users.add(new User(2, "admin",  "admin", "Admin"));
	}
	
	// read admin
		public List<User> listUsers(){
	        return users;
		}
		
		public User getUser(int id){
			 for (User User : users) {
	            if (User.getId() == id) {
	                return User;
	            }
	        }
	        return null;
		}
		
		// create
		public User addUser(String userName, String password,String fullname) {
			User newUser = new User(++userCount, userName,  password,  fullname );
			users.add(newUser);
			return newUser;
		}
		
		// delete
		public User deleteUser(int userId) {
			User deleteUser = users.stream()
					  .filter(user -> user.getId() == userId)
					  .findFirst()
					  .orElse(null);
			users.remove(deleteUser);
			return deleteUser;
		}

		public User updateUser(User user) {
			deleteUser(user.getId());
			users.add(user);
			return user;
		}
}
