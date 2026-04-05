
package phase01;

class Employee2 {
    String name;
    double salary;
    
    Employee2(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void show() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee2 {
    double bonus;
    
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    
    @Override
    public void show() {
        super.show();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total: " + (salary + bonus));
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Manager m = new Manager("Sai", 50000, 10000);
        m.show();
    }
}