import java.util.*;
public class ArrayInDescOrder
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

        //sorting of array using bubble sort technique
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.print("Descendng order of array is: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i] + ", ");
        }

    }//end class
}//end class        
