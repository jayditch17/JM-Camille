import java.util.Scanner;
public class OptionMenu {
    
    public static void main(String [] args){
        
        Scanner in = new Scanner(System.in);
        // Display the menu
        System.out.println("1\t Create ");
        System.out.println("2\t Retrieve");
        System.out.println("3\t Update");
        System.out.println("4\t Delete");

        System.out.print("What do you want to do? ");
        
        //Get user's choice
        int choice=in.nextInt();
         
        //Display the title of the chosen module
        switch (choice) {
            case 1: System.exit(0); 
	   break;
            case 2: System.exit(0); 
                    break;
            case 3: System.exit(0); 
                    break;
            case 4: System.exit(0); 
                     break;
            default: System.out.println("Invalid choice");
        }//end of switch
    }//end of the main method
}//end of class