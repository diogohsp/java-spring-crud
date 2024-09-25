package com.br.crud.crud_spring.service;

import com.br.crud.crud_spring.model.Task;
import com.br.crud.crud_spring.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Task save (Task task) {
        return this.taskRepository.save(task);
    }

    public List<Task> findAll() {
        return this.taskRepository.findAll();
    }

    public Task findById(String id){
        return this.taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found"));
    }

    public void completed(String id){
        var task = this.findById(id);
        task.setCompleted(true);
        this.taskRepository.save(task);
    }

    public void delete(String id){
        this.taskRepository.deleteById(id);
    }

}
