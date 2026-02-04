package lab3;

public class Study {
    private String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        System.out.print(course);
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study newCourse = new Study("Изучение Java - это просто!");
        newCourse.printCourse();
    }
}
