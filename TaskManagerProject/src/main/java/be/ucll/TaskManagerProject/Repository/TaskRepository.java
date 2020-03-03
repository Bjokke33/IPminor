package be.ucll.TaskManagerProject.Repository;

import be.ucll.TaskManagerProject.domain.HeadTask;
import be.ucll.TaskManagerProject.domain.Task;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Repository
public class TaskRepository {
    private List<HeadTask> headTasks;
    private List<Task> taskList;

    public TaskRepository(){
        taskList = new ArrayList<>();
        taskList = new ArrayList<>();
        //adds dummy data to the ArrayList
        dummyData();
    }


    //method to add dummyData
    public void dummyData(){
        HeadTask task1 = new HeadTask("task1", "task1", LocalDate.of(2020, 3, 20), LocalTime.of(10,0));
        HeadTask task2 = new HeadTask("task2", "task2", LocalDate.of(2020,3, 21), LocalTime.of(18,0));
        HeadTask task3 = new HeadTask("task3", "task3", LocalDate.of(2020,3,27), LocalTime.of(17,0));
        HeadTask task4 = new HeadTask("taskAndereConstructor", "description", "2020 3 10 10");
        addTask(task1);
        addTask(task2);
        addTask(task3);
        addTask(task4);
    }

    public void addTask(Task task){
        taskList.add(task);
        if(task instanceof HeadTask){
            headTasks.add((HeadTask)task);
        }
    }

    public List<HeadTask> getTasks(){
        return headTasks;
    }

    public Task getTaskById(int id){
        return taskList.get(id);
    }
}
