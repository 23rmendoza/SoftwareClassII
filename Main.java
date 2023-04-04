import java.util.*;
class Main {
  public static String[]backpack=new String[5];
  public static Scanner input=new Scanner(System.in);
  
  public static void main(String[] args) {
    System.out.println("\033\143");
    System.out.println();
    System.out.println();
    System.out.println("Your running late to class!");
    System.out.println();
    System.out.println("You only have time to grab 2 items that you think you'll need.");
    System.out.println();
    System.out.println("Your choice of items: pencil, notebook, sketchpad, phone, pen, chromebook");
    System.out.println();
    System.out.println("Press enter to continue");
    System.out.println();
    input.nextLine();
    fillBP();
    printBP();
    searchBP();
  }
  public static void fillBP(){
    System.out.println("Your choice of items: pencil, notebook, sketchpad, phone, pen, chromebook");
    System.out.println();
    System.out.println("Let's get you packed!");
    for(int i=2; i>0; i--){
      System.out.println("You have " + i + " choice/s left.");
      System.out.println();
      System.out.println("Enter your next choice: ");
      backpack[i-1]=input.nextLine();
      System.out.println("\033\143");
    }
    System.out.print("All packed!");
    System.out.println("Press enter to continue.");
    input.nextLine();
  }
  public static void printBP(){
    System.out.print("\033\143");
    System.out.println("A band of monkeys stea; your backpack and everything falls out.");
    System.out.println();
    System.out.println("You have to pickup.");
    for(int i=0; i<5; i++){
      System.out.print("" + backpack[i]);
    }
    System.out.println(".");
    System.out.println("Press enter to continue.");
    input.nextLine();
  }
  public static void searchBP(){
    boolean found= false;
    System.out.println("\033\143");
    System.out.println("You have art clas! You'll make it through it you brought a sketchpad.");
    System.out.println();
    System.out.println("Press enter to continue.");
    input.nextLine();
    for(int i=0; i<5; i++){
      if(backpack[i].equals("sketchpad")){
        found=true;
      }
    }
    if(found){
      System.out.println("Found it! You can draw comfortable.");
      System.out.println();
      System.out.println("You make a nice sketch.");
    }else{
    System.out.println("Well...guess you have to draw on paper. Not the end of the world.");
    System.out.println();
    System.out.println("Next time let's wake up early.");
    }
  }
}