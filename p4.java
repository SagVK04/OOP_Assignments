/*Create two interfaces Vehicle and Book, Vehicle interface consist of a method vehicle
Type() to print the message "the vehicle is car" and Book interface consist a method
book Type() to print the message "these are all Computer Science and Engineering
books". Create a class called MobileBookShopping which implements both the
interfaces. In main () create an object of the class to display type of vehicle and books.*/

interface Vehicle{
	public abstract void vehicleType();
}
interface Books{
    void bookType();
}
class MobileBookShopping implements Vehicle,Books{
	public void vehicleType(){
		System.out.println("The vehicle is car.");
    }
	public void bookType(){
		System.out.println("These are all Computer SCience and Engineering books. ");
	}
}
public class p4{
	public static void main(String args[]){
		MobileBookShopping m = new MobileBookShopping(); m.vehicleType(); m.bookType();
	}
}