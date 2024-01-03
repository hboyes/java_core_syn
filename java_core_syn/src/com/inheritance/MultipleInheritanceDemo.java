package com.inheritance;
class Father
{
	public int div(int a,int b)
	   {
		   int c = a/b;
		   System.out.println(c);
		   return c;
	   }
}
interface Mother
{
	default int add(int a,int b)
	   {
		   int c = a+b;
		   System.out.println(c);
		   return c;
	   }
}
//why multiple inheritance is not possible in java
class Child11 extends Father implements Mother
{
	public int sub(int a,int b)
    {
    	int c = a-b;
    	System.out.println(c);
    	return c;
    }
}
public class MultipleInheritanceDemo {

	 public static void main(String[] args) {
	
}
}