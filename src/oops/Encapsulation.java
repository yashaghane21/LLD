package oops;

 class Employee {
    private int salary;
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary()
    {
        return salary;
    }
}


public class Encapsulation{
   public static void main(String args[]){
    Employee e=new Employee();
    e.setSalary(444);
    System.err.println(e.getSalary());
   }
}