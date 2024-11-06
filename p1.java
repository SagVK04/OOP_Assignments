class p1{
    public static void main(String[] args) {
        int[] a = new int[5];
        try{
            a[5] = 65;
            System.out.println("Assigned value is: "+a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: "+e);
        }
    }
}