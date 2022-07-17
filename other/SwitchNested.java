//Java Program to demonstrate the use of Java Nested Switch  

public class SwitchNested{
	public static void main(String[] args){
		char branch = 'C';
		int collegeYear = 4;
		switch(collegeYear){
			case 1:
				System.out.println("English, Math,Science");
				break;
			case 2:
				switch(branch)
				{
					case 'C':
						System.out.println("OS, DS,SE");
							break;
					case 'I':
						System.out.println("WE, CD, Blockchain");
							break;
				}
			case 4:
				switch(branch)
				{
					case 'C':
						System.out.println("Python,Java,networking");
						break;
				}
		}
	}
}