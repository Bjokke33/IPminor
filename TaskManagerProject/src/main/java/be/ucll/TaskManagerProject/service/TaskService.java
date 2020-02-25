package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskService {
    List<Task> getTasks();
}
