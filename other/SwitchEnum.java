// java program to demonstrate the use of enum

public class SwitchEnum{ 
	public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
		public static void main(String[] args){
			Day[] dayNow = Day.values();
			for(Day Now : dayNow)
			{
				switch(Now)
				{
					case Sun:
						System.out.println("Sunday");
						break;
					case Mon:
						System.out.println("Monday");
						break;
					case Tue:
						System.out.println("Sunday");
						break;
					case Wed:
						System.out.println("Wednesday");
						break;
					case Thu:
						System.out.println("Thursday");
						break;
					case Fri:
						System.out.println("Friday");
						break;
					case Sat:
						System.out.println("Saterday");
						break;
				}
			}
		}

}

		