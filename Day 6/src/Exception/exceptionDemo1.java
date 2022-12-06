package Exception;

public class exceptionDemo1 {
	
	public static void Drive(int space) {
		if(space>15)
		{
			throw new ArithmeticException("Maximum size exceeded");
		}
		else
		{
			System.out.println("File uploaded");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a[]= {10,20,30,40,50};
		Drive(14);
		{
			System.out.println("program runs normally");
		}
		
		//try
		//{
		//System.out.println(a[5]);
		//}
		//catch(ArrayIndexOutOfBoundsException e)
		//{
		//System.out.println(e);
		//}
		//System.out.println("program runs normally");//

	}

}

