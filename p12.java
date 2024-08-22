class Employee{
    String name, city; double salary;
    Employee(String n, String c, double s){
        name = n; city = c; salary = s;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("City: "+city);
        System.out.println("Salary: Rs. "+salary);
    }
}
class p12{
    public static void main(String[] args) {
        double s = Double.parseDouble(args[2]);
        Employee e = new Employee(args[0], args[1], Double.parseDouble(args[2]));
        e.display();
    }
}