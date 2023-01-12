//package collectionTask;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Random;
//
//import org.json.JSONObject;
//
//import net.nurigo.java_sdk.api.Message;
//import net.nurigo.java_sdk.exceptions.CoolsmsException;
//
//public class UserField {
//	public ArrayList<User> userList = DBConnection.userList;
//	private final int KEY = 3;
//	private final int NUMBER_LENGTH = 6;
//	
//	// 아이디 중복검사
//	// 매개변수 id를 받아서 반복문으로 userList에 해당 id가 있는 유저가 존재하면 true를 반환 그렇지 않으면 false를 반환
//	public boolean checkId(String id) {
//		for (User user : userList) {
//			if (user.getId().equals(id)) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	// 회원가입
//	// 생성한 유저 객체를 userList DB에 저장	
//	public void register(User user) {
//		user.setPassword((encrypt(user.getPassword())));
//		userList.add(user);
//	}
//
//	// 로그인
//	// 매개변수 id와 password를 받고 userList에 해당 id와 password가 모두 일치하는 유저가 존재하면 그 유저 객체를 반환하고 아니면 null값을 반환		
//	public User login(String id, String password) {
//		for (User user : userList) {
//			if (user.getId().equals(id) && user.getPassword().equals(encrypt(password))) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	// 암호화
//	// 매개변수로 password를 입력받고 그 password를 KEY값으로 암호화한뒤 암호화된 password를 반환 
//	private String encrypt(String password) {
//		String encryptedPassword = "";
//			for (int i = 0; i < password.length(); i++) {
//				encryptedPassword += (char) (password.charAt(i) * KEY);
//			}
//			return encryptedPassword;
//		}
//	
//	// 복호화
//	// 비밀번호 변경시 확인할 테스트용
//	// 매개변수로 password를 입력받고 그 password를 KEY값으로 복호화한뒤 암호화된 password를 반환 
//	public String decrypt(String password) {
//		String decryptedPassword = "";
//		final int KEY = 3;
//			for (int i = 0; i < password.length(); i++) {
//				decryptedPassword += (char) (password.charAt(i) / KEY);
//			}
//			return decryptedPassword;
//		}
//
//
//	// 인증번호
//	// 인증번호 6자리를 생성하여 전송하고 certificationNum변수에 인증번호를 String타입으로 넣어준 뒤 반환
//	public String sendCertification(String phoneNum) {
//				String api_key = "NCSDUHJISKNPVPWG";
//				String api_secret = "JHZIQ6CVGFOPMMUKOJS07G2QSZYCGT9Y";
//				String certificationNum = "";
//				Random random = new Random();
//				//랜덤을 활용해 인증번호 6자리 생성
//				for (int i = 0; i < NUMBER_LENGTH; i++) {
//					certificationNum += random.nextInt(10);
//				}
//
//				Message coolsms = new Message(api_key, api_secret);
//				// 4 params(to, from, type, text) are mandatory. must be filled
//				HashMap<String, String> params = new HashMap<String, String>();
//				params.put("to", phoneNum);
//				params.put("from", "01072716604");
//				params.put("type", "SMS");
//				params.put("text", "인증번호: " + certificationNum);
//				params.put("app_version", "test app 1.2"); // application name and version
//
//				try {
//					JSONObject obj = (JSONObject) coolsms.send(params);
//					System.out.println(obj.toString());
//				} catch (CoolsmsException e) {
//					System.out.println(e.getMessage());
//					System.out.println(e.getCode());
//				}
//				return certificationNum;
//	}
//
//	// 비밀번호 변경
//	//password, id, phoneNum을 매개변수로 입력받고 userList에서 id와 phoneNum가 모두 일치하는 유저가 존재하면 그때 그 객체의 비밀번호를 입력한 password로 변경 
//	public void changePassword(String password, String id ,String phoneNum) {
//		for (User user : userList) {
//			if (user.getId().equals(id) && user.getPhoneNum().equals(phoneNum)) {
//				user.setPassword(encrypt(password));
//			}
//		}
//	}
//}
