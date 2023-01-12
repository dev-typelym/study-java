package hashSetTest;

public class Student {
	private int number;
	private String member;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}

	public Student(int number, String member) {
		super();
		this.number = number;
		this.member = member;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", member=" + member + "]";
	}
	
	
	
	

}
