//package collectionTask;
//
//import java.util.Scanner;
//
//public class Page {
//	public static void main(String[] args) {
//		String logInId = null, //�׽�Ʈ�� �Է��� �α��� ���̵� ����
//			   logInPassword = null, //�׽�Ʈ�� �Է��� �α��� ��й�ȣ ����
//			   phoneNumber = null, // ������ȣ ���۽� �Է��� ��ȭ��ȣ ����
//			   newPassword = null, // ���ο� �н����� ����
//			   cerNum = null , // ������ȣ �߼��� �߼۵� ������ȣ ����
//			   cerNumCheck = null, // ����ڰ� �Է��� ������ȣ ����
//			   idCheck = null; // ��й�ȣ�� ������ id ����
//		
//		//UserField�� ��ü ����
//		UserField uf = new UserField();
//		
//		//ù��° ���� ��ü ����
//		User user1 = new User();
//		//�ι�° ���� ��ü ����
//		User user2 = new User();
//		Scanner sc = new Scanner(System.in);
//	
//		//ù��° ���� ��ü�� ���� �Է�
//		user1.setId("idTest1");
//		user1.setName("������");
//		user1.setPassword("passwordTest1");
//		user1.setPhoneNum("01072716604");
//		
//		
//		//�ι�° ���� ��ü�� ���� �Է�
//		user2.setId("idTest2");
//		user2.setName("ȫ�浿");
//		user2.setPassword("passwordTest2");
//		user2.setPhoneNum("01027422024");
//		
//		// �׽�Ʈ ����
//		// ����1. id: idTest1, ��й�ȣ: passwordTest1 ��ȭ��ȣ: 01072716604
//		// ����2. id: idTest2, ��й�ȣ: passwordTest2 ��ȭ��ȣ: 01027422024
//		
//		//register �׽�Ʈ 
//		//checkId�޼ҵ带 �̿��Ͽ� �ߺ�Ȯ�� �� �ߺ��� �ƴϸ� true�� ��ȯ�Ͽ� ȸ�����Կ� �����ϰ� �ߺ��̸� false�� ��ȯ�Ͽ� ȸ�����Կ� ����  
//		if(uf.checkId(user1.getId())) {
//			uf.register(user1);
//			System.out.println("���� �Ϸ�");
//		}else {
//			System.out.println("�ߺ� ���̵� ����");
//		}
//		
//		//checkId�޼ҵ带 �̿��Ͽ� �ߺ�Ȯ�� �� �ߺ��� �ƴϸ� true�� ��ȯ�Ͽ� ȸ�����Կ� �����ϰ� �ߺ��̸� false�� ��ȯ�Ͽ� ȸ�����Կ� ����
//		if(uf.checkId(user2.getId())) {
//			uf.register(user2);
//			System.out.println("���� �Ϸ�");
//		}else {
//			System.out.println("�ߺ� ���̵� ����");
//		}
//
//		//ȸ������ ���� �� userList�� ��ϵ� ������ �ִ��� �׽�Ʈ
//		System.out.println(uf.userList);
//		
//		//logIn �׽�Ʈ
//		//�α����� ���̵� �Է�
//		System.out.print("�α��� �� ���� ���̵�: ");
//		//�α����� ���̵� �Է¹޾� logInId ������ ����
//		logInId = sc.next();
//		//�α����� ��й�ȣ �Է�
//		System.out.print("�α��� �� ���� ��й�ȣ: ");
//		//�α����� ��й�ȣ�� �Է¹޾� logInId ������ ����
//		logInPassword = sc.next();
//		
//		//userField�� logIn�޼ҵ带 ����Ͽ� logIn�޼ҵ尡 null���� �ƴ϶�� �α��� ���� null���̸� �α��� ����
//		if(uf.login(logInId, logInPassword) != null) {
//			System.out.println(uf.login(logInId, logInPassword).getName() + "�� ȯ���մϴ�.");
//		}else {
//			System.out.println("�α��ο� �����Ͽ����ϴ�.");
//		}
//		
//		//logIn�޼ҵ尡 ��ü�� �� ��ȯ�ϴ��� �׽�Ʈ
//		System.out.println(uf.login(logInId,logInPassword));
//		System.out.println("");
//		
//		//��й�ȣ ���� �׽�Ʈ
//		//��й�ȣ�� ������ id�Է�
//		System.out.println("��й�ȣ ����");
//		System.out.print("���� id: ");
//		idCheck = sc.next();
//		
//		//checkId�޼ҵ带 �̿��Ͽ� �ߺ�Ȯ�� �� userList�� ���� ���̵� �����ϸ� �������� ����
//		if(!uf.checkId(idCheck)){
//			//������ȣ ���� ��ȣ �Է�
//			System.out.print("������ȣ�� ���� ��ȭ��ȣ: ");
//			phoneNumber = sc.next();
//			//sendCertification�޼ҵ�� �Ű������� ���� ��ȣ�� ������ȣ�� �����ϰ� cerNum������ ��ȯ�� ������ȣ�� ����
//			cerNum = uf.sendCertification(phoneNumber);
//			//������ȣ �Է�
//			System.out.print("������ȣ Ȯ��: ");
//			cerNumCheck = sc.next();
//			//�Էµ� ������ȣ�� ���۵� ������ȣ�� ���ٸ� changePassword�޼ҵ� ����
//			if(cerNum.equals(cerNumCheck)) {
//				//���ο� �н����� �Է�
//				System.out.print("���ο� �н����� �Է�: ");
//				newPassword = sc.next();
//				//changePassword�޼ҵ尡 id�� ��ȭ��ȣ�� Ȯ���ϰ� ����ڰ� ���ϴ� ��й�ȣ�� ��ȣȭ�Ͽ� �������ش�.
//				uf.changePassword(newPassword, idCheck, phoneNumber);
//			//������ȣ�� �ٸ��� �ٸ��ٰ� �˸�
//			}else {
//				System.out.println("������ȣ�� �ٸ��ϴ�.");
//			}
//		//���� ���̵� �������� ���� �� ������ ���ٰ� �˸�
//		}else {
//			System.out.println("������ �������� �ʽ��ϴ�.");
//		}
//		
//		//��й�ȣ�� �����ߴ��� ����Ͽ� Ȯ��
//		//���� ��й�ȣ ������ ������ ��й�ȣ�� �� �ٲ����� ��ȣȭ�ؼ� Ȯ��
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
