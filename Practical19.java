class MyClass{
             private int a;
              int b;
             private float c;
              boolean d;
              char ch;

} 
class Practical19{
  
    public static void main(String args[]){

  // Memory Allocation ( with new )
      MyClass object =new MyClass();
   System.out.println("Value of A : " + object.a);
   System.out.println("Value of B : " + object.b);
   System.out.println("Value of C : " + object.c);
//  Accessible
   System.out.println("Value of D : " + object.d);
    System.out.println("value of ch : " + object.ch);

}
  
}
