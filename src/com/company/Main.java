package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = (int)(Math.random()*100);
    System.out.println("WELCOME\nPlease guess an integer between 0 to 100\t(Enter -1 to EXIT)");
    int i = 1;
    int n;
    do{
        System.out.print("Attempt "+i+" : ");
        n = sc.nextInt();
        if(n==0)
            System.out.println("Invalid input. Please enter an integer greater than 0.");
        else if(n>=100)
            System.out.println("Invalid input. Please enter an integer less than 100.");
        else if (n == r) {
            System.out.println("You won! Number of attempt(s) " + i + ".");
            break;
        }
        else if(n<0)
            System.out.println("You choose to Exit. EXITING.........");
        else if(n>r)
            System.out.println("[HINT: The integer is smaller than "+n+"]");
        else
            System.out.println("[HINT: The integer is larger than "+n+"]");
        i++;
    }while(n>=0);
    System.out.println("The integer was "+r+" .\nTHANKS FOR PLAYING");
    System.out.println("EXITED");
    }
}
