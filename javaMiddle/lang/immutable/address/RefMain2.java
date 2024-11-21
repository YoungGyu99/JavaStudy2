package javaMiddle.lang.immutable.address;

public class RefMain2 {

	public static void main(String[] args) {
		/*- ImmutableAddress의 경우 값을 변경할 수 있는 b.setValue() 메서드 자체가 제거되었다.
		 *- 이제 ImmutableAddress 인스턴스의 값을 변경할 수 있는 방법은 없다.
		 *- ImmutableAddress를 사용하는 개발자는 값을 변경하려고 시도하다가, 값을 변경하는 것이 불가능하다는 사실을 알고, 이 객체가 불변 객체인것을 깨닫게 된다.
		 *     예를들어 b.setValue("부산")을 호출하려고 했는데, 해당 메서드가 없다는 사실을 컴파일 오류를 통해 인지한다.
		 *- 따라서 어쩔 수 없이 새로운 ImmutableAddress("부산")인스턴스를 생성해서 b에 대입한다.
		 *- 결과적으로 a, b는 서로 다른 인스턴스를 참조하고, a가 참조하던 ImmutableAddress는 그대로 유지된다.
		 * */

		

		ImmutableAddress a = new ImmutableAddress ("서울");
		ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없다.
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		
				
//		b.setValue("부산"); //b의 값을 부산으로 변경해야함
		b = new ImmutableAddress("부산");
		System.out.println("부산 -> b");
		System.out.println("a = " + a); 
		System.out.println("b = " + b);
	} 

}
