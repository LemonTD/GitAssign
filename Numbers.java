// to detect prime number
// author: Lemon Oluwatobi 

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        int temp;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int num = input.nextInt(); //Capture the input in an integer
        input.close();

            for (int x=2; x<=num/2; x++) {
                 temp = num%x;
            
                if (temp==0){ 
                isPrime=false;
                 break;
            }
        }
        if (isPrime && num != 0 && num != 1)
            System.out.print(num + " is a Prime Number");
          else
            System.out.print(num + " is not a Prime Number");

    }
}    