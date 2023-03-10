class TestString{
  public static void main(String args[]){

  String str1 = "Jagdish";
  System.out.println("Character At 3rd Pos : " + str1.charAt(2) );
  System.out.println("Index Of 'y' : " + str1.indexOf('y'));
  System.out.println("Last Index Of 'y' : " + str1.lastIndexOf('y') );

   
   String str2 = "jagdish";
   System.out.println("String Concat using Concat() : " + 
      str1.concat(str2) );
     
   System.out.println("String Concat using '+' : " + str1+str2);

    if( str1.equalsIgnorCase("Jagdish") )

             System.out.println("Both are Equal");
   else

        System.out.println("Both are Not Equal");

 
  
  if(str1.equals(str2))
      System.out.println("Both are Equal using  equal()");
  else
      System.out.println("Both are Not Equal using equal()");


   if(str1 == str2 )
      System.out.println("Both arwe Equal using '==' ");

   else
      System.out.println("Both are Not Equal using '==' ");

   String str3 = "Jagdihs";
  System.out.println("Check for Empty String : " + str3.isEmpty());
  System.out.println("Length of String : " + str3.length() );

  String str4 = "Hello Jagdish  ! How are you ? ";
  String[] strArr = str4.split("");

   for(String word : strArr){
      System.out.println(word);
}
  System.out.println("Subtirng :" + str4.substring(14,18) );
  System.out.println("Upper case : " + str4.toUpperCase() );
  System.out.println("Lower case : " + str4.toLowerCase() );
  System.out.println("Replace : " + str4.replace("How are you ", "whatsup"));
  System.out.println("Regex : " + "2234".matches("^1[0-9]*"));
}
}
