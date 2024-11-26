package javaMiddle.lang.immutable.test;

public class ImmuableMyDateMain {

	public static void main(String[] args) {
	

		//date1=x001,  date2=x001
		ImmuableMyDate date1 = new ImmuableMyDate (2024,1,1);
		ImmuableMyDate date2 = date1; 
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date1);
		
		System.out.println("2025 -> date"); 
		date1 = date1.withYear(2025);//date1=x002, date2=x001
		System.out.println("date1 = " + date1); //x002
		System.out.println("date2 = " + date2); //x001
	}

}
