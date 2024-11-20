package javaMiddle.lang.object.tostring;

public class ToStringMain2 {

	public static void main(String[] args) {
		Car car = new Car("Model Y");
		Dog dog1 = new Dog("멍멍이1", 2);
		Dog dog2 = new Dog("멍멍이2", 5);

		System.out.println("1. 단순 toString 호출");
		System.out.println(car.toString());
		System.out.println(dog1.toString());
		System.out.println(dog2.toString());
		
		System.out.println("2. 단순 toString 호출");
		System.out.println(car);
		System.out.println(dog1);
		System.out.println(dog2);
		
		System.out.println("3. Object 다형성 활용");
		ObjectPrinter.print(car); // car에 경우 오버라이딩된 메서드가 없어 Object.toString()을 실행한다. 
		ObjectPrinter.print(dog1);//오버라이딩이 있어 Dog에 재정의된 메서드를 호출
		ObjectPrinter.print(dog2);

		
		String refValue = Integer.toHexString(System.identityHashCode(dog1)); // 객체의 참조값 직접 출력
		System.out.println("refvalue = " + refValue);
		
	}

}
