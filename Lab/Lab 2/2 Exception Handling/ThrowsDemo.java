import java.io.IOException;

public class ThrowsDemo {
    public void getFile(String file) throws IOException
	{
		throw new IOException("File not found in your current directory");
	} 
    public static void main(String[] args) throws IOException
	{
		ThrowsDemo demo = new ThrowsDemo();
        try {
            demo.getFile("java-tutorial.pdf"); 
        } catch (Exception error) {
            System.out.println("Error message : " + error.getMessage());
        }
			
	}   
}