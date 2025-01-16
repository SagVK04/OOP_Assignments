class NumberOutOfRangeException extends Exception{
    NumberOutOfRangeException(String msg){
        System.out.println(msg);
    }
}
class p5{
    public static void main(String[] args) {
        try{
            System.out.println("Checking exception....");
            checkValue(Integer.parseInt(args[0]));
        }
        catch(Exception e){
            System.out.println("Exception is: "+e);
        }
    }
    static void checkValue(int val) throws NumberOutOfRangeException{
        if(val<10 || val>50)
            throw new NumberOutOfRangeException(val+" is out of range!");
        else
            System.out.println("Square of "+val+" is: "+(val*val));
    }
}