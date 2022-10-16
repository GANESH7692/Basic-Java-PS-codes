public class FactorialUsingRecursion{
    public static void main(String[] args) {
        int ans = F(5);
        System.out.println(ans);
    }
    static int F(int n){
        if(n==0){
            return 1;
        }
        return n*F(n-1);
    }
}