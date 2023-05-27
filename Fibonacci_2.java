//Display Fibonacci Series up to a given number
public class Fibonacci_2 
{
     public static void main(String args[])
     {
        int n = 100;
        int n1 = 0;
        int n2=1;
        System.out.println("Fibonacci Series upto " + n + " : ");

        while(n1<=100)
        {
            System.out.print(n1 + " " );
             int next_term = n1 + n2;
            n1 = n2;
            n2 = next_term;

        }
     }
    
}
