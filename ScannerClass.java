import java.util.Scanner;

public class ScannerClass {
   public static void main(String[] args){
     Scanner myObj = new Scanner(System.in); //Create Scanner object
    System.out.println("Java Programming.");
    String name = myObj.nextLine();
    String name1 = myObj.nextLine();
    String name2 = myObj.nextLine();
    String name3 = myObj.nextLine();

    System.out.println("The Language Innovation From Java Island" + name);
    System.out.println("The Language Innovation From Java Island" + name1);
    System.out.println("The Language Innovation From Java Island" + name2);
    System.out.println("The Language Innovation From Java Island" + name3);
   
   }

}
