package javaMiddle.lang.object.equals;

public class UserV2 {
	/* - Object 의 equals() 메서드를 재정의했다.
	 * - UserV2 의 동등성은 id (고객번호)로 비교한다.
	 * - equals() 는 Object 타입을 매개변수로 사용한다. 따라서 객체의 특정값을 사용하려면 다운캐스팅이 필요하다.
	 * - 여기서 현재 인스턴스(this)에 있는 id 문자열과 비교대상으로 넘어온 객체의 id 문자열을 비교한다.
	 * - UserV2 에 있는 id 는 String 이다. 문자열 비교는 == 이 아니라 equals()를 사용해야 한다.
	 * */

	private String id;
	
	public UserV2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		UserV2 user = (UserV2) obj;
		boolean result = id.equals(user.id); //다운캐스팅을 통해 타입을 맞춤
		return result;
	}
	
	
}
	
	

