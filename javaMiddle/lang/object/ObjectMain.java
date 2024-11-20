package javaMiddle.lang.object;

public class ObjectMain {

	public static void main(String[] args) {

		Child child = new Child();
		child.childMethod();
		child.parentMethod();
		
		// toString()은 Object 클래스의 메서드
		String string = child.toString();
		System.out.println(string);
		/* 1. child.toString()을 호출한다.
		 * 2. 먼저 본인의 타입인 Child 에서 toString()을 찾는다. 없으므로 부모 타입으로 올라가서 찾는다.
		 * 3. 부모 타입인 Parent에서 찾는다. 없으므로 부모 타이븡로 올라가서 찾는다.
		 * 4. 부모 타입인 Object에서 찾는다.Object에 toString()이 있으므로 이 메서드를 호출한다.
		 * */
	}

}
