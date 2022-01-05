import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\Rohit\\Desktop");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}