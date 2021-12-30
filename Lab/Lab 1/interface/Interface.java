
interface Example{

    default void display()
    {
        System.out.println("Hello from Default Method");
    }
}

 
class Interface implements Example{
 
    public static void main(String args[])
    {
        Interface i1 = new Interface();
        i1.display();
    }
}