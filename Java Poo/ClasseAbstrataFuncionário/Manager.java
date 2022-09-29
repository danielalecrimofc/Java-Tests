public class Manager extends Employee {
    public Manager() {
        super();
    }

    public void increaseSalary(){
        salary = salary + (salary*0.20);
        System.out.println("Manager salary = " + salary);
    }
}
