// switch  statement example

public class SwitchExample{
	public static void main(String args[]){
		int month = 4;
		String monthString = "";
		switch(month){
			case 1:
			monthString = "1-january";
			break;
			case 2:
			monthString = "2-febuary";
			break;
			case 3:
			monthString = "3-march";
			break;
			case 4:
			monthString = "4-april";
			break;
			case 5:
			monthString = "5-may";
			break;
			case 6:
			monthString = "6-june";
			break;
			case 7:
			monthString = "7-july";
			break;
			case 8:
			monthString = "8-august";
			break;
			case 9:
			monthString = "9-september";
			break;
			case 10:
			monthString = "10-octuber";
			break;
			case 11:
			monthString = "11-november";
			break;
			case 12:
			monthString = "12-december";
			break;
			default:
			System.out.println("not valid month!!");
		}
		System.out.println(monthString);
	}
}
		
		