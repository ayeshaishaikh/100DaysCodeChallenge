import java.util.Scanner;
class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int temp =0;
        for(int i =2; i<n-1; i++)
        {
            if (n%i==0)
            {
                temp = temp +1;

            }
        }
            if(temp==0)
            {
                System.out.println(n + " Number is Prime number ");


            }
            else
            {
                System.out.println(n + " Number is not  Prime number ");
                

            }

        }

    }