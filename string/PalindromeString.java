public class PalindromeString
{
	public static void main(String [] args){
		String str = "madam";
		
		char arr[] = str.toCharArray();
		int length = arr.length;
		
		for(int i = 0; i <= length/2; i++){
			char temp = arr[i];
			arr[i] = arr[length - i -1];
			arr[length - i - 1] = temp;
		}
		
		String rev = new String(arr);
		if(str.equals(rev)){
			System.out.println("Enter string is Palindrome!");
		}
			else
			{
				System.out.println("enteer string isn't Palindrom!");
			}
	}
}
				
