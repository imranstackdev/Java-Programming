import java.util.Scanner;

public class digitsOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to print in verticle : ");
        int n = sc.nextInt();

        int rev = 0;

        while(n!=0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n/10;
        }

        while(rev > 0){
            int digit = rev % 10;
            System.out.println(digit);
            rev = rev/10;
        }
    }
}