import java.util.*;
public class SecondLargestElement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int LargestElement = Integer.MIN_VALUE;
        int SecondLargestElement = Integer.MIN_VALUE;

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(arr[i] > LargestElement)
            {
                SecondLargestElement = LargestElement;
                LargestElement = arr[i];

            }
            else if (arr[i] > SecondLargestElement  &&  arr[i] < LargestElement) 
            {
                SecondLargestElement  = arr[i];
            }
        }

        System.out.println("SecondLargest Element in the array is: " + SecondLargestElement);


    }//end main
}//end class
