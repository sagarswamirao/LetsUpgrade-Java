// Questions 3:
// Create an int array of size 5, take all the values from the user,
// add all the values and print the sum.

// ------------------------------------------------------------------------------------------------

package sum_values;

import java.util.Scanner;

public class sum_values {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values: ");
        
        int a[] = new int[5];
        int sum = 0;
        
        for(int i=0; i<5; i++){
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<5; i++){
            sum = sum + a[i];
        }
        
        System.out.println("Sum of the Entered Values are: "+sum);
        
    }
    
}
