import java.util.*;
class Main {
  public void display_menu() {
    System.out.println ( "1) Create \n2) Retrieve \n3) Update \n4) Delete" );
    System.out.print ( "What do you want to do?  " );
  }
  
  public Main() {
    Scanner in = new Scanner ( System.in );
    
    display_menu();
    switch ( in.nextInt() ) {
      case 1:
        System.out.println ( "Dito yung code ng create" );
        break;
      case 2:
        System.out.println ( "dito yung code ng Retrieve" );
        break;
      case 3:
        System.out.println ( "dito yung code ng update" );
        break;
        case 4:
        System.out.println ( "dito yung code ng delete" );
      default:
        System.err.println ( "Invalid Option!" );
        break;
    }
  }
  
  public static void main ( String[] args ) {
    new Main();
  }
}