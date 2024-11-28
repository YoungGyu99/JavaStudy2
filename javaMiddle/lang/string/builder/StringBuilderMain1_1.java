package javaMiddle.lang.string.builder;

public class StringBuilderMain1_1 {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		sb.append("A");
		sb.append("B");
		sb.append("C");
		sb.append("D");
		System.out.println("sb= " + sb);
		
		sb.insert(4, "Java");
		System.out.println("inser = " + sb);
		
		sb.delete(4, 8);
		System.out.println("delete = " + sb);
		
		sb.reverse();
		System.out.println("reverse = " + sb);
		
		//StringBuilder -> String
		String string = sb.toString();//가변에서 다시 불변으로 변경 가능
		System.out.println("string = " + string); 
		
		/* - StringBuilder 객체를 생성한다.
		 * - append() 메서드를 사용해 여러 문자열을 추가한다.
		 * - insert() 메서드로 특정 문자열을 삽입한다.
		 * - delete() 메서드로 특정 범위의 문자열을 삭제한다.
		 * - reverse() 메서드로 문자열을 뒤집는다.
		 * - 마지막으로 toString 메소드를 사용해 StringBuilder의 결과를 기반으로 String을 생성해서 반환한다. 
		 * */
	}

}
