class Constructors{
	String msg;
	public Constructors(){
		System.out.println("Default Constructor");
	}
	public Constructors(String msg){
		this.msg = msg;
		System.out.println("Parameterized Constructor by:"+msg);
	}
	public Constructors(Constructors c){
		System.out.println("This is Copy Constructor by: "+c.msg);
	}
	public static void main(String[] args){
		Constructors defaultConstructor = new Constructors();
		Constructors parameterizedConstructor = new Constructors("Prajwal");
		Constructors copyConstructor = new Constructors(parameterizedConstructor);
	}	
}
