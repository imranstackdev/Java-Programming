import java.util.Scanner;

public class primeNumber{

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number to chek prime or not : ");
    int n = sc.nextInt();
    int count = 0;

    for(int i=1; i*i<=n;i++){
        if(n%i==0){
            count = count +1;

            if(n!=i){
                count = count + 1;
            }
        }
        if(count >2 ){
            break;
        }
    }
    if(count == 2){
        System.out.println(n+" is prime.");
    }else{
        System.out.println(n + " is not prime.");
    }

    sc.close();

    }
}