final class Final{  //thid ensures that it cannot be extended to other class.
    public static void main(String[] args) {
        final double PI = 3.1415;//this value cannot be changed to another because this must be constant throughout the program.
        int radius = 7;
        double area = PI*radius*radius;
        System.out.println("The area of circle is:"+area);
    }
   }