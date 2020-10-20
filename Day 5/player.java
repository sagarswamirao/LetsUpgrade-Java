// Make the complete quiz application on your own.

// ------------------------------------------------------------------------------------------------

package quiz_game;

import java.util.Scanner;

public class player {
    
    Scanner sc=new Scanner(System.in);
    String name;
    int score=0;
    
    public void getDetails() {
        
        System.out.println("Enter Player Name : ");
        name=sc.next();
    
    }
    
}