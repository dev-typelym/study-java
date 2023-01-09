package markerInterface;

public class Lab {
	public void checkKinds(Animal[] animal) {
		for (int i = 0; i < animal.length; i++) {
			if(animal[i] instanceof CarnivoreMarker) {
				System.out.println("육식동물");
			}else if(animal[i] instanceof HerbivoreMarker) {
				System.out.println("초식동물");
			}else {
				System.out.println("잡식성 동물");
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
