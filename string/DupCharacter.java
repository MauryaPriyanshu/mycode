/*find the matching character in the string*/

public class DupCharacter{
	public static void main(String[] args){
		
		String s = "abcebee";
		char arr[] = s.toCharArray();
		boolean duplicate = false;
		
		for(int i  = 0 ; i < arr.length; i++){
			
	    for(int j = i+1; j < arr.length; j++){
			
			if(arr[i] == arr[j]){
				
			duplicate = true;
			System.out.println("Duplicate found in the string!");
			break;
			}
			}
			if(duplicate)
		 
		break;
		System.out.println(arr[i]);
		}
		if(!duplicate)
		System.out.println("Duplicate not found in the String!");
	}
}