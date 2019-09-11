package com.collabera.todoapp.controlers;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.collabera.todoapp.model.Todo;
import com.collabera.todoapp.service.TodoInterface;

@Controller
@SessionAttributes("name")
public class TodoControler {

	// list todos
	
	@Autowired
	TodoInterface todoService;
	
	@RequestMapping(value="/todos", method= RequestMethod.GET)
	public String listTodos(ModelMap model) {
		
		
		List<Todo> todos = todoService.listTodos((String) model.get("name") );
		
		model.put("todos", todos);
		
		return "listtodos";
	}
	
	@RequestMapping(value="/addtodo", method= RequestMethod.GET)
	public String showAddTodo(ModelMap model) {
		
		model.put("todo", new Todo(0,(String) model.get("name") , "", new Date(), false));
		
		return "addtodo";
	}
	
	@RequestMapping(value="/addtodo", method= RequestMethod.POST)
	public String addTodo(ModelMap model, @Valid Todo todo, BindingResult result ) {

		if(result.hasErrors())
			return "addtodo";
		
		todoService.addTodo((String) model.get("name") , todo.getDesc(), new Date(), false);
		return "redirect:/todos";
	}
	
	@RequestMapping(value="/deletetodo", method= RequestMethod.GET)
	public String deleteTodo(ModelMap model, @RequestParam String todoId) {
		todoService.deleteTodo(Integer.parseInt(todoId));
		return "redirect:/todos";
	}
	
	
	@RequestMapping(value="/updatetodo", method= RequestMethod.GET)
	public String showUpdateTodo(ModelMap model, @RequestParam String todoId) {
		
		model.put("todo",todoService.getTodo(Integer.parseInt(todoId)));
		
		return "addtodo";
	}
	
	@RequestMapping(value="/updatetodo", method= RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result ) {

		System.out.println(todo.toString());
		
		if(result.hasErrors())
			return "addtodo";
		
		todoService.updateTodo(todo);
		return "redirect:/todos";
	}
	
}
