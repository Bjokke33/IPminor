package be.ucll.TaskManagerProject.domain;

import java.util.Date;
import java.util.Timer;

public class Task {
    private String TaskNumber;
    private Date datum;
    private Timer time;

    public Task(String taskNumber, Date datum, Timer time) {
       setTaskNumber(taskNumber);
       setDatum(datum);
       setTime(time);
    }

    public String getTaskNumber() {
        return TaskNumber;
    }

    public void setTaskNumber(String taskNumber) {
        TaskNumber = taskNumber;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Timer getTime() {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }
}
