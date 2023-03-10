import java.util.*;

class IncomeTax{
   public static void main(String args[]){

    System.out.println("<------------------------------------------------->" );
      
    Scanner input=new Scanner(System.in);
    
    System.out.print("Enter Emplyee Code : " );

    String str = input.nextLine();

    System.out.print("Enter Emplyee Name : " );

    String str1 = input.nextLine();

    System.out.print("Enter Annual Salery : " );

    double income = input.nextDouble();

    System.out.print("Enter Your Kharcha : " );

    double kharch = input.nextDouble();

    double mudi=income-kharch;

    double rate = 0;
    
    if(mudi<=100000)
		rate=3;
    else if(mudi<=300000)
         rate=5;
    else if(mudi<=500000)
         rate=7;
    else if(mudi<=1000000)
         rate=10;
	else
        rate=20;

		double tax=mudi*rate/100;

   System.out.println("<------------------------------------------------->" );

   System.out.println("Enter Emplyee Code : " + str);

   System.out.println("Enter Emplyee Code : " +str1);

   System.out.println("Income : " + income );

   System.out.println("Cost : " + kharch );

   System.out.println("Capital : " + mudi );

   System.out.println("Tax : " + tax );

   System.out.println("<------------------------------------------------->" );
 }

}
