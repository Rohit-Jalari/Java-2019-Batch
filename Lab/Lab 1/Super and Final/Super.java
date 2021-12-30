class Super {
    int value = 20;
   }
   
   class Example extends Super {
    int value = 10;
    void display() {
     System.out.println(super.value);// prints super value 
    }
    void display2(int value){
     this.value = value;//changes to new value 
     System.out.println(this.value);// prints new value
    }
   
    public static void main(String args[]) {
     Example e = new Example();
     e.display();//this returns value from the super class that is parent class Super.
     e.display2(45);//new value is displayed
    }
   }