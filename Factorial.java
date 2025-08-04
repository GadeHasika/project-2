class Factorial{
    public static long compute(int n){
        long res=1;
        for(int i=2;i<6;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[]args){
        int n=5;
        System.out.println("factors of "+n+" is "+compute(n));
    }
}
