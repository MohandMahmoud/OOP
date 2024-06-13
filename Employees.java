public class Employees {
    public String name;
    public String address;
    public float salary;

    private static float SumOfsSalaries=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static float getSumOfsSalaries() {
        return SumOfsSalaries;
    }

    public static void setSumOfsSalaries(float sumOfsSalaries) {
        SumOfsSalaries = sumOfsSalaries;
    }

    public Employees(String name, float salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employees(String name, String address, float salary) {
       this(name,salary);
       this.address=address;
    }

    public Employees(String name) {
        this(name,1000);
    }
    public Employees() {
       this("Ahmed","dkvlsnlsrnkvd",1000);
    }
    public static float Sum_Of_sSalaries(float salary)
    {
        SumOfsSalaries+=salary;
        return SumOfsSalaries;
    }

}
