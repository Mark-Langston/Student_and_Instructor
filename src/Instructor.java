public class Instructor extends Person {
    private double salary;

    public Instructor(String name, int birthYear, double salary) {
        super(name, birthYear);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Instructor[name=%s, birthYear=%d, salary=$%.2f]", getName(), getBirthYear(), salary);
    }
}
