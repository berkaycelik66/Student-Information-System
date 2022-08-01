public class Main {

    public static void main(String[] args) {
        Course math = new Course("Matematik", "MAT");
        Course physics = new Course("Fizik", "FZK");
        Course chemistry = new Course("Kimya", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT", "mahmuthoca@medeniyet.edu.tr");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK", "fatmaayse@medeniyet.edu.tr");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY", "aliveli@medeniyet.edu.tr");

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "140144015", 4, math, physics, chemistry);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkVerbalNote(70, 60, 20);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "2211133", 4, math, physics, chemistry);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkVerbalNote(50, 60, 90);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "221121312", 4, math, physics, chemistry);
        s3.addBulkExamNote(50, 20, 40);
        s3.addBulkVerbalNote(60, 75, 50);
        s3.isPass();
    }
}
