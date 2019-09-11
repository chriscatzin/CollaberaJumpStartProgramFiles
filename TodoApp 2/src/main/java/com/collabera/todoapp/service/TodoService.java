package com.collabera.todoapp.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.collabera.todoapp.model.Todo;

@Service
public class TodoService implements TodoInterface {
	
	// CRUD
	
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int todoCount=4;
	
	static {
		todos.add(new Todo(1, "vijay",  "Shopping", new Date(), false ));
		todos.add(new Todo(2, "vijay",  "Prepare a report", new Date(), false ));
		todos.add(new Todo(3, "vijay",  "Do someting", new Date(), false ));
		todos.add(new Todo(4, "admin",  "admin todo task", new Date(), false ));
	}
	
	// read admin
	public List<Todo> listTodos(String userName){
		List<Todo> filteredTodos = new ArrayList<Todo>();
        for (Todo todo : todos) {
            if (todo.getUser().equals(userName)) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
	}
	
	public Todo getTodo(int id){
		 for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
	}
	
	// create
	public Todo addTodo(String user, String desc, Date targetDate, Boolean isDone) {
		Todo newTodo = new Todo(++todoCount, user,  desc,  targetDate,  isDone );
		todos.add(newTodo);
		return newTodo;
	}
	
	// delete
	public Todo deleteTodo(int todoId) {
		Todo deleteTodo = todos.stream()
				  .filter(todo -> todo.getId() == todoId)
				  .findFirst()
				  .orElse(null);
		todos.remove(deleteTodo);
		return deleteTodo;
	}

	public Todo updateTodo(Todo todo) {
		deleteTodo(todo.getId());
		todos.add(todo);
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
