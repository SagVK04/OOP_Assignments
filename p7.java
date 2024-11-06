class ZeroDivisionException extends Exception{
    ZeroDivisionException(String msg){
        System.out.println(msg);
    }
}
class p7{
    public static void main(String[] args) {
        float a,b;
        try{
            a = Float.parseFloat(args[0]); b = Float.parseFloat(args[1]);
        }
        catch(Exception e1){
            System.out.println("All numbers not entered!");
        }
        try{
            division(Float.parseFloat(args[0]),Float.parseFloat(args[1]));
        }
        catch(Exception e2){
        }
    }
    static void division(float val1, float val2) throws ZeroDivisionException{
        if(val2 == 0)
            throw new ZeroDivisionException("Zero division error occured!");
        else
            System.out.println(("Result is: "+(val1/val2)));
    }
}