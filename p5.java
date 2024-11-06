import empPackage.Employee;
class PermanentEmp extends Employee{
    PermanentEmp(String n, String i, double b, double d, double h){
        name = n; ID = i; bs = b; DA = d; HRA = h;  
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Basic salary: "+bs);
        System.out.println("DA: "+((bs*DA)/100));
        System.out.println("HRA: "+((bs*HRA)/100));
        System.out.println("Total salary: "+(bs+((bs*HRA)/100)+((bs*DA)/100)));
    }
}
public class p5 {
    public static void main(String[] args) {
        PermanentEmp p = new PermanentEmp("Sagnik","CSE/22/008", 10000, 52.4, 33.3);
        p.display();
    }
}
