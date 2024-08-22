class p11{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Taking input for matrix...");
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}