package be.ucll.TaskManagerProject.domain;

import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

//todo setters nakijken!
public abstract class Task {
    private static int counter = 0;
    private int id;
    private LocalDate date;
    private LocalTime time;
    private String title;
    private String description;


    public Task(){
        setId();
    }

    public Task(String title, String description, LocalDate date, LocalTime time) {
       setId();
       setTitle(title);
       setDescription(description);
       setDate(date);
       setTime(time);
    }

    @Autowired
    public Task(String title, String description, String dateAndTime){
        setId();
        setTitle(title);
        setDescription(description);
        setDateAndTime(dateAndTime);
    }

    public Task(int id, String title, String description, String dateAndTime){
        setId(id);
        setTitle(title);
        setDescription(description);
        setDateAndTime(dateAndTime);
    }
    private void setId(int id){
        this.id = id;
    }
    private void setId(){
        this.id = counter;
        counter += 1;
    }

    public int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getDueDateForEdit(){

        return date.format(DateTimeFormatter.ofPattern("YYYY MM dd")).toString() + " "+ Integer.toString(time.getHour());
    }

    public void setDateAndTime(String dateAndTime){
        String[] parts = dateAndTime.split(" ");
        setDate(LocalDate.of(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2])));
        setTime(LocalTime.of(Integer.parseInt(parts[3]),0));
    }
}