import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
            if(n==2 || n==3){
                System.out.println(n+" is a prime number");
            }
            else if(n%2==0 || n%3==0){
                System.out.println(n+ " is not a prime number");
            }
            else{
                System.out.println(n+" is a prime number");
            }

    }
}