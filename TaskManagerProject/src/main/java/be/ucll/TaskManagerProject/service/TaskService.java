package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();

    void addTask(Task task);

    Task getTaskById(int id);
}
