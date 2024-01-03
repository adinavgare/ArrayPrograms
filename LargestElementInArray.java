import java.util.*;
public class LargestElementInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[4];
        int LargestElement=0;

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++)
        {
            if(arr[i+1] > arr[i])
            {
                LargestElement = arr[i+1];

            }
        }

        System.out.println("Largest Element in the array is: " + LargestElement);


    }//end main
}//end class
