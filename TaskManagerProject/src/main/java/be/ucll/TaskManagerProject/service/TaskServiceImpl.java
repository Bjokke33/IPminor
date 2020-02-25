package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.domain.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    private List<Task> tasks;

    TaskServiceImpl(){
        tasks = new ArrayList<>();
    }
    @Override
    public List<Task> getTasks() {
        return null;
    }
}
