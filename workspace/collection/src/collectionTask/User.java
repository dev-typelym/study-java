package collectionTask;

public class User {
	
//	������ ������ �̸�
	private String name;
//	������ ������ ��й�ȣ
	private String password;
//	������ ������ ��ȭ��ȣ
	private String phoneNum;
//	������ ������ ���̵�
	private String id;

//  ������ �̸��� �����´�.	
	public String getName() {
		return name;
	}



//  ������ �̸��� �����Ѵ�.	
	public void setName(String name) {
		this.name = name;
	}


//  ������ ��й�ȣ�� �����´�.	
	public String getPassword() {
		return password;
	}


//  ������ ��й�ȣ�� �����Ѵ�.	
	public void setPassword(String password) {
		this.password = password;
	}


//  ������ ��ȭ��ȣ�� �����´�.
	public String getPhoneNum() {
		return phoneNum;
	}


//  ������ ��ȭ��ȣ�� �����Ѵ�.
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


//  ������ ���̵� �����´�.
	public String getId() {
		return id;
	}


//  ������ ���̵� �����Ѵ�.
	public void setId(String id) {
		this.id = id;
	}


// toString �޼ҵ带 �������Ͽ� ���������� �ѹ��� ���
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phoneNum=" + phoneNum + ", id=" + id + "]";
	}
}
