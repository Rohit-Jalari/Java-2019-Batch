***
DEADLINE   : 5 JAN <br>
SUBMITTED  : 5 JAN 
***
# Lab 2: Packages, Exception handling and file handling
### 1. WAP to demonstrate the use of user defined package in java.
- A java package is a group of similar types of classes, interfaces and sub-packages.
- Package in java can be categorized in two form, built-in package and user-defined package.
- In Given Program,we have created User-defined Package.
```java
  package myPack;  

  public class MyPack{  
	  public void getMessage()
	  {  
    	System.out.println(" Package Accessed");  
    }  
} 
```
- The __package keyword__ is used to create a package in java
- It is complied using following syntax : 
> javac myPack.java -d .
- Then the package is imported in `PackageRunner.java` file
```java
import myPack.MyPack;

class PackageRunner
{
	public static void main(String args[])
	{
		MyPack pack = new MyPack();
		pack.getMessage();
	}
}
```
### 2. WAP to demonstrate Exception handling with all 5 keywords: try, catch, finally, throw and throws.
- The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
- It is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.
### Java Exception Keywords
| ___Keyword___ | ___Description___ |
|---- | ---- | 
|try| The "try" keyword is used to specify a block where we should place an exception code. |
| catch | The "catch" block is used to handle the exception. |
| finally | The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not. |
| throw | The "throw" keyword is used to throw an exception. |
| throws | The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature. |
```java
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 0;
        int result = 0;
        try{
            result = num1 / num2;
            System.out.println("The output is :" + result);
        }catch(Exception error){
            System.out.println("Error message : "+ error.getMessage());
        }finally{
            System.out.println("Try...Catch Block is finished");
        }
    }
}
```
```java
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
```
```java
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
```
### 3.  Create your own exception class called InvalidAgeException which is thrown if the given age is less than 1 and greater than 100.
```java
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
```
### 4.  WAP to demonstrate the use of chained Exception.
- Chained Exception is the feature that allows us to relate one exception with another exception, i.e. one exception describes cause of another exception. 
- `getCause()` and `initCause()` are the two available methods that support chained exception.
```java
import java.io.IOException;

public class ChainedException
{
    public static void divide(int a, int b)
    {
      if(b == 0)
      {
        ArithmeticException ae = new ArithmeticException("top layer");
        ae.initCause(new IOException("cause"));
        throw ae;
      }
      else
      {
        System.out.println(a/b);
      }
    }

    public static void main(String[] args)
    {
      try 
      {
        divide(5, 0);
      }
      catch(ArithmeticException ae) {
        System.out.println( "caught : " + ae);
        System.out.println("actual cause: "+ae.getCause());
      }
    }
}
```
### 5.  WAP to merge data from two files into third file.
- The `File` class from the `java.io` package, allows us to work with files.
- The contents of `file1.txt` is first merged into `file3.txt` and then contents of `file2.txt` is merged into `file3.txt`.
```java 
import java.io.*;
  
public class FileMerge 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        String line = br.readLine();
        while (line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        br = new BufferedReader(new FileReader("file2.txt"));
        line = br.readLine();
        while(line != null)
        {
            pw.println(line);
            line = br.readLine();
        }
        pw.flush();
        br.close();
        pw.close();
        System.out.println("Merged file1.txt and file2.txt into file3.txt");
    }
}
```
### 6.  WAP to merge data from two files into third file where merging should be done line by line alternatively.
- In this program, first line of `file1.txt` is merged into `file3.txt`, then first line of `file2.txt` is merged into `file3.txt`,similarly alternate lines are merged into `file3.txt`.
```java
import java.io.*;
  
public class MergingFilesByAlternateLine 
{
    public static void main(String[] args) throws IOException 
    {
        PrintWriter pw = new PrintWriter("file3.txt");
        BufferedReader bwriter1 = new BufferedReader(new FileReader("file1.txt"));
        BufferedReader bwriter2 = new BufferedReader(new FileReader("file2.txt")); 
        String line1 = bwriter1.readLine();
        String line2 = bwriter2.readLine();
        while (line1 != null || line2 !=null)
        {
            if(line1 != null)
            {
                pw.println(line1);
                line1 = bwriter1.readLine();
            }
              
            if(line2 != null)
            {
                pw.println(line2);
                line2 = bwriter2.readLine();
            }
        }
        pw.flush();
        bwriter1.close();
        bwriter2.close();
        pw.close();  
        System.out.println("Merged into file3.txt");
    }
}
```
### 7.  WAP to merge data from all files present in Desktop into output.txt
- `list()` method of `File` class `Returns an array of the files in the directory`
- Files present in the Desktop are used.
- Then the list is megerd into `output.txt` file.
```java
import java.io.*;

class MergeDesktopFiles {
 
    public static void main(String[] args) throws IOException
    {
        File dir = new File("C:\\Users\\Rohit\\Desktop");
        PrintWriter pw = new PrintWriter("output.txt");
        String[] fileNames = dir.list();
        for (String fileName : fileNames) {
            pw.println(fileName);
            pw.flush();
        }
        System.out.println("Succesfully Merged Desktop File lists into 'output.txt' ");
    }
}
```
