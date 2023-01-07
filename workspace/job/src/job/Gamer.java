package job;

import java.util.Random;
import java.util.Scanner;
// 게이머가 유닛을 사고 팔고하며  최종 유닛을 합성하거나 구매하면 승리하는 게임
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
	

// 생성자모음
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
	
//  확률 메소드
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
	
// 유닛 구매 메소드
	boolean buyUnit(int price) {
		if (this.minerals >= price) {
			return true;
		} 
		return false;
	}
	
// 유닛 판매 메소드
	boolean sellUnit() {
		if (this.unitCount >= 1) {
			return true;
		} 
		return false;
	}
	
//	업그레이드 메소드
	boolean unitUpgrade() {
		if (this.unitCount >= 3) {
			return true;
		} 
		return false;
	}
	
//	격려금 메소드
	boolean encourage() {
		if(this.loseCount == 3) {
			return true;
		}
		return false;
	}
	
//  보상금1 메소드
	boolean mission1() {
		if(this.unitCount > 1) {
			return true;
		}
		return false;
	}
	
//	보상금2 메소드
	boolean bonus() {
		if(this.winCount == 3) {
			return true;
		}
		return false;
	}
	
//	승리 메소드
	boolean gamerWin() {
		if (this.unitCount == 1) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		// 사용자 이름 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임 입력: ");
		String name = sc.next();
		// 각 유닛별 객체 생성
		Gamer gamer1 = new Gamer(name, 10000, 0, 0);
		Gamer zealot = new Gamer("Zealot", "▼일반▼", 10, 1000, 500, 70);
		Gamer dragoon = new Gamer("Dragoon", "◆레어◆", 0, 2000, 1000, 50);
		Gamer highTempler = new Gamer("HighTempler", "◎에픽◎", 0, 3000, 2000, 30);
		Gamer archon = new Gamer("Archon", "☆전설☆", 0, 5000);
		int choice = 0,  firstHighTemplerCount = 0;
		boolean flag = false;
		
		if(name != null) {
			while (true) {
				// 시작 화면 출력
				String msg = "★☆★☆★☆프로토스 유닛 업그레이드 게임★☆★☆★☆\n"
						+ "                 등급표\n" 
						+ "	     ☆전설☆:   아칸\n"
						+ "	     ◎에픽◎: 하이템플러\n"
						+ "	     ◆레어◆:  드라군\n"
						+ "	     ▼일반▼:    질럿\n"
						+"☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆\n"
						+ "--유닛을 업그레이드해서 최종단계를 만드세요!--\n"
						+ "-- 최종 유닛 아칸을 뽑으시면 승리입니다.--\n\n"
						+ gamer1.unitName + "님의 미네랄 개수: " + gamer1.minerals + "미네랄\n" 
						+ "1. 유닛 구매\n"
						+ "2. 유닛 판매\n"
						+ "3. 업그레이드\n"
						+ "4. 종료"
			          , buyMsg = "========구매할 유닛을 고르세요.========\n" 
			        		  		+ "1. ▼일반▼:    질럿   가격: 1000미네랄\n"
									+ "2. ◆레어◆:  드라군   가격: 2000미네랄\n"
									+ "3. ◎에픽◎: 하이템플러   가격: 3000미네랄\n"
									+ "4. 돌아가기"
					  , sellMsg = "========판매할 유닛을 고르세요.========\n" 
									+ "1. ▼일반▼:    질럿   가격: 500미네랄\n"
									+ "2. ◆레어◆:  드라군   가격: 1000미네랄\n"
									+ "3. ◎에픽◎: 하이템플러    가격: 2000미네랄\n"
									+ "4. 돌아가기"
					  , upgradeMsg = "========= 행운의 업그레이드 =========\n"
								    + "업그레이드 비용은 개체마다 3마리가 필요합니다.\n"
								    + "1. ▼질럿▼3 -> ◆드라군◆1 (확률70%)\n"
									+ "2. ◆드라군◆3 -> ◎하이템플러1◎ (확률50%)\n"
									+ "3. ◎하이템플러◎3 -> ☆아칸☆1 (확률30%)\n"
									+ "4. 돌아가기"
					  , status = "=============== 각 개체수 =============\n"
									+ "▼일반▼:    질럿   개체수: " + zealot.unitCount+"\n"
								    + "◆레어◆:   드라군   개체수: " + dragoon.unitCount+"\n"
									+ "◎에픽◎:  하이템플러   개체수: " + highTempler.unitCount+"\n"
									+ "☆전설☆:   아칸   개체수: " + archon.unitCount+"\n";
					  
				System.out.println(msg);
				System.out.println(status);
				
				//유닛 구매 구현
				choice = sc.nextInt();
				switch (choice) {
				case 1: // 유닛 구매
					System.out.println(buyMsg);
						choice = sc.nextInt();
						switch (choice) {
						case 1: //질럿
							if (gamer1.buyUnit(zealot.buyPrice)) {
								zealot.unitCount++;
								gamer1.minerals -= zealot.buyPrice;
								System.out.println("질럿 1개체 구매\n");
							} else {
								System.out.println("미네랄이 모자랍니다.\n");
							}
							break;
						case 2: //드라군
							if (gamer1.buyUnit(dragoon.buyPrice)) {
								dragoon.unitCount++;
								gamer1.minerals -= dragoon.buyPrice;
								System.out.println("드라군 1개체 구매\n");
							} else {
								System.out.println("미네랄이 모자랍니다.\n");
							}
							break;
						case 3:
							if (gamer1.buyUnit(highTempler.buyPrice)) {
								highTempler.unitCount++;
								gamer1.minerals -= highTempler.buyPrice;
								System.out.println("하이템플러 1개체 구매\n");
							} else {
								System.out.println("미네랄이 모자랍니다.\n");
							}
							break;
						case 4:
							break;
	
						default:
							System.out.println("1~4만 입력하세요\n");
						}
						break;
				//유닛 판매 구현	
				case 2:
					System.out.println(sellMsg);
						choice = sc.nextInt();
						switch (choice) {
						case 1:
							if (zealot.sellUnit()) {
								zealot.unitCount--;
								gamer1.minerals += zealot.price;
								System.out.println("질럿 1개체 판매\n");
							} else {
								System.out.println("판매할 질럿이 없습니다.\n");
							}
							break;
						case 2:
							if (dragoon.sellUnit()) {
								dragoon.unitCount--;
								gamer1.minerals += dragoon.price;
								System.out.println("드라군 1개체 판매\n");
							} else {
								System.out.println("판매할 드라군이 없습니다.\n");
							}
							break;
						case 3:
							if (highTempler.sellUnit()) {
								highTempler.unitCount--;
								gamer1.minerals += highTempler.price;
								System.out.println("하이템플러 1개체 판매\n");
							} else {
								System.out.println("판매할 하이템플러가 없습니다.\n");
							}
							break;
						case 4:
							break;
							
						default:
							System.out.println("1~4만 입력하세요\n");
							break;
						}
						break;
				//유닛 업그레이드 구현
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
									System.out.println("업그레이드 성공! 드라군+1\n");
								}else {
									zealot.unitCount -= 3;
									System.out.println("업그레이드 실패!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("질럿 개체수가 모자랍니다.\n");
							}
							break;
						case 2:
							if(dragoon.unitUpgrade()) {
								if(dragoon.percentage()) {
									dragoon.unitCount -= 3;
									highTempler.unitCount++;
									gamer1.winCount++;
									firstHighTemplerCount++;
									System.out.println("업그레이드 성공! 하이템플러+1\n");
								}else {
									dragoon.unitCount -= 3;
									System.out.println("업그레이드 실패!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("드라군 개체수가 모자랍니다.\n");
							}
							break;
						case 3:
							if(highTempler.unitUpgrade()) {
								if(highTempler.percentage()) {
									highTempler.unitCount -= 3;
									archon.unitCount++;
									gamer1.winCount++;
									System.out.println("아칸 조합 성공\n");
								}else {
									highTempler.unitCount -= 3;
									System.out.println("업그레이드 실패!\n");
									gamer1.loseCount++;
									gamer1.winCount = 0;
								}
							}else {
								System.out.println("하이템플러 개체수가 모자랍니다.\n");
							}
							
							break;
	
						case 4:
							break;
	
						default:
							System.out.println("1~4만 입력하세요\n");
							break;
						}
						// 히든 미션 첫 에픽등급 조합 성공시 보상금 지급
						if(firstHighTemplerCount == 1) {
							firstHighTemplerCount++;
							gamer1.minerals += 10000;
							System.out.println("※첫 ◎에픽◎등급 조합에 성공하셨습니다. 보상금 5000미네랄을 지급합니다.\n");
						}
						// 연속 3번 업그레이드 성공시 보상금 지급
						if(gamer1.bonus()) {
							gamer1.minerals += 5000;
							gamer1.winCount = 0;
							System.out.println("※연속 3회 업그레이드에 성공하셨습니다. 보상금 3000미네랄을 지급합니다.\n");
						}
						// 마지막 업그레이드 성공으로부터 3회 실패할때마다 격려금 지급
						if(gamer1.encourage()) {
							gamer1.minerals += 3000;
							gamer1.loseCount = 0;
							System.out.println("※마지막 성공으로부터 3회 업그레이드를 실패하셨습니다. 격려금 2000미네랄을 지급합니다.\n");
						}
						break;
				//종료 구현	
				case 4:
					flag = true;
					break;
				default:
					break;
				}
				if(flag) {
					break;
				}
				//승리조건 구현
				if(archon.gamerWin()) {
					System.out.println("※축하드립니다. 최종 유닛인 아칸 획득에 성공하여 게임에서 승리하셨습니다.※");
					break;
				}
				//패배조건 구현
				if(zealot.unitCount < 3 && dragoon.unitCount < 3 && highTempler.unitCount < 3 && archon.unitCount < 3 && gamer1.minerals < 1000 ) {
					System.out.println("더 이상 업그레이드를 진행할 수 없습니다. 패배하셨습니다.");
					break;
				}
				
	
			}
		}
	}
}
