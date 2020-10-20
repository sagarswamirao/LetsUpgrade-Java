// Questions 1:
// create a class avenger with
// properties (name,age,power,weapon,planet) and with
// functions-getDetails() and displayDetails().
// create 5 objects as an array in the main method and call.

// ------------------------------------------------------------------------------------------------

package avenger;

import java.util.Scanner;

public class avenger {
    
    String name;
    int age;
    String power;
    String weapon;
    String planet;
    
    Scanner sc = new Scanner(System.in);
    
    void getDetails(){
        
        System.out.print("Enter your Name : ");
        name = sc.nextLine();
        System.out.print("Enter your Age : ");
        age = sc.nextInt();
        System.out.print("Enter Your Power : ");
        power = sc.next();
        System.out.print("Enter your Weapon : ");
        weapon = sc.next();
        System.out.print("Enter which You came from : ");
        planet =sc.next();
        displayDetails();
        
    }
    
    void displayDetails(){
        
        System.out.println("Your Entered Name is : " + name);
        System.out.println("Your Entered Age is : " + age);
        System.out.println("Your Entered Power is : " + power);
        System.out.println("Your Entered Weapon is : " + weapon);
        System.out.println("Your Entered Planet is : " + planet);

    }

}
