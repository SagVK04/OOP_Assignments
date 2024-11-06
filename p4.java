class p4{
    public static void main(String[] args) {
        String str = "123a";
        try{
            System.out.println("Checking finally block:");
            System.out.println("Converted value is: "+Integer.parseInt(str));
        }
        catch(NullPointerException e){
            System.out.println("Exception is: "+e);
            System.out.println("String is empty!");
        }
        finally{
            System.out.println("Exception is not handled properly....");
        }
    }
}