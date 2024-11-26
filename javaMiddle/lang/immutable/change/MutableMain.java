package javaMiddle.lang.immutable.change;

public class MutableMain {

	public static void main(String[] args) {
		/* - MutableObj을 10이라는 값으로 생성한다.
		 * - 이후에 obj.add(20)을 통해서 10 + 20을 수행한다.
		 * 		계산 이후에 기존에 있던 10이라는 값은 사라진다.
		 * 		MutableObj의 상태(값)가 10 -> 30으로 변경되었다.
		 * - obj.getValue()을 호출하면 30이 출력된다.
		 * */

		MutabeObj obj = new MutabeObj(10);
		obj.add(20);
		
		//계산 이후의 기존 값은 사라짐 
		System.out.println("obj = " + obj.getValue());
	}

}
