class Employee{
    String name;
    int id;
    int salary;
    Employee(String name,int id,int salary){
        this.name =name;
        this.id=id;
        this.salary=salary;
    }
    void displayinfo(){
        System.out.println("Name : "+name);
        System.out.println("Id : "+id);
        System.out.println("Salary : "+salary);
    }
}
class Programmer extends Employee{
    String language;
    Programmer(String name,int id,int salary,String language){
        super(name,id,salary);
        this.language=language;
    }
    void programmerinfo(){
        displayinfo();
        System.out.println("programming language: "+language);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
}
public class Company {
    public static void main(String args[]){
        Programmer p= new Programmer("Alice",32,10000,"java");
        p.displayinfo();
    }
}
