package be.ucll.TaskManagerProject.domain;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class HeadTask extends Task {
    private List<SubTask> substasks;

    public HeadTask(){
        super();
        substasks = new ArrayList<>();
    }

    public HeadTask(String title, String description, LocalDate date, LocalTime time){
        super(title, description, date, time);
        substasks = new ArrayList<>();
    }

    public HeadTask(String title, String description, String dateAndTime){
        super(title, description, dateAndTime);
        substasks = new ArrayList<>();
    }

    public HeadTask(int id, String title, String description, String dateAndTime){
        super(id, title, description, dateAndTime);
        substasks = new ArrayList<>();
    }

    public List<SubTask> getSubstasks() {
        return substasks;
    }

    public void addSubTask(SubTask task){
        substasks.add(task);
    }

    public List<SubTask> getSubTasks(){
        return substasks;
    }
}
