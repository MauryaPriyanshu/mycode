public class DuplicateChar{
	public static void main(String[] args){
		String str = "main Program";
		
		char arr[] = str.toCharArray();
		int count;
		
		for(int i = 0; i<arr.length; i++){
			count = 1;
			
			for(int j = i+1; j<arr.length; j++){
				
				if(arr[i] == arr[j] && arr[i] != '0'){
					
					count++;
					
					arr[j] = '0';
				}
			}
					
					if(count > 1 && arr[i]!= '0')
					System.out.println(arr[i].length);
				
					
				}
	}
}
