package javaMiddle.lang.immutable.address;

public class RefMain1_1 {

	public static void main(String[] args) {
		
		/* - 처음에는 a, b 둘다 서울이라는 주소를 가져야 하다고 가정하자.
		 * 	 	따라서 Address b = a 코드를 작성했고, 변수 a, b둘다 서울이라는 주소를 가진다.
		 * - 이후에 b의 주소를 부산으로 변경한다.
		 * - 그런데 실행결과는 b뿐만 아니라 a의 주소도 함께 부산으로 변경되어 버린다.
		 * */
		
		
		//참조형 변수는 하나의 인스턴스를 공유할 수 있다.
		Address a = new Address("서울");
		Address b = a; // a의 값을 b에 복사하기 때문에 서울에서 부산으로 변경시 a와 b 둘다 변경된다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		//참조형 변수는 참조 값을 통해 같은 객체 인스턴스를 공유할 수 있다.
		b.setValue("부산"); //b의 값을 부산으로 변경해야함
		System.out.println("부산 -> b");
		System.out.println("a = " + a); // 사이드 이펙트 발생
		System.out.println("b = " + b);
	} 

}
