package be.ucll.TaskManagerProject.controller;

import be.ucll.TaskManagerProject.domain.Task;
import be.ucll.TaskManagerProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getTasks(Model model){
        model.addAttribute("tasks", taskService.getTasks());

        return "TaskOverview";
    }

    @PostMapping
    public String addTask(@ModelAttribute Task task){
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping(value="/new")
    public String createTask(){
        return "TaskCreate";
    }

}
