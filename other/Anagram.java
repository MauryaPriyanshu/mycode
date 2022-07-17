import java.util.*;
public class Anagram{
public static void main(String[] args){

String s1 = "Grab";
String s2 = "Brag";

s1 = s1.toLowerCase();
s2 = s2.toLowerCase();

if(s1.length() != s2.length()){
	System.out.println("Both String are not Anagram!!");
}
else{
	char arr1 [] = s1.toCharArray();
	char arr2 [] = s2.toCharArray();
	
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	if(Arrays.equals(arr1,arr2)== true){
	System.out.println("Both the strings are anagram!!");}
		else{
			System.out.println("Both the strings are not anagram!!");
		}
}
}
}
