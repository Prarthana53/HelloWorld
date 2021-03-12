package assignment;

import java.util.Scanner;

public class CheckPrime {

    public static boolean isPrime(int n){
            for (int i =2;i<=Math.sqrt(n);i++){
                if (n % i == 0){
                    return false;
                }
            }
            return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number.");
        int n = sc.nextInt();

        if(n>=2 && isPrime(n)){
            System.out.println(n + " is a Prime number.");
        } else {
            System.out.println(n + " is not a Prime number.");
        }
    }
}
