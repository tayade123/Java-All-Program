class MyClass{
   
   int a;
   int b;

   MyClass(){

   a=0;
   b=0;
}
  
   MyClass(int a, int b) {

   this.a=a;
   this.b=b;

}
}
class Practical20{
   public static void main(String args[]){
  
  MyClass object1 =new MyClass();
  System.out.println("value of A in Object 1 : " + object1.a);
  System.out.println("value of B in Object 1 : " + object1.b);

  MyClass object2 =new MyClass(10,20);
 
  System.out.println("value of A in Object 2 : " + object2.a);
  System.out.println("value of B in Object 2 : " + object2.b);
}
}
