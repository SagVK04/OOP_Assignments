class AgeOutOfRangeException extends Exception{
    AgeOutOfRangeException(String msg){
        System.out.println(msg);
    }
}
class p6{
    public static void main(String[] args) {
        try{
            System.out.println("Student's age is: "+Integer.parseInt(args[0]));
            System.out.println("Checking exception....");
            checkAge(Integer.parseInt(args[0]));
        }
        catch(Exception e){
            System.out.println("Exception is: "+e);
        }
    }
    static void checkAge(int val) throws AgeOutOfRangeException{
        if(val>18)
            System.out.println("Eligible for voting!");
        else
            throw new AgeOutOfRangeException("Student's age is less than 18, not cast his/her vote");
    }
}