import java.util.*;
class Stacks{
public static void main(String[] args){
	int stack[] = new int[10];
	int data, choice;
	Scanner scan = new Scanner(System.in);
	choice = scan.nextInt();
	int top = 0;
	try {
		do{
			System.out.println("\n 1.Push");
			System.out.println("\n 2.Pop");
			System.out.println("\n 3.View / Display");
			System.out.println("\n 4.Exit");
			System.out.println("\n Enter your choice:\t");
			choice=scan.nextInt();
			switch(choice){
				case 1:
					if (top<10){
						System.out.println("\nEnter any element:\t");
						data=scan.nextInt();
						stack[top] = data;
						top++;
					}
					else{
						System.out.println(" Stack is full.");
					}
					break;
					
				case 2:
					if (top>0){
						top--;
						System.out.println("\nElement poped is:\n"+stack[top]);
					}
					else{
						System.out.println("\n Stack is Empty.");
					}
					break;
				case 3:
					if (top == 0){
						System.out.println("\n Stack empty.");
					}
					else{
						int i ;
						for(i=top-1;i>=0;i--){
							System.out.println(stack[i]+"\n");
						}
					}
					break;
				case 4:
					System.exit(1);
				default:
					System.out.println("\n Select option from 1 to 4 only not others!!");			
					
			}
		}while(choice != 4);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
}
}