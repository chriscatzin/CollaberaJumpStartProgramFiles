package com.collabera.todoapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.todoapp.model.Todo;

@Service
public class TodoServiceDB  {
	
	// CRUD
	
	private static List<Todo> todos;
	
	// read
	public List<Todo> listTodos(String username){
		return todos;
	}
	
	// create
	public Todo addTodo(String user, String desc, Date targetDate, Boolean isDone) {
		Todo newTodo = new Todo(1, user,  desc,  targetDate,  isDone );
		todos.add(newTodo);
		return newTodo;
	}
	
	// delete
	public Todo deleteTodo(int todoId) {
		return todos.remove(todoId-1);
	}

	public Todo updateTodo(Todo todo) {
		todos.remove(todo.getId()-1);
		todos.add(todo.getId(),todo);
		return todo;
	}
	
}



//delete
//	public Todo deleteTodo(int Id) {
//		
//		Todo deleteTodo = todos.stream()
//				  .filter(todo -> todo.getId() == Id)
//				  .findFirst()
//				  .orElse(null);
//		
//		todos.remove( deleteTodo);
//		
//		return deleteTodo;
//	}
//
//	public Todo updateTodo(Todo todo) {
//		deleteTodo(todo.getId());
//		todos.add(todo);
//		return todo;
//	}
