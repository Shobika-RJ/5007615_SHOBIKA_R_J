public class MVCPatternTest {
    public static void main(String[] args) {
       
        Student model = retrieveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Priya");
        controller.setStudentGrade("B");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setId("1");
        student.setName("Shobika");
        student.setGrade("A");
        return student;
    }
}
