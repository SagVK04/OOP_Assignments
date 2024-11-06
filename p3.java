class p3{
    public static void main(String[] args) {
        String str = "123a";
        try{
            System.out.println("Converted value is: "+Integer.parseInt(str));
        }
        catch(NumberFormatException e){
            System.out.println("Exception is: "+e);
            System.out.println("String is not converted!");
        }
    }
}