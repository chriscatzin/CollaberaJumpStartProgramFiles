package com.collabera.todoapp.service;

import java.util.Date;
import java.util.List;

import com.collabera.todoapp.model.Todo;

public interface TodoInterface {

	// read
		public List<Todo> listTodos(String userName);
		
		public Todo getTodo(int todoId);
		
		// create
		public Todo addTodo(String user, String desc, Date targetDate, Boolean isDone);
		
		// delete
		public Todo deleteTodo(int todoId) ;

		public Todo updateTodo(Todo todo) ;

}
