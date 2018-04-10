package com.greenfoxacademy.listingtodosfromembedded.repository;

import com.greenfoxacademy.listingtodosfromembedded.models.Todo;
import org.springframework.data.repository.CrudRepository;


public interface TodoRepository extends CrudRepository<Todo, Long> {
}
