class ZeroDivisionException extends Exception{
    ZeroDivisionException(String msg){
        System.out.println(msg);
    }
}
class InvalidArgumentException extends Exception{
    InvalidArgumentException(String msg){
        System.out.println(msg);
    }
}
class p7{
    public static void main(String[] args) {
        try{
            if(args.length != 2)
                throw new InvalidArgumentException("All numbers are not entered!");
            division(Float.parseFloat(args[0]), Float.parseFloat(args[1]));
        }
        catch(Exception e1){
            System.out.println("Exception is: "+e1);
        }
    }
    static void division(float val1, float val2) throws ZeroDivisionException{
        if(val2 == 0)
            throw new ZeroDivisionException("Zero division error occured!");
        else
            System.out.println(("Result is: "+(val1/val2)));
    }
}