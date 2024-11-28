package javaMiddle.lang.string.immutable;

public class StringImmutable2 {
	
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1.concat("java");
		System.out.println("str = " + str1);
		System.out.println("str = " + str2);

		
		/* String.concat() 메서드를 사용하면 기존 문자열에 새로운 문자열을 연결해서 합칠 수 있다.
		 *
		 *String은 불변 객체이다. 따라서 변경이 필요한 경우 기존 값을 변경하지 않고, 대신에 새로운 결과를 만들어서 반환한다.
		 * */
	}

}
