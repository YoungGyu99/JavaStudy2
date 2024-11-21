package javaMiddle.lang.immutable.address;

public class RefMain1_2 {

	public static void main(String[] args) {
		

		
		
		//참조형 변수는 하나의 인스턴스를 공유할 수 있다.
		//a와 b는 서로 다른 인스턴스를 참조한다. 따라서 b가 참조하는 인스턴스의 값을 변경해도 a에는 영향을 주지 않는다.
		Address a = new Address("서울"); //x001
		Address b = new Address("서울"); //x002 a와 b가 서로 다른 참조가 되기때문에 정상적으로 실행된다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
		b.setValue("부산"); //
		System.out.println("부산 -> b");
		System.out.println("a = " + a); // 사이드 이펙트 발생
		System.out.println("b = " + b);
	} 

}
