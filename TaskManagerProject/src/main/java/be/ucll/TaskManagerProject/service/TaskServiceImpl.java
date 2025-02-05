package be.ucll.TaskManagerProject.service;

import be.ucll.TaskManagerProject.Repository.TaskRepository;
import be.ucll.TaskManagerProject.domain.HeadTask;
import be.ucll.TaskManagerProject.domain.SubTask;
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

    @Override
    public Task getTaskById(int id) {
        return taskRepository.getTaskById(id);
    }

    @Override
    public Task editTask(int id, HeadTask task){
        return taskRepository.editTask(id, task);
    }

    @Override
    public boolean checkId(int id){
        return taskRepository.checkId(id);
    }

    @Override
    public void addSubTask(SubTask subtask, int id){
        taskRepository.addSubTask(subtask, id);
    }
}
