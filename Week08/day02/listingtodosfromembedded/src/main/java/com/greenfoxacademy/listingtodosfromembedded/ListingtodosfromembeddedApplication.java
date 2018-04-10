package com.greenfoxacademy.listingtodosfromembedded;

import com.greenfoxacademy.listingtodosfromembedded.models.Todo;
import com.greenfoxacademy.listingtodosfromembedded.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ListingtodosfromembeddedApplication implements CommandLineRunner{

  @Autowired
  TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ListingtodosfromembeddedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop"));
  }
}
