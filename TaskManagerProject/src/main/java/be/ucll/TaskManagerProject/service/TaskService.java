package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.domain.HeadTask;
import be.ucll.TaskManagerProject.domain.Task;

import java.util.List;

public interface TaskService {
    List<HeadTask> getTasks();

    void addTask(HeadTask task);

    Task getTaskById(int id);
}
