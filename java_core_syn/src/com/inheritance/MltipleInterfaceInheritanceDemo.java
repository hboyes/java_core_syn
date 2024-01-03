package com.inheritance;

interface Fathers
{
	default int div(int a,int b)
	   {
		   int c = a/b;
		   System.out.println(c);
		   return c;
	   }
}
interface Mothers
{
	default int add(int a,int b)
	   {
		   int c = a+b;
		   System.out.println(c);
		   return c;
	   }
}
//why multiple inheritance is not possible in java
class Childs  implements Mothers,Fathers
{
	public int sub(int a,int b)
    {
    	int c = a-b;
    	System.out.println(c);
    	return c;
    }
}

public class MltipleInterfaceInheritanceDemo {
  public static void main(String[] args) {
	Childs child = new Childs();
	child.add(10, 20);
	child.div(20, 10);
}
}