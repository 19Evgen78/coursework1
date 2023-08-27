package coursework1;

public class Employee {
    private static int count;
    private final int Id;
    private String FIO;
    private int Department;
    private int Salary;

    public int getId() {
        return Id;
    }

    public static int getCount() {
        return count;
    }

    public String getFIO() {
        return FIO;
    }

    public int getDepartment() {
        return Department;
    }

    public int getSalary() {
        return Salary;
    }

    public void SetDepartment(int dept) {
        this.Department = dept;
    }

    public void SetSalary(int sal) {
        this.Salary = sal;
    }

    // Constructor
    public Employee(String fio, int dept, int salary) {
        count++;
        this.Id = count;
        this.FIO = fio;
        this.Department = dept;
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", FIO='" + FIO + '\'' +
                ", Department=" + Department +
                ", Salary=" + Salary +
                '}';
    }

    public static double sumSalary(Employee[] employees) {
        int sumSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sumSalary = sumSalary + employee.getSalary();
            }
        }
        return sumSalary;
    }

    public static Employee minSalary(Employee[] employees) {
        int index = 0;
        int minSalary = Integer.MAX_VALUE;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && minSalary > employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                index = i;
            }
        }
        return employees[index];
    }

    public static Employee maxSalary(Employee[] employees) {
        int index = 0;
        int maxSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                if (maxSalary < employees[i].getSalary()) {
                    maxSalary = employees[i].getSalary();
                    index = i;
                }
            }
        }
        return employees[index];
    }

    public static float averageSalary(Employee[] employees) {
        int a = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                a++;
            }
        }
        if (a == 0) {
            return 0;
        }
        float sumSalary1;
        sumSalary1 = (float) sumSalary(employees);
        float averageSalary = sumSalary1 / a;

        return averageSalary;
    }

    public static void showEmployee(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println("ФИО сотрудников : " + employees[i].getFIO());
            }
        }
    }

}
