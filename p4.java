class p4{
    public static void main(String[] args) {
        String str = "123a";
        try{
            System.out.println("Checking try block:");
            System.out.println("Converted value is: "+Integer.parseInt(str));
        }
        catch(NumberFormatException e){
            System.out.println("Exception is: "+e);
        }
        finally{
            System.out.println("Program executed....");
        }
    }
}