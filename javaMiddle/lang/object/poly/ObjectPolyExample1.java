package javaMiddle.lang.object.poly;

public class ObjectPolyExample1 {

	public static void main (String[] args) {
		Dog dog = new Dog();
		Car car = new Car();
		
		
		action(dog);
		action(car);
	}
	
	private static void action(Object obj) {
	//obj.sound(); // 컴파일 오류, Object는 sound()가 없다.
	//obj.move(); //컴파일 오류, Object는 move()가 없다.
	/* - obj.sound() 를 호출한다.
	 * - obj는 Object 타입으로 Object 타입에서 sound()를 찾는다.
	 * - Object에서 sound()를 찾을 수 없다. Object는 최종 부모이므로 더는 올라가서 찾을 수 없다. 따라서 오류가 발생
	 * - 호출을 위해서는 아래처럼 객체에 맞는 다운 캐스팅이 필요하다.
	 * */
	//객체에 맞는 다운 캐스팅 필요
		if (obj instanceof Dog dog) {
			dog.sound();
		} else if (obj instanceof Car car) {
			car.move();
		}
	}
}