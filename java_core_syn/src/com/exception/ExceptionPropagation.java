package com.exception;
 
class ExceptionPropagation

{

    public void method4 ()

    {

        int a = 10, b = 0;

        int c = a / b;

    }

    public void method3 ()

    {

        this.method4 ();

        System.out.println ("after method 4 compltion");

    }

    public void method2 ()

    {

    	try {

        this.method3 ();

        System.out.println ("after method 3 compltion");

    	}

    	catch(Exception ex)

    	{

    		System.out.println(ex);

    	}

    }

    public void method1 ()

    {

        this.method2 ();

        System.out.println ("after method 2 compltion");

    }

    public static void main (String args[])

    {

        ExceptionPropagation ep = new ExceptionPropagation ();

        ep.method1 ();

        System.out.println ("after method 1 completion");

    }

}