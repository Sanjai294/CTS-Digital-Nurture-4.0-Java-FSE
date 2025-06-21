public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = new Student("S101", "Akhil");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("Ravi");
        controller.updateView();
    }
}
