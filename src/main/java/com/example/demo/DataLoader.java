package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    TodoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo = new Todo("2001", "2002", "200000000001");
        repository.save(todo);

        todo = new Todo("Toyota", "Scion", "Silverado1x");
        repository.save(todo);

        todo = new Todo("Bladerunner", "Tacoma", "Superdutytahoe");
        repository.save(todo);


    }
}
