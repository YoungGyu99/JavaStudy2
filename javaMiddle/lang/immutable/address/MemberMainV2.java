package javaMiddle.lang.immutable.address;

public class MemberMainV2 {

	public static void main(String[] args) {
		ImmutableAddress address = new ImmutableAddress("서울");
		
		MemberV2 memberA = new MemberV2("회원A" , address);
		MemberV2 memberB = new MemberV2("회원B" , address);
		
		//회원A, 회원B의 처음 주소는 모두 서울
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);
		
		
		//회원B의 주소를 부산으로 변경해야함		
		//사이트이펙트가 발생하지 않기 위해서는 결국 memberB.setAddress(new ImmutableAddress("부산")); 와 같은 새로운 주소 객체를 만들어서 전달한다.
		memberB.setAddress(new ImmutableAddress("부산"));
		System.out.println("부산 -> memberB.address");
		System.out.println("memberA = " + memberA);
		System.out.println("memberB = " + memberB);
		

	}

}
