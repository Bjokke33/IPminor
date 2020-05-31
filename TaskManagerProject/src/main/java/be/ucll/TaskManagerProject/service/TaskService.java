package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.domain.HeadTask;
import be.ucll.TaskManagerProject.domain.SubTask;
import be.ucll.TaskManagerProject.domain.Task;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();

    void addTask(Task task);

    Task getTaskById(int id);

    Task editTask(int id, HeadTask task);

    boolean checkId(int id);

    void addSubTask(SubTask task, int id);
}
