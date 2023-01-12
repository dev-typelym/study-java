//package collectionTask;
//
//import java.util.Scanner;
//
//public class Page {
//	public static void main(String[] args) {
//		String logInId = null, //테스트시 입력할 로그인 아이디 저장
//			   logInPassword = null, //테스트시 입력할 로그인 비밀번호 저장
//			   phoneNumber = null, // 인증번호 전송시 입력할 전화번호 저장
//			   newPassword = null, // 새로운 패스워드 저장
//			   cerNum = null , // 인증번호 발송후 발송된 인증번호 저장
//			   cerNumCheck = null, // 사용자가 입력할 인증번호 저장
//			   idCheck = null; // 비밀번호를 변경할 id 저장
//		
//		//UserField의 객체 생성
//		UserField uf = new UserField();
//		
//		//첫번째 유저 객체 생성
//		User user1 = new User();
//		//두번째 유저 객체 생성
//		User user2 = new User();
//		Scanner sc = new Scanner(System.in);
//	
//		//첫번째 유저 객체에 정보 입력
//		user1.setId("idTest1");
//		user1.setName("임의택");
//		user1.setPassword("passwordTest1");
//		user1.setPhoneNum("01072716604");
//		
//		
//		//두번째 유저 객체에 정보 입력
//		user2.setId("idTest2");
//		user2.setName("홍길동");
//		user2.setPassword("passwordTest2");
//		user2.setPhoneNum("01027422024");
//		
//		// 테스트 시작
//		// 유저1. id: idTest1, 비밀번호: passwordTest1 전화번호: 01072716604
//		// 유저2. id: idTest2, 비밀번호: passwordTest2 전화번호: 01027422024
//		
//		//register 테스트 
//		//checkId메소드를 이용하여 중복확인 후 중복이 아니면 true를 반환하여 회원가입에 성공하고 중복이면 false를 반환하여 회원가입에 실패  
//		if(uf.checkId(user1.getId())) {
//			uf.register(user1);
//			System.out.println("가입 완료");
//		}else {
//			System.out.println("중복 아이디 존재");
//		}
//		
//		//checkId메소드를 이용하여 중복확인 후 중복이 아니면 true를 반환하여 회원가입에 성공하고 중복이면 false를 반환하여 회원가입에 실패
//		if(uf.checkId(user2.getId())) {
//			uf.register(user2);
//			System.out.println("가입 완료");
//		}else {
//			System.out.println("중복 아이디 존재");
//		}
//
//		//회원가입 절차 후 userList에 등록된 유저가 있는지 테스트
//		System.out.println(uf.userList);
//		
//		//logIn 테스트
//		//로그인할 아이디 입력
//		System.out.print("로그인 할 계정 아이디: ");
//		//로그인할 아이디를 입력받아 logInId 변수에 저장
//		logInId = sc.next();
//		//로그인할 비밀번호 입력
//		System.out.print("로그인 할 계정 비밀번호: ");
//		//로그인할 비밀번호를 입력받아 logInId 변수에 저장
//		logInPassword = sc.next();
//		
//		//userField의 logIn메소드를 사용하여 logIn메소드가 null값이 아니라면 로그인 성공 null값이면 로그인 실패
//		if(uf.login(logInId, logInPassword) != null) {
//			System.out.println(uf.login(logInId, logInPassword).getName() + "님 환영합니다.");
//		}else {
//			System.out.println("로그인에 실패하였습니다.");
//		}
//		
//		//logIn메소드가 객체를 잘 반환하는지 테스트
//		System.out.println(uf.login(logInId,logInPassword));
//		System.out.println("");
//		
//		//비밀번호 변경 테스트
//		//비밀번호를 변경할 id입력
//		System.out.println("비밀번호 변경");
//		System.out.print("계정 id: ");
//		idCheck = sc.next();
//		
//		//checkId메소드를 이용하여 중복확인 후 userList에 기존 아이디가 존재하면 인증절차 시작
//		if(!uf.checkId(idCheck)){
//			//인증번호 받을 번호 입력
//			System.out.print("인증번호를 받을 전화번호: ");
//			phoneNumber = sc.next();
//			//sendCertification메소드로 매개변수로 받은 번호에 인증번호를 전송하고 cerNum변수에 반환된 인증번호를 저장
//			cerNum = uf.sendCertification(phoneNumber);
//			//인증번호 입력
//			System.out.print("인증번호 확인: ");
//			cerNumCheck = sc.next();
//			//입력된 인증번호와 전송된 인증번호가 같다면 changePassword메소드 실행
//			if(cerNum.equals(cerNumCheck)) {
//				//새로운 패스워드 입력
//				System.out.print("새로운 패스워드 입력: ");
//				newPassword = sc.next();
//				//changePassword메소드가 id와 전화번호를 확인하고 사용자가 원하는 비밀번호를 암호화하여 변경해준다.
//				uf.changePassword(newPassword, idCheck, phoneNumber);
//			//인증번호가 다를시 다르다고 알림
//			}else {
//				System.out.println("인증번호가 다릅니다.");
//			}
//		//기존 아이디가 존재하지 않을 시 계정이 없다고 알림
//		}else {
//			System.out.println("계정이 존재하지 않습니다.");
//		}
//		
//		//비밀번호가 변경했는지 출력하여 확인
//		//유저 비밀번호 변경후 유저의 비밀번호가 잘 바꼈는지 복호화해서 확인
//		user1.setPassword(uf.decrypt(user1.getPassword()));
//		user2.setPassword(uf.decrypt(user2.getPassword()));
//		System.out.println(uf.userList);
//		
//		
//		
//		
//		
//		
//	}
//}
