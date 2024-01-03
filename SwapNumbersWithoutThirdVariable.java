import java.util.*;
public class SwapNumbersWithoutThirdVariable 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Numbers after swapping: ");
        System.out.println(a+ ", " + b);

    }//end main
}//end class
