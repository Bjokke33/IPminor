package be.ucll.TaskManagerProject.domain;

public class SubTask {
    String title;
    String description;

    public SubTask(String title, String description){

    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
