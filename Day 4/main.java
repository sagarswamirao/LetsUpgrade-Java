// Questions 1:
// create a class avenger with
// properties (name,age,power,weapon,planet) and with
// functions-getDetails() and displayDetails().
// create 5 objects as an array in the main method and call.

// ------------------------------------------------------------------------------------------------

package avenger;

public class main {
    
    public static void main(String args[]){
        
        avenger[] a = new avenger[5];
        
        for(int i=0; i<5; i++){
            
            a[i]=new avenger();
            a[i].getDetails();
            
        }
        
        for(int i=0;i<5;i++){
            
            a[i].displayDetails();
            
        }
        
    }
    
}
