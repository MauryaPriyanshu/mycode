//break statement example with labeled for loop

public class BreakDemo1{
	public static void main(String[] args){
		
		a:
		for(int i = 0; i<=3; i++){
			
		b:
		for(int j = 0; j<=4; j++){
			
		c:
		for(int k = 0; k<=5; k++){
			
		System.out.println(k);
		if(k==3)
			
		break a;
		}
		}
		}
	}
}