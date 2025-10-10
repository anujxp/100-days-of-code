package Question;

/*
 06_AbstractionDemo.java
 Uses interface and abstract class to show abstraction.
*/
interface Payable {
    double pay();
}

abstract class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double monthlyPay();

    public String getName() {
        return name;
    }
}

class SalariedEmployee extends Employee implements Payable {
    double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double monthlyPay() {
        return salary / 12.0;
    }

    @Override
    public double pay() {
        return monthlyPay();
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        System.out.println("--- 06_AbstractionDemo ---");
        SalariedEmployee e = new SalariedEmployee("Ria", 60000);
        System.out.println(e.getName() + " monthly=" + e.monthlyPay());
    }
}
