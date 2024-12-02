package dayThree;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name,int age,double salary){
        this.name = name;
        this.age =age;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Details of the Employee");
        System.out.println("Name : "+name);
        System.out.println("Age : "+ age);
        System.out.println("Salary : "+salary);
    }

    public double bonusesCalculate(){
        System.out.println("**Bonus of the Employee**");
        return salary * 0.10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
       Employee emp = new Employee("Saiteja",21,50000);

       emp.displayDetails();
       emp.setName("TEJA");
       emp.displayDetails();

        System.out.println(emp.bonusesCalculate());


    }
}



