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
//	// ���̵� �ߺ��˻�
//	// �Ű����� id�� �޾Ƽ� �ݺ������� userList�� �ش� id�� �ִ� ������ �����ϸ� true�� ��ȯ �׷��� ������ false�� ��ȯ
//	public boolean checkId(String id) {
//		for (User user : userList) {
//			if (user.getId().equals(id)) {
//				return false;
//			}
//		}
//		return true;
//	}
//
//	// ȸ������
//	// ������ ���� ��ü�� userList DB�� ����	
//	public void register(User user) {
//		user.setPassword((encrypt(user.getPassword())));
//		userList.add(user);
//	}
//
//	// �α���
//	// �Ű����� id�� password�� �ް� userList�� �ش� id�� password�� ��� ��ġ�ϴ� ������ �����ϸ� �� ���� ��ü�� ��ȯ�ϰ� �ƴϸ� null���� ��ȯ		
//	public User login(String id, String password) {
//		for (User user : userList) {
//			if (user.getId().equals(id) && user.getPassword().equals(encrypt(password))) {
//				return user;
//			}
//		}
//		return null;
//	}
//
//	// ��ȣȭ
//	// �Ű������� password�� �Է¹ް� �� password�� KEY������ ��ȣȭ�ѵ� ��ȣȭ�� password�� ��ȯ 
//	private String encrypt(String password) {
//		String encryptedPassword = "";
//			for (int i = 0; i < password.length(); i++) {
//				encryptedPassword += (char) (password.charAt(i) * KEY);
//			}
//			return encryptedPassword;
//		}
//	
//	// ��ȣȭ
//	// ��й�ȣ ����� Ȯ���� �׽�Ʈ��
//	// �Ű������� password�� �Է¹ް� �� password�� KEY������ ��ȣȭ�ѵ� ��ȣȭ�� password�� ��ȯ 
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
//	// ������ȣ
//	// ������ȣ 6�ڸ��� �����Ͽ� �����ϰ� certificationNum������ ������ȣ�� StringŸ������ �־��� �� ��ȯ
//	public String sendCertification(String phoneNum) {
//				String api_key = "NCSDUHJISKNPVPWG";
//				String api_secret = "JHZIQ6CVGFOPMMUKOJS07G2QSZYCGT9Y";
//				String certificationNum = "";
//				Random random = new Random();
//				//������ Ȱ���� ������ȣ 6�ڸ� ����
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
//				params.put("text", "������ȣ: " + certificationNum);
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
//	// ��й�ȣ ����
//	//password, id, phoneNum�� �Ű������� �Է¹ް� userList���� id�� phoneNum�� ��� ��ġ�ϴ� ������ �����ϸ� �׶� �� ��ü�� ��й�ȣ�� �Է��� password�� ���� 
//	public void changePassword(String password, String id ,String phoneNum) {
//		for (User user : userList) {
//			if (user.getId().equals(id) && user.getPhoneNum().equals(phoneNum)) {
//				user.setPassword(encrypt(password));
//			}
//		}
//	}
//}
