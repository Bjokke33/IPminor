package be.ucll.TaskManagerProject.controller;

import be.ucll.TaskManagerProject.domain.HeadTask;
import be.ucll.TaskManagerProject.domain.Task;
import be.ucll.TaskManagerProject.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @GetMapping
    public String getIndex(){
        return "Index";
    }

    @GetMapping(value = "/tasks")
    public String getTasks(Model model){
        model.addAttribute("tasks", taskService.getTasks());

        return "TaskOverview";
    }

    @PostMapping(value = "/tasks")
    public String addTask(@ModelAttribute HeadTask task){
        taskService.addTask(task);
        return "redirect:/tasks";
    }

    @GetMapping(value="/new")
    public String createTask(){
        return "TaskCreate";
    }

    @GetMapping(value="/{id}")
    public String getTaskDetail(Model model, @PathVariable int id){
        model.addAttribute("task", taskService.getTaskById(id));
        return "TaskDetail";
    }
}
