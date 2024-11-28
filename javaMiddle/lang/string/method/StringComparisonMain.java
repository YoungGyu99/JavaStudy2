package javaMiddle.lang.string.method;

public class StringComparisonMain {

	public static void main(String[] args) {
		String str1 = "Hello, Java!"; //대문자 일부 있음
		String str2 = "hello, java!"; //대문자 일부 있음
		String str3 = "Hello, World!"; 

		System.out.println("str1 equals str2: " + str1.equals(str2));
		System.out.println("str1 equalsIgnoreCase str2: " + str1.equalsIgnoreCase(str2));

		//compareTo 사전적 용어가 얼마나 차이가 나는지
		System.out.println("'b' compareTo 'a': " + "b".compareTo("a")); 
		System.out.println("'b' compareTo 'a': " + "c".compareTo("a"));
		System.out.println("str1 compareTo str3: " + str1.compareTo(str3));
		System.out.println("str1 compareToIgnoreCase str2: " + str1.compareToIgnoreCase(str2));
		
		System.out.println("str start with 'hello': " + str1.startsWith("Hello") );
		System.out.println("str ends with 'hello': " + str1.endsWith("Java!") );

	}

}
