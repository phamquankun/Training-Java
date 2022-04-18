package ExceptionJava;

class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}
public class CustomException {
	   void productCheck(int weight) throws InvalidProductException{
		    if(weight<100){
		        throw new InvalidProductException("Product Invalid");
		    }
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException obj = new CustomException();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
	}

}
