//This program is about Static variables, methods and blocks.

package day1Problems;

public class StaticVariablesMethodsBlocks {
	
	static int x = 10; //Static Variables
	   static int y;
	   static void func(int z) //Static method
	   {
	      System.out.println("x = " + x);
	      System.out.println("y = " + y);
	      System.out.println("z = " + z);
	   }
	   
	   /*Static block -- It is initialized first before main method because 
	     it is Instance Initializer Block where the compiler stores them in memory 
	     at the time of class loading and before the object creation.*/
	   
	   static 
	   {
	      System.out.println("Running static initialization block.");
	      y = x + 5;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func(8);

	}

}
