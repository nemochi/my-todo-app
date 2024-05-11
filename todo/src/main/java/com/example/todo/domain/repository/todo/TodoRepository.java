package com.example.todo.domain.repository.todo;

import java.util.Collection;

import com.example.todo.domain.model.Todo;

public interface TodoRepository {
    Todo findById(String todo);

    Collection<Todo> findAll();

    void create(Todo todo);

    boolean update(Todo todo);

    void delete(Todo todo);

    long countByFinished(boolean finished);
}
