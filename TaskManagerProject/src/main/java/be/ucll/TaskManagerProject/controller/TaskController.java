package be.ucll.TaskManagerProject.controller;

import be.ucll.TaskManagerProject.Repository.RepositoryException;
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

    @GetMapping(value="/tasks/{id}")
    public String getTaskDetail(Model model, @PathVariable int id){
        try {
            model.addAttribute("task", taskService.getTaskById(id));
            return "TaskDetail";
        }
        catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "Error";
        }
    }

    @GetMapping(value="/tasks/edit/{id}")
    public String editTask(Model model, @PathVariable int id){
        try{
            model.addAttribute("task", taskService.getTaskById(id));
            model.addAttribute("id", id);
            return "EditTask";
        }
        catch(Exception e){
            model.addAttribute("error", e.getMessage());
            return "Error";
        }
    }

    @PostMapping(value="tasks/edit/EditTask")
    public String TaskEdited(Model model, @RequestParam int id, @RequestParam String title, @RequestParam String description, @RequestParam String dueDate){
        HeadTask task = new HeadTask(id, title,description,dueDate);
        taskService.editTask(id, task);
        model.addAttribute("task", taskService.getTaskById(id));
        return "TaskDetail";
    }
}
