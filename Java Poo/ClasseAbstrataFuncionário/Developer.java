public class Developer extends Employee{
    public Developer() {
        super();
    }

    public void increaseSalary(){
            salary = salary + (salary*0.40);
            System.out.println("Development salary = " + salary);

    }
}
