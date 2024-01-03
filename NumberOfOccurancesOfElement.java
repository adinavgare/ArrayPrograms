import java.util.*;
public class NumberOfOccurancesOfElement 
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

        System.out.println("Enter the number of which occurances have to find: ");
        int number = sc.nextInt();

        int count=0;
        for(int i=0; i<n; i++)
        {

            if(arr[i]==number)
            {
                count++;
            }
            
        }

        System.out.println("Number of occurances of " + number + " is: " + count) ;

    }//end main
}//end main        