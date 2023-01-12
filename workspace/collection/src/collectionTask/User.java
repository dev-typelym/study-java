package collectionTask;

public class User {
	
//	저장할 유저의 이름
	private String name;
//	저장할 유저의 비밀번호
	private String password;
//	저장할 유저의 전화번호
	private String phoneNum;
//	저장할 유저의 아이디
	private String id;

//  유저의 이름을 가져온다.	
	public String getName() {
		return name;
	}



//  유저의 이름을 설정한다.	
	public void setName(String name) {
		this.name = name;
	}


//  유저의 비밀번호를 가져온다.	
	public String getPassword() {
		return password;
	}


//  유저의 비밀번호를 설정한다.	
	public void setPassword(String password) {
		this.password = password;
	}


//  유저의 전화번호를 가져온다.
	public String getPhoneNum() {
		return phoneNum;
	}


//  유저의 전화번호를 설정한다.
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


//  유저의 아이디를 가져온다.
	public String getId() {
		return id;
	}


//  유저의 아이디를 설정한다.
	public void setId(String id) {
		this.id = id;
	}


// toString 메소드를 재정의하여 유저정보를 한번에 출력
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phoneNum=" + phoneNum + ", id=" + id + "]";
	}
}
