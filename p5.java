class Fuel {
    static float ratePetrol=20f;
    static float rateDiesel=10f;
    Fuel(){
        ratePetrol += (ratePetrol*0.1);
        rateDiesel += (rateDiesel*0.1);
        System.out.println("After hike Petrol rate: "+ratePetrol);
        System.out.println("After hike Diesel rate: "+rateDiesel);
    }
}
public class p5 {
    public static void main(String[] args) {
        System.out.println("Initial Petrol rate: "+Fuel.ratePetrol);
        System.out.println("Initial Diesel rate: "+Fuel.rateDiesel);
        for(int i=0;i<5;i++){
            Fuel f = new Fuel();
        }
    }
}