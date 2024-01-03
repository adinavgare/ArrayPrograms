import java.util.*;
public class ReverseArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        

        System.out.print("Enter array elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        //Reverse of an array is: 
        System.out.println("Reverse of given array is: ");
        for(int i=n-1; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }

    }//end main
    
}//end class    