package javaMiddle.lang.immutable.address;

public class MemberV2 {

	private String name;
	private ImmutableAddress address;
	
	public MemberV2(String name, ImmutableAddress ImmutableAddress) {
		this.name = name;
		this.address = ImmutableAddress;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ImmutableAddress getAddress() {
		return address;
	}
	public void setAddress(ImmutableAddress ImmutableAddress) {
		this.address = ImmutableAddress;
	}

	@Override
	public String toString() {
		return "MemberV1 {"+
				"name='" + name + '\'' +
				", address=" + address + 
				']';
	}
}
