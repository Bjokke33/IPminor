package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.Repository.TaskRepository;
import be.ucll.TaskManagerProject.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public List<Task> getTasks() {
        return taskRepository.getTasks();
    }

    @Override
    public void addTask(Task task) {
        taskRepository.addTask(task);
    }
}
