import com.clarkware.Profiler;
import java.io.*;

public class UseFibonacci
{

    public static void main(String[] args)
    {

	System.out.println("Begin experiment with different Fibonacci " +
			   "implementations ...");
	System.out.println();

	// extract the value that was passed on the command
	// line; this is the nth fibonacci number that 
	// we must calculate in the three different fashions
	Integer Num = new Integer(args[0]);
	int num = Num.intValue();
	
	// determine which algorithm we are supposed to benchmark
	String chosen = args[1];
	String type = args[2];

	if( chosen.equals("recursive") || 
	    chosen.equals("all") )
	    {

		// 1. RECURSIVE fibonacci (int)
		if(type.equals("int") || type.equals("all")){
		    
		    Profiler.begin("RecursiveFibonacciInt");
		    int recursiveFib = RecursiveFibonacci.fib(num);
		    Profiler.end("RecursiveFibonacciInt");
	
		    System.out.println("(Recursive/int) The " + num + 
				       "th Fibonacci " +
				       "number = " + recursiveFib + ".");
		}
		// 1. RECURSIVE fibonacci (long)
		if(type.equals("long") || type.equals("all")){

		    Profiler.begin("RecursiveFibonacciLong");
		    long recursiveFibLong = RecursiveFibonacci.fibLong(num);
		    Profiler.end("RecursiveFibonacciLong");
	
		    System.out.println("(Recursive/long) The " + num + 
				       "th Fibonacci " +
				       "number = " + recursiveFibLong + ".");
	
			}				
	    }
	if( chosen.equals("iterative") || 
	    chosen.equals("all") )
	    {
		

		// 2. ITERATIVE fibonacci (int)
		if(type.equals("int") || type.equals("all")){
		    
		    Profiler.begin("IterativeFibonacciInt");
		    int iterativeFib = IterativeFibonacci.fib(num);
		    Profiler.end("IterativeFibonacciInt");
		
		    System.out.println("(Iterative/int) The " + num + 
				       "th Fibonacci " +
				       "number = " + iterativeFib + ".");
		}
		// 2. ITERATIVE fibonacci (long)
		if(type.equals("long") || type.equals("all")){
		    
		    Profiler.begin("IterativeFibonacciLong");
		    long iterativeFibLong = IterativeFibonacci.fibLong(num);
		    Profiler.end("IterativeFibonacciLong");
		
		    System.out.println("(Iterative/long) The " + num + 
				       "th Fibonacci " +
				       "number = " + iterativeFibLong + ".");
		}Recursion
	    }Recursion

	System.out.println();
	Profiler.print(new PrintWriter(System.out));

	System.out.println("... End experiment with different Fibonacci " +
			   "implementations");

    }

}
