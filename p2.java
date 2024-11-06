class p2{
    public static void main(String[] args) {
        String str = null;
        try{
            System.out.println("Assigned value is: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("Exception is: "+e);
            System.out.println("String is null");
        }
    }
}