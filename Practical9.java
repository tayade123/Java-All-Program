import java.util.Scanner;
class Practical9{
   
   public static void main(String args[]){

   Scanner input = new  Scanner (System.in); 
   System.out.print("Enter no : ");
   int no = Integer.parseInt(input.nextLine());
    System.out.print("Enter Price : ");
   float price = Float.parseFloat(input.nextLine());
    System.out.print("Enter The Name : ");
  String name = input.nextLine();
   System.out.print("Enter The any Character : ");
  char ch = input.nextLine().charAt(0);

   System.out.println("No .  : " +no );
   System.out.println(" Price  : " +price);
   System.out.println(" Name  :"  +name);
   System.out.println("Character : +ch");

}

}
