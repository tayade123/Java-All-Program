import java.util.*;

class jagdish{
   public static void main(String args[]){

     int a = 0;
     int number=0;
     String tay = "";
     Scanner input = new Scanner(System.in);
      
     System.out.println(">>> 1. Sum Of Digit : <<<");

     System.out.println(">>> 2.  Reverse The String : <<<");

     System.out.println(">>> 3. Check Palidrom no. : <<<");

     System.out.println(">>> 0. Exit  : <<<");

   do{
     
        System.out.print("Enter Your Choice : ");
        int ch = Integer.parseInt(input.nextLine());

     switch(ch){

       case 1:

       System.out.print("  Enter The User Number : ");
       int digit=0,sum=0;
       number = Integer.parseInt(input.nextLine());
       while(number > 0){
                  digit =number % 10;
                  sum =sum+digit;
                  number = number/10;

               }
              
       
       break;

       case 2:
             int rev=0,rem=0;
       System.out.print("  Reverse no : ");

        number = Integer.parseInt(input.nextLine());
         while(number>0){
                    rem=number%10;
                    rev=(rev*10) +rem;
                    number=number/10;
                    }
             System.out.println("Reverse : " +rev);
       break;
 
       case 3:

       System.out.println("  Palidrom No : ");
    
        
       break;

       case 0:

       System.out.println(" 0. Exit  : ");
       break;

       default:
       System.out.println("Invalid Choise");
   }

       System.out.println("Do Want to Continue... (y/n) : ");

       tay = input.nextLine();
    
}while(tay.equals("y"));
  }
}
