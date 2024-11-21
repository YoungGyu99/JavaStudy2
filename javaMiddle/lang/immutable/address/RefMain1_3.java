package javaMiddle.lang.immutable.address;

public class RefMain1_3 {

	public static void main(String[] args) {

		/*- 1_2와 비교했을때 change()메서드 하나만 추가되었다. 그리고 change()메서드에서 Address인스턴스에 있는 value 값을 변경한다.
		 *- main() 메서드만 보면 a의 값이 부산으로 변경된 이유를 찾기가 더 어렵다
		 * */
		
		//참조형 변수는 하나의 인스턴스를 공유할 수 있다.
		Address a = new Address("서울");
		Address b = a; // 
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		

		change(b, "부산");
		System.out.println("a = " + a); // 사이드 이펙트 발생
		System.out.println("b = " + b);
	} 
	
	private static void change(Address address, String changeAddress) {
		System.out.println("주고 값을 변경한다 ->" + changeAddress);
		address.setValue(changeAddress);
			
		}
	}


