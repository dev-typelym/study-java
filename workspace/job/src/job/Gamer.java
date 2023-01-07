package job;

import java.util.Random;
import java.util.Scanner;
// ���̸Ӱ� ������ ��� �Ȱ��ϸ�  ���� ������ �ռ��ϰų� �����ϸ� �¸��ϴ� ����
public class Gamer{
	String unitName;
	String rank;
	int minerals;
	int loseCount;
	int winCount;
	int buyPrice;
	int price;
	int unitCount;
	int percentageNum;
	

// �����ڸ���
	Gamer(String unitName, int minerals, int loseCount, int winCount) {
		this.unitName = unitName;
		this.loseCount = loseCount;
		this.winCount = winCount;
		this.minerals = minerals;
	}
	
	
    Gamer(String unitName, String rank, int unitCount, int price) {
		this.unitName = unitName;
		this.unitCount = unitCount;
		this.rank = rank;
		this.price =price;
	}

	Gamer(String unitName, String rank, int unitCount, int buyPrice, int price, int percentageNum) {
		this.unitName = unitName;
		this.rank = rank;
		this.unitCount = unitCount;
		this.buyPrice = buyPrice;
		this.price = price;
		this.percentageNum = percentageNum;
	}
	
//  Ȯ�� �޼ҵ�
	boolean percentage() {
		Random random = new Random();
	  
		int[] rating = new int[10];
	  
		for (int i = 0; i < this.percentageNum / 10; i++) {
			rating[i] = 1;
		}
	  
		if(rating[random.nextInt(10)] == 1) {
			return true;
		}
		return false;
	}
	
// ���� ���� �޼ҵ�
	boolean buyUnit(int price) {
		if (this.minerals >= price) {
			return true;
		} 
		return false;
	}
	
// ���� �Ǹ� �޼ҵ�
	boolean sellUnit() {
		if (this.unitCount >= 1) {
			return true;
		} 
		return false;
	}
	
//	���׷��̵� �޼ҵ�
	boolean unitUpgrade() {
		if (this.unitCount >= 3) {
			return true;
		} 
		return false;
	}
	
//	�ݷ��� �޼ҵ�
	boolean encourage() {
		if(this.loseCount == 3) {
			return true;
		}
		return false;
	}
	
//  �����1 �޼ҵ�
	boolean mission1() {
		if(this.unitCount > 1) {
			return true;
		}
		return false;
	}
	
//	�����2 �޼ҵ�
	boolean bonus() {
		if(this.winCount == 3) {
			return true;
		}
		return false;
	}
	
//	�¸� �޼ҵ�
	boolean gamerWin() {
		if (this.unitCount == 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		// ����� �̸� �Է�
		Scanner sc = new Scanner(System.in);
		System.out.print("�г��� �Է�: ");
		String name = sc.next();
		// �� ���ֺ� ��ü ����
		Gamer gamer1 = new Gamer(name, 10000, 0, 0);
		Gamer zealot = new Gamer("Zealot", "���Ϲݡ�", 10, 1000, 500, 70);
		Gamer dragoon = new Gamer("Dragoon", "�߷����", 0, 2000, 1000, 50);
		Gamer highTempler = new Gamer("HighTempler", "�ݿ��ȡ�", 0, 3000, 2000, 30);
		Gamer archon = new Gamer("Archon", "��������", 0, 5000);
		int choice = 0,  firstHighTemplerCount = 0;
		boolean flag = false;
		
		if(name != null) {
			while (true) {
				// ���� ȭ�� ���
				String msg = "�ڡ١ڡ١ڡ������佺 ���� ���׷��̵� ���ӡڡ١ڡ١ڡ�\n"
						+ "                 ���ǥ\n" 
						+ "	     ��������:   ��ĭ\n"
						+ "	     �ݿ��ȡ�: �������÷�\n"
						+ "	     �߷����:  ���\n"
						+ "	     ���Ϲݡ�:    ����\n"
						+"�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�\n"
						+ "--������ ���׷��̵��ؼ� �����ܰ踦 ���弼��!--\n"
						+ "-- ���� ���� ��ĭ�� �����ø� �¸��Դϴ�.--\n\n"
						+ gamer1.unitName + "���� �̳׶� ����: " + gamer1.minerals + "�̳׶�\n" 
						+ "1. ���� ����\n"
						+ "2. ���� �Ǹ�\n"
						+ "3. ���׷��̵�\n"
						+ "4. ����"
			          , buyMsg = "========������ ������ ������.========\n" 
			        		  		+ "1. ���Ϲݡ�:    ����   ����: 1000�̳׶�\n"
									+ "2. �߷����:  ���   ����: 2000�̳׶�\n"
									+ "3. �ݿ��ȡ�: �������÷�   ����: 3000�̳׶�\n"
									+ "4. ���ư���"
					  , sellMsg = "========�Ǹ��� ������ ������.========\n" 
									+ "1. ���Ϲݡ�:    ����   ����: 500�̳׶�\n"
									+ "2. �߷����:  ���   ����: 1000�̳׶�\n"
									+ "3. �ݿ��ȡ�: �������÷�    ����: 2000�̳׶�\n"
									+ "4. ���ư���"
					  , upgradeMsg = "========= ����� ���׷��̵� =========\n"
								    + "���׷��̵� ����� ��ü���� 3������ �ʿ��մϴ�.\n"
								    + "1. ��������3 -> �ߵ�󱺡�1 (Ȯ��70%)\n"
									+ "2. �ߵ�󱺡�3 -> ���������÷�1�� (Ȯ��50%)\n"
									+ "3. ���������÷���3 -> �پ�ĭ��1 (Ȯ��30%)\n"
									+ "4. ���ư���"
					  , status = "=============== �� ��ü�� =============\n"
									+ "���Ϲݡ�:    ����   ��ü��: " + zealot.unitCount+"\n"
								    + "�߷����:   ���   ��ü��: " + dragoon.unitCount+"\n"
									+ "�ݿ��ȡ�:  �������÷�   ��ü��: " + highTempler.unitCount+"\n"
									+ "��������:   ��ĭ   ��ü��: " + archon.unitCount+"\n";
					  
				System.out.println(msg);
				System.out.println(status);
				
				//���� ���� ����
				choice = sc.nextInt();
				switch (choice) {
				case 1: // ���� ����
					System.out.println(buyMsg);
						choice = sc.nextInt();
						switch (choice) {
						case 1: //����
							if (gamer1.buyUnit(zealot.buyPrice)) {
								zealot.unitCount++;
								gamer1.minerals -= zealot.buyPrice;
								System.out.println("���� 1��ü ����\n");
							} else {
								System.out.println("�̳׶��� ���ڶ��ϴ�.\n");
							}
							break;
						case 2: //���
							if (gamer1.buyUnit(dragoon.buyPrice)) {
								dragoon.unitCount++;
								gamer1.minerals -= dragoon.buyPrice;
								System.out.println("��� 1��ü ����\n");
							} else {
								System.out.println("�̳׶��� ���ڶ��ϴ�.\n");
							}
							break;
						case 3:
							if (gamer1.buyUnit(highTempler.buyPrice)) {
								highTempler.unitCount++;
								gamer1.minerals -= highTempler.buyPrice;
								System.out.println("�������÷� 1��ü ����\n");
							} else {
								System.out.println("�̳׶��� ���ڶ��ϴ�.\n");
							}
							break;
						case 4:
							break;
	
						default:
							System.out.println("1~4�� �Է��ϼ���\n");
						}
						break;
				//���� �Ǹ� ����	
				case 2:
					System.out.println(sellMsg);
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							if (zealot.sellUnit()) {
								zealot.unitCount--;
								gamer1.minerals += zealot.price;
								System.out.println("���� 1��ü �Ǹ�\n");
							} else {
								System.out.println("�Ǹ��� ������ �����ϴ�.\n");
							}
							break;
						case 2:
							if (dragoon.sellUnit()) {
								dragoon.unitCount--;
								gamer1.minerals += dragoon.price;
								System.out.println("��� 1��ü �Ǹ�\n");
							} else {
								System.out.println("�Ǹ��� ����� �����ϴ�.\n");
							}
							break;
						case 3:
							if (highTempler.sellUnit()) {
								highTempler.unitCount--;
								gamer1.minerals += highTempler.price;
								System.out.println("�������÷� 1��ü �Ǹ�\n");
							} else {
								System.out.println("�Ǹ��� �������÷��� �����ϴ�.\n");
							}
							break;
						case 4:
							break;
							
						default:
							System.out.println("1~4�� �Է��ϼ���\n");
							break;
						}
						break;
				//���� ���׷��̵� ����
				case 3:
					System.out.println(upgradeMsg);
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							if(zealot.unitUpgrade()) {
								if(zealot.percentage()) {
									zealot.unitCount -= 3;
									dragoon.unitCount++;
									gamer1.winCount++;
									System.out.println("���׷��̵� ����! ���+1\n");
								}else {
									zealot.unitCount -= 3;
									System.out.println("���׷��̵� ����!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("���� ��ü���� ���ڶ��ϴ�.\n");
							}
							break;
						case 2:
							if(dragoon.unitUpgrade()) {
								if(dragoon.percentage()) {
									dragoon.unitCount -= 3;
									highTempler.unitCount++;
									gamer1.winCount++;
									firstHighTemplerCount++;
									System.out.println("���׷��̵� ����! �������÷�+1\n");
								}else {
									dragoon.unitCount -= 3;
									System.out.println("���׷��̵� ����!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("��� ��ü���� ���ڶ��ϴ�.\n");
							}
							break;
						case 3:
							if(highTempler.unitUpgrade()) {
								if(highTempler.percentage()) {
									highTempler.unitCount -= 3;
									archon.unitCount++;
									gamer1.winCount++;
									System.out.println("��ĭ ���� ����\n");
								}else {
									highTempler.unitCount -= 3;
									System.out.println("���׷��̵� ����!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("�������÷� ��ü���� ���ڶ��ϴ�.\n");
							}
							
							break;
	
						case 4:
							break;
	
						default:
							System.out.println("1~4�� �Է��ϼ���\n");
							break;
						}
						// ���� �̼� ù ���ȵ�� ���� ������ ����� ����
						if(firstHighTemplerCount == 1) {
							firstHighTemplerCount++;
							gamer1.minerals += 10000;
							System.out.println("��ù �ݿ��ȡݵ�� ���տ� �����ϼ̽��ϴ�. ����� 5000�̳׶��� �����մϴ�.\n");
						}
						// ���� 3�� ���׷��̵� ������ ����� ����
						if(gamer1.bonus()) {
							gamer1.minerals += 5000;
							gamer1.winCount = 0;
							System.out.println("�ؿ��� 3ȸ ���׷��̵忡 �����ϼ̽��ϴ�. ����� 3000�̳׶��� �����մϴ�.\n");
						}
						// ������ ���׷��̵� �������κ��� 3ȸ �����Ҷ����� �ݷ��� ����
						if(gamer1.encourage()) {
							gamer1.minerals += 3000;
							gamer1.loseCount = 0;
							System.out.println("�ظ����� �������κ��� 3ȸ ���׷��̵带 �����ϼ̽��ϴ�. �ݷ��� 2000�̳׶��� �����մϴ�.\n");
						}
						break;
				//���� ����	
				case 4:
					flag = true;
					break;
				default:
					break;
				}
				if(flag) {
					break;
				}
				//�¸����� ����
				if(archon.gamerWin()) {
					System.out.println("�����ϵ帳�ϴ�. ���� ������ ��ĭ ȹ�濡 �����Ͽ� ���ӿ��� �¸��ϼ̽��ϴ�.��");
					break;
				}
				//�й����� ����
				if(zealot.unitCount < 3 && dragoon.unitCount < 3 && highTempler.unitCount < 3 && archon.unitCount < 3 && gamer1.minerals < 1000 ) {
					System.out.println("�� �̻� ���׷��̵带 ������ �� �����ϴ�. �й��ϼ̽��ϴ�.");
					break;
				}
				
	
			}
		}
	}
}
