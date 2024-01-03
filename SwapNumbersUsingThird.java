import java.util.*;
public class SwapNumbersUsingThird 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("Numbers after swapping: ");
        System.out.println(a + ", " + b);

    }//end main
    
}//end class
