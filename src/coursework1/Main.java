package coursework1;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
            employees[0] = new Employee("Иванов Иван Иванович", 5,  30500);
            employees[1] = new Employee("Петров Петр Петрович", 2, 35450);
            employees[2] = new Employee("Сидоров Сидор Сидорович", 1, 40200);
            employees[3] = new Employee("Кузьмина Мария Ивановна", 4, 45500);
            employees[4] = new Employee("Тагаев Артур Владиславович", 3, 50000);
            employees[5] = new Employee("Кислов Александр Юрьевич", 5, 55000);
            employees[6] = new Employee("Иванова Юлия Ивановна", 5, 30000);
            employees[7] = new Employee("Марченко Василий Викторович", 1, 35000);
            employees[8] = new Employee("Петрова Юлия Петровна", 2, 45000);
            employees[9] = new Employee("Васильев Василий Васильевич", 3, 50000);


        for (Employee e: employees) {
            System.out.println(e);
        }
        System.out.println(" ");
        int sumSalary = (int) Employee.sumSalary(employees);
        System.out.println("Сумма всех зарплат : " + sumSalary);

        System.out.println(" ");
        Employee employee = Employee.minSalary(employees);
        System.out.println(employee.getFIO());

        System.out.println(" ");
        Employee employee1 = Employee.maxSalary(employees);
        System.out.println(employee1.getFIO());

        System.out.println(" ");
        float employee2 = Employee.averageSalary(employees);
        System.out.println(employee1.sumSalary(employees));


        System.out.println(" ");
        Employee.showEmployee(employees);

    }
}
