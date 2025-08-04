class Factorial{
    public static long compute(int n){
        long res=1;
        for(int i=2;i<9;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String[]args){
        int n=8;
        System.out.println("factors of "+n+" is "+compute(n));
    }
}
