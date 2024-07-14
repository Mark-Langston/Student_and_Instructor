public class Main {
    public static void main(String[] args) {
        Person testPerson = new Person("Mark", 1986);
        Student testStudent = new Student("Art", 1990, "Computer Science");
        Instructor testInstructor = new Instructor("Prof. Smith", 1981, 99000);

        System.out.println(testPerson);
        System.out.println(testStudent);
        System.out.println(testInstructor);
    }
}