//Display Fibonacci Series using for loop

import java.util.Scanner;
public class Fibonacci_1
{
    public static void main(String args[])
    {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.println("Fibonacci Series till " + n + " term :" );

        for(int i = 1; i<=10; i++)
        {
            System.out.println(n1 + " ");
            int next_term = n1 + n2;
            n1 = n2;
            n2 = next_term;

        }

    }
    
}
