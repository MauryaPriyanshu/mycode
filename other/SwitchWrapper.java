//Java Program to demonstrate the use of Wrapper class  
public class SwitchWrapper{
	public static void main(String[] args){
		Integer age = 18;
		switch(age){
			case 17:
			System.out.println("You are under 18!");
			break;
			case 18:
			System.out.println("You are eligible for vote!");
			break;
			case 40:
			System.out.println("You are senior citizen!!");
			break;
			default:
			System.out.println("please give valid age!!");
		break;}
	}
}
			