public class FibbonacciUsingRecursion{
    public static void main(String[] args){
        // this method is recommended for only small imputs
        int ans = F(5);
        System.out.println(ans);
    }
    static int F(int n){
        if(n<=1){
            return n;
        }
        return F(n-1)+F(n-2);
    }
}