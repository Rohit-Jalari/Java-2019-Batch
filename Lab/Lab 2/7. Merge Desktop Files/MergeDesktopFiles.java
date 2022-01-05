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