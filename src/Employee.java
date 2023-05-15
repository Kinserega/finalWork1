public class Employee {
    private static int counts = 1;
    private final int id = counts++;
    private String person;
    private Office office;
    private float salary;




    public Employee(String person, Office office, float salary) {
        this.person = person;
        this.office = office;
        this.salary = salary;


    }

    public void setOffice(Office office) {
        this.office = office;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPerson() {
        return person;
    }

    public Office getOffice() {
        return office;
    }

    public float getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Сотрудник: " +
                "id=" + id +
                ", person='" + person + '\'' +
                ", office=" + office +
                ", salary=" + salary +
                '}';
    }

}
