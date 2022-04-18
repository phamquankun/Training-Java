package ExceptionJava;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
	      try {
	         num1 = 0;
	         num2 = 62 / num1;
	         System.out.println(num2);
	      }
	      catch (ArithmeticException e) { 
	         System.out.println("cannot divide a number by 0");
	      }
	      catch (Exception e) {
	         System.out.println("Error: Have a exception here!!!");
	      }
	}

}
