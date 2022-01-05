public class ExceptionClass {
    public void ageValidity (int age)
	{
		if (age < 1 || age > 100) {
			throw new ArithmeticException("Access Denied - Invalid Age");
		}
	}
    public static void main(String[] args)
	{
		ExceptionClass demo = new ExceptionClass();
		try {
			demo.ageValidity(102);
		}catch(Exception error) {
			System.out.println("Exception message : " + error.getMessage());
		}
	}
}