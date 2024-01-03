import java.util.*;
public class SmallestElementInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        System.out.println("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }


        //Assign SmallestElement as First Element of an array
        int SmallestElement = arr[0];

        for(int i=1; i<n; i++)
        {
            if(arr[i] < SmallestElement)
            {
                SmallestElement = arr[i];

            }
        }

        System.out.println("Smallest Element in the array is: " + SmallestElement);


    }//end main
}//end class