public  abstract class Employee {
    public double getBaseSalary() {
        return baseSalary;
    }

    public  int baseSalary;
    static int count;
    public Employee(int baseSalary) {
        this.baseSalary = baseSalary;
        count++;
    }


     abstract double calcSalary();
}
class Normal extends Employee{
    public Normal(int baseSalary) {
        super(baseSalary);
    }

    @Override
    double calcSalary() {
        return baseSalary*1.2;


    }
}
class Manger extends Employee{
    public Manger(int baseSalary) {
        super(baseSalary);
    }

    @Override
    double calcSalary() {
        return baseSalary*1.5;

    }
}
class Trainee extends Employee{
    public Trainee(int baseSalary) {
        super(baseSalary);
    }

    @Override
    double calcSalary() {
        return baseSalary*1;

    }
}
class  trainee extends Employee{
    public trainee(int baseSalary) {
        super(baseSalary);
    }

    @Override
    double calcSalary() {
        return 0;
    }
}