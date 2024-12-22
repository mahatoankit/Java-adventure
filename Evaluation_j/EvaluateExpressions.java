
public class EvaluateExpressions {

	public static void main(String[] args) {
	 System.out.println("arithmatic operation");
	 System.out.println(1+1);
	 System.out.println(5-2*3);
	 System.out.println((5-2));
	 System.out.println(4.5+6.7);
	 System.out.println(3-2.1);
	 System.out.println(6/2);
	 System.out.println(7.0/2.0);
	 System.out.println(8%2);
	 System.out.println(9%2);
	 
	 System.out.println("Comparison operation");
	 System.out.println(1+1 == 2);
	 System.out.println(1+1 != 3);
	 System.out.println(1<3);
	 System.out.println(1>3);
	 System.out.println(3<=3);
	 System.out.println(3>=1);
	 
	 System.out.println("Logical operations");
	 System.out.println(true && false);
	 System.out.println(true || false);
	 System.out.println(!false);
	 
	 System.out.println("String operations");
	 System.out.println("hello,"+"world");
	 System.out.println("Catch"+22);
	 System.out.println("A piece of string".length());
	 System.out.println("ABCDEFG".charAt(3));
	 System.out.println("MMXVIII".toLowerCase());
	 System.out.println("Yellow Submarine".startsWith("Yellow"));
	 
	 System.out.println("Type operations");
	   double result1 = (double) 5;
       int result2 = (int) 5.3;
       int result3 = (int) 'a';
       char result4 = (char) 120;
       String result5 = String.valueOf(1234);
       int result6 = Integer.parseInt("5678");
       double result7 = Double.parseDouble("3.14159");
       
       System.out.println("Declaring come variables with correct types");
       int age = 19;
       char grade = 'A';
       double gigaWatts = 1.21;
       boolean isBlue = true;
       String phoneNumber = "555-1234";
	}
	

}
