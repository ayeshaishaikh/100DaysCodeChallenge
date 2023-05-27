//Display Fibonacci Series using while loop
import java.util.Scanner;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while ( count <=n)
        {
            int temp = b;//1
            b = b+ a;// 0 + 1= 1 
            a = temp; // 1

            count ++;
        }
        System.out.println(b);
    }
}

//dry run 
//b = 1
//temp = 1
// b = 1
// a = 1

// b = 1
//temp = 1
//b = 2
//a=1

//temp = 2
//b = 2 + 1=3
//a=2