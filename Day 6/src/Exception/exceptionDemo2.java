package Exception;

class UserDefinedException extends Exception
{
	public UserDefinedException(String str)
	
	{
		//calling constructor of parent Exception
		super(str);
	}
}

public class exceptionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			throw new UserDefinedException("This is user-defined exception");
		}
		catch (UserDefinedException ude)
		{
			System.out.println("caught the exception");
			System.out.println(ude.getMessage());
		}

	}

}

