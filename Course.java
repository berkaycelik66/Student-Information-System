public class Course {

    Teacher courseTeacher;
    String name;
    String prefix;
    int verbalNote;
    int note;

    public Course(String name, String prefix) {
        this.name = name;
        this.prefix = prefix;
        this.verbalNote = 0;
        this.note = 0;
    }

    public void addTeacher(Teacher courseTeacher) {
        if (courseTeacher.branch.equals(this.prefix)) {
            this.courseTeacher = courseTeacher;
            System.out.println("Transaction successful.");
        } else {
            System.out.println("Academician cannot teach this course");
        }
    }

    public void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println("Academician of the " + this.name + ": " + this.courseTeacher.name);
        } else {
            System.out.println(this.name + " does not have an academician yet.");
        }
    }
}
