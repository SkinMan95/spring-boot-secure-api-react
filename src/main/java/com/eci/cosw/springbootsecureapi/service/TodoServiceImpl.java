package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoServiceImpl implements TodoService {

    private List<Todo> todoList;

    public TodoServiceImpl() {
        todoList = new ArrayList<>();
    }

    @PostConstruct
    public void populateDummyData() {
        todoList.add(new Todo("dummy0", 0, LocalDate.now()));
        todoList.add(new Todo("dummy1", 1, LocalDate.now()));
    }

    @Override
    public List<Todo> getTodoList() {
        return todoList;
    }

    @Override
    public Todo addTodo(Todo todo) {
        System.out.println("added new todo: " + todo);
        todoList.add(todo);
        return todo;
    }
}
