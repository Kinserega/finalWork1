public class Main {

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        Office office1 = new Office("Отдел 1");
        Office office2 = new Office("Отдел 2");
        Office office3 = new Office("Отдел 3");
        Office office4 = new Office("Отдел 4");
        Office office5 = new Office("Отдел 5");
        employee[0] = new Employee("Кравчук Сергей", office5, 68754);
        employee[1] = new Employee("Киндрат Сергей", office3, 56348);
        employee[2] = new Employee("Петров Иван", office3, 51854);
        employee[3] = new Employee("Чубий Петр", office2, 97534);
        employee[4] = new Employee("Мазват Ксения", office4, 85348);
        employee[5] = new Employee("Киршин Никита", office1, 53778);
        employee[6] = new Employee("Комарчук Матвей", office2, 45368);
        employee[7] = new Employee("Коростик Иван", office5, 87534);
        employee[8] = new Employee("Иванов Иван", office4, 64538);
        employee[9] = new Employee("Сидоров Игорь", office1, 48615);
        for (Employee i : employee) {
            System.out.println(i);
        }
        System.out.println("Сумма зарплат равна: " + summaSalary(employee));
        System.out.println("Минимальная зарплата: " + employeeWithMinSalary(employee));
        System.out.println("Максимальная зарплата: " + employeeWithMaxSalary(employee));
        System.out.println("Средняя зарплата: " + middleSummaSalary(employee));
        listEmployees(employee);
    }

    public static float summaSalary(Employee[] employees) {
        float summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ = summ + employees[i].getSalary();
        }
        return summ;
    }

    public static float employeeWithMinSalary(Employee[] employees) {
        float minSalary = 100_000;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
            }
        }
        return minSalary;
    }

    public static float employeeWithMaxSalary(Employee[] employees) {
        float maxSalary = 1;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
            }
        }
        return maxSalary;
    }

    public static float middleSummaSalary(Employee[] employees) {
        float summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ = summ + employees[i].getSalary();
        }
        float middleSum = summ / employees.length;
        return middleSum;
    }

    public static String listEmployees(Employee[] employees) {
        String list = null;
        System.out.println("Список сотрудников:");
        for (int i = 0; i < employees.length; i++) {
            list = employees[i].getPerson();
            System.out.println(list);
        }
        return null;
    }
}