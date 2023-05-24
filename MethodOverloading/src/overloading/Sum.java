package overloading;
import java.util.Scanner;

public class Sum {
    
    // Method to calculate sum of two integers
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    
    // Method to calculate sum of three integers
    public static int sum(int num1, int num2) {
        return num1 + num2 ;
    }
    
    // Method to calculate average of two doubles
    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }
    
    // Method to calculate average of three doubles
    public static double average(double num1, double num2, double num3) {
        return (num1 + num2 + num3) / 3;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Ask user for input
        System.out.println("**Enter two integers to calculate their sum**:");
        int a = input.nextInt();
        int b = input.nextInt();
        
        // Call overloaded sum method for two integers
        int intSum = sum(a, b);
        System.out.println("Sum of two integer is " + intSum);
        System.out.println();
        
        // Ask user for input
        System.out.println("**Enter three integers to calculate their sum**:");
        int x = input.nextInt();
        int y = input.nextInt();
       // int z = input.nextInt();
        
        // Call overloaded sum method for three integers
        int intSum3 = sum(x, y);
        System.out.println("Sum of three integer is " + intSum3);
        System.out.println();
        
        // Ask user for input
        System.out.println("**Enter two doubles to calculate their average**:");
        double d1 = input.nextDouble();
        double d2 = input.nextDouble();
        
        // Call overloaded average method for two doubles
        double dblAvg = average(d1, d2);
        System.out.println("Average of two double is " + dblAvg);
        System.out.println();
        
        // Ask user for input
        System.out.println("**Enter three doubles to calculate their average**:");
        double d3 = input.nextDouble();
        double d4 = input.nextDouble();
        double d5 = input.nextDouble();
        
        // Call overloaded average method for three doubles
        double dblAvg3 = average(d3, d4, d5);
        System.out.println("Average of three double is " + dblAvg3);
        
        input.close();
    }
}
