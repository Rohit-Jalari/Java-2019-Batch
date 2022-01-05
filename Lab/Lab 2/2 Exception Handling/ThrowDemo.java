public class ThrowDemo {
    public void eligibility (int age)
	{
		if (age < 18) {
			throw new ArithmeticException("Access Denied - Not eligible to Vote");
		}
        else{
            System.out.println("Access Granted - Eligible to Vote");
        }
	}
    public static void main(String[] args)
	{
		ThrowDemo demo = new ThrowDemo();
		try {
			demo.eligibility(17);
		}catch(Exception error) {
			System.out.println("Exception message : " + error.getMessage());
		}
	}
}