import java.util.*;
public class PrintElementsUserIP 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sizeof array: ");
        int n = sc.nextInt();

        //as array is of fixed size so assign a fixed size to array
        int arr[] = new int[5];

        //storing element dynamically
        System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //displaying array elements
        System.out.println("The Array Elements are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + ",");
        }

    }//end main
    
}//end class
