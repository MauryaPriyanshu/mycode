public class Dupchar{
	public static void main(String[] args){
		
		String str = "Great responsibility";
		int count;
		
		char arr[]  = str.toCharArray();
System.out.println("Duplicate character in a given string: ");

for(int i = 0; i < arr.length; i++){
count = 1;

for(int j = i+1; j<arr.length; j++){
	
if(arr[i] == arr[j] && arr[i]!= ' '){
	count++;
	
	arr[j] = '0';
}
}
	
	if(count > 1 && arr[i] != '0')
		System.out.println(arr[i]);
}
}
}
	

	
  