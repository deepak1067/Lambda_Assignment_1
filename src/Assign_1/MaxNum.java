package Assign_1;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        MaxInterface result= (i, j) -> Math.max(i, j);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a= sc.nextInt();
        System.out.println("\nEnter second numbers: ");
        int b=sc.nextInt();
        System.out.println("\nMaximum from two numbers is: ");
        System.out.println(result.max(a,b));
    }
}
