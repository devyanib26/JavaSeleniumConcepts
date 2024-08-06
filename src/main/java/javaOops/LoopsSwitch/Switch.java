package javaOops.LoopsSwitch;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int day = 5;
	Switch s1 = new Switch();
	//s1.dayOfWeek(5);
	s1.dayNum(s1.dayOfWeek(5));
	}

	String dayOfWeek(int day) {
		switch(day) {
		case 1: System.out.println("Sunday"); return ("Sun");
		//break;
		case 2: System.out.println("Monday");return ("Mon");
		//break;
		case 3:	System.out.println("Tuesday");return ("Tues");
		//break;
		case 4:	System.out.println("Wednesday");return ("Wed");
		//break;
		case 5:	System.out.println("Thursday");return ("Thu");
		//break;
		case 6:	System.out.println("Friday");return ("Fri");
		//break;
		case 7:	System.out.println("Saturday");return ("Sat");
		//break;
		default: System.out.println("Invalid Input. Please enter a valid input between 1 and 7."); return ("Invallid");
		//break;
		}
	}
	void dayNum(String day) {
		switch(day) {
		case "Sun": System.out.println("Day 1 of the week.");
		break;
		case "Mon": System.out.println("Day 2 of the week.");
		break;
		case "Tues":	System.out.println("Day 3 of the week.");
		break;
		case "Wed":	System.out.println("Day 4 of the week.");
		break;
		case "Thu":	System.out.println("Day 5 of the week.");
		break;
		case "Fri":	System.out.println("Day 6 of the week.");
		break;
		case "Sat":	System.out.println("Day 7 of the week.");
		break;
		default: System.out.println("Invalid Input.");
		break;
		}
	}
}
