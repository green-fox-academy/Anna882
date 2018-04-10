package com.greenfox.connectionwithmysql.repository;


import com.greenfox.connectionwithmysql.models.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
