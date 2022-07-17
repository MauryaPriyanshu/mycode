import java.util.*;
public class PalinStDemo{
	public static void main (String[] args){
		String str = "level";
		String rev = "";
		 
		
		for(int i = str.length()-1; i >= 0; i--){
		rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev)){
		System.out.print("String is Palindrome!!");}
		else{
		System.out.print("String isn't Palindrome!!");}
	}
}
		
