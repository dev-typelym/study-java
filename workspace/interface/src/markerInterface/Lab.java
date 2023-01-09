package markerInterface;

public class Lab {
	public void checkKinds(Animal[] animal) {
		for (int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof CarnivoreMarker) {
				System.out.println("���ĵ���");
			}else if(animal[i] instanceof HerbivoreMarker) {
				System.out.println("�ʽĵ���");
			}else {
				System.out.println("��ļ� ����");
			}
		}
	}
	
	public static void main(String[] args) {
		Animal[] animals = {
				new Bear(),
				new Tiger(),
				new Dog(),
				new Cow()
		};
		
		new Lab().checkKinds(animals);
	}
}
