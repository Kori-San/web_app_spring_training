package fr.lernejo.todo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/todo")
public class TodoListController {

    private final TodoRepository repository;
    TodoListController(TodoRepository todoRepository) {
        repository = todoRepository;
    }
    
    @GetMapping
    public Iterable<TodoEntity> getTodo() {
        return repository.findAll();
    }

    @PostMapping
    public void addTodo(@RequestBody TodoEntity todo) {
        repository.save(todo);
    }
}
