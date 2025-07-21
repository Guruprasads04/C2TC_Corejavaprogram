package day1.basics;

public class SampleDemo {
	public static void main(String[] args){
		//Hi   guys,this string input type is changed by using wrapper class (Integer) 
		//the ParseInt, is used to convert the string input into integer type for addition operation 
		int a,b,c;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=a+b;
		System.out.println("addition of a="+a+" and b="+b+" is "+c);
			
	} 
	}


