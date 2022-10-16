import java.util.Scanner;

class ReversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String n = sc.nextLine();
        char ch;
        for(int i=n.length()-1;i>=0;i--){
            ch = n.charAt(i);
            System.out.print(ch);
        }
    }
}