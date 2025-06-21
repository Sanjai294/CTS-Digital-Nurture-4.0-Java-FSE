import java.time.LocalDate;
import java.util.List;

public class TaskSystem {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task("T101", "Submit Report", "Monthly report submission", LocalDate.of(2025, 6, 25), 1));
        manager.addTask(new Task("T102", "Fix Bug #203", "NullPointerException in login", LocalDate.of(2025, 6, 24), 2));
        manager.addTask(new Task("T103", "Team Meeting", "Quarterly sync", LocalDate.of(2025, 6, 30), 3));
        manager.addTask(new Task("T104", "Update Resume", "Add recent project", LocalDate.of(2025, 6, 28), 2));

        System.out.println("All Tasks:");
        print(manager.getAllTasks());

        System.out.println("\nTasks Sorted by Priority:");
        print(manager.getTasksSortedByPriority());

        System.out.println("\nTasks Sorted by Due Date:");
        print(manager.getTasksSortedByDueDate());

        System.out.println("\nMarking T101 as Completed");
        manager.markTaskCompleted("T101");

        System.out.println("\nPending Tasks:");
        print(manager.getPendingTasks());

        System.out.println("\nCompleted Tasks:");
        print(manager.getCompletedTasks());

        System.out.println("\nSearching for Task T102:");
        Task found = manager.searchTask("T102");
        if (found != null) {
            System.out.println(found);
        }

        System.out.println("\nRemoving Task T103...");
        manager.removeTask("T103");

        System.out.println("\nTasks after Removal:");
        print(manager.getAllTasks());
    }

    private static void print(List<Task> tasks) {
        for (Task t : tasks) {
            System.out.println(t);
        }
    }
}
