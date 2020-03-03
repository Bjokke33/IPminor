package be.ucll.TaskManagerProject.Repository;

import be.ucll.TaskManagerProject.domain.Task;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TaskRepository {
    private List<Task> taskList;

    public TaskRepository(){
        taskList = new ArrayList<>();

        //adds dummy data to the ArrayList
        dummyData();
    }


    //method to add dummyData
    public void dummyData(){
        Task task1 = new Task("task1", "task1", LocalDate.of(2020, 3, 20), LocalTime.of(10,0));
        Task task2 = new Task("task2", "task2", LocalDate.of(2020,3, 21), LocalTime.of(18,0));
        Task task3 = new Task("task3", "task3", LocalDate.of(2020,3,27), LocalTime.of(17,0));
        Task task4 = new Task("taskAndereConstructor", "description", "2020 3 10 10");
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);
        taskList.add(task4);
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public List<Task> getTasks(){
        return taskList;
    }

    public Task getTaskById(int id){
        return taskList.get(id);
    }
}
