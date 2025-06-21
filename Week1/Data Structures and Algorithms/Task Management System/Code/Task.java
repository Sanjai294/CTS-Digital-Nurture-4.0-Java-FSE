import java.time.LocalDate;

public class Task {
    private String taskId;
    private String title;
    private String description;
    private LocalDate dueDate;
    private int priority; // 1 = High, 2 = Medium, 3 = Low
    private boolean isCompleted;

    public Task(String taskId, String title, String description, LocalDate dueDate, int priority) {
        this.taskId = taskId;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.isCompleted = false;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void markCompleted() {
        this.isCompleted = true;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return "ID: " + taskId + ", Title: " + title + ", Due: " + dueDate +
                ", Priority: " + priority + ", Completed: " + isCompleted;
    }
}
