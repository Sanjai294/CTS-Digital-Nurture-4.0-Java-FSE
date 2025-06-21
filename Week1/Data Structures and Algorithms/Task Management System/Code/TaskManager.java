import java.util.*;
import java.time.LocalDate;

public class TaskManager {
    private Map<String, Task> taskMap;
    private List<Task> taskList;

    public TaskManager() {
        taskMap = new HashMap<>();
        taskList = new ArrayList<>();
    }

    public void addTask(Task task) {
        taskMap.put(task.getTaskId(), task);
        taskList.add(task);
    }

    public Task searchTask(String id) {
        return taskMap.get(id);
    }

    public void removeTask(String id) {
        Task task = taskMap.remove(id);
        if (task != null) {
            taskList.remove(task);
        }
    }

    public void markTaskCompleted(String id) {
        Task task = taskMap.get(id);
        if (task != null) {
            task.markCompleted();
        }
    }

    public List<Task> getTasksSortedByPriority() {
        List<Task> sorted = new ArrayList<>(taskList);
        sorted.sort(Comparator.comparingInt(Task::getPriority));
        return sorted;
    }

    public List<Task> getTasksSortedByDueDate() {
        List<Task> sorted = new ArrayList<>(taskList);
        sorted.sort(Comparator.comparing(Task::getDueDate));
        return sorted;
    }

    public List<Task> getAllTasks() {
        return new ArrayList<>(taskList);
    }

    public List<Task> getPendingTasks() {
        List<Task> result = new ArrayList<>();
        for (Task task : taskList) {
            if (!task.isCompleted()) {
                result.add(task);
            }
        }
        return result;
    }

    public List<Task> getCompletedTasks() {
        List<Task> result = new ArrayList<>();
        for (Task task : taskList) {
            if (task.isCompleted()) {
                result.add(task);
            }
        }
        return result;
    }
}
