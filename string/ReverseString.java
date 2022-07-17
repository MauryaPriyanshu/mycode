public class ReverseString{
public static void main(String[] args){
	
String str = "Priyanshu";
char arr[] = str.toCharArray();
int length = arr.length;

System.out.println("Enter the string:--");
for(int i = 0; i< length ; i++){
System.out.print(arr[i] + ", " );
System.out.print(" ");
}
for(int i = 0; i< length/2 ; i++){
	

char temp = arr[i];
arr[i] = arr[length-i-1];
arr[length-i-1] = temp;

}

System.out.println("String after the reverse:--");
for(int i = 0; i< length ; i++){
System.out.print(arr[i] + ", ");
}
}
}