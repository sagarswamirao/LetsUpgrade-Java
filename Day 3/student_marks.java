// Questions 1:
// Take 5 subjects marks each subject 100 marks;
// calculate the percentage;
// based on the percentage print the grade and the percentage;

// ------------------------------------------------------------------------------------------------

package student_marks;

import java.util.Scanner;

public class student_marks {

    public static void main(String[] args) {
        
        int sum = 0, marks;
        float p;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 5 Subject Marks (Each of 100 Marks) : ");
        
        for(int i=0; i<5; i++){
            marks = sc.nextInt();
            sum = sum + marks;
        }
        
        p = sum / 5;
        System.out.println("Persentage:"+p);
        
        if(p >= 75){
            System.out.println("A Grade");
        }
        else if(p >= 50){
            System.out.println("B Grade");
        }
        else if(p >= 35){
            System.out.println("C Grade");
        }
        else{
            System.out.println("Failed");
        }
    }
    
}
