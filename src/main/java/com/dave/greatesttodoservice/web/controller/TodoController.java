package com.dave.greatesttodoservice.web.controller;

import com.dave.greatesttodoservice.web.model.TodoDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequestMapping("/api/v1/todo")
@RestController
public class TodoController {

    @GetMapping("/{todoId}")
    public ResponseEntity<TodoDto> getBeerById(@PathVariable("todoId") UUID todoId) {
        // todo impl put in real return
        return new ResponseEntity<>(TodoDto.builder().build(), HttpStatus.OK);
    }

}
