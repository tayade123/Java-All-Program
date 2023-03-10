class MyClass {

   int a=10;
   float f;
   char ch;
   boolean b;
   Object obj;
}
class Practical21{

   public static  void main(String args[]){

   MyClass object = new MyClass();
  System.out.println("DEfault Value of Integer : " + object.a);
  System.out.println("DEfault Value of Float : " +  object.f);
  System.out.println("DEfault Value of Bollean : " + object.b);
  System.out.println("DEfault Value of charater: " + object.ch);
  System.out.println("DEfault Value of object  : " + object.obj);
}
}
