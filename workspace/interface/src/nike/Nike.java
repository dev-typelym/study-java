package nike;

public class Nike {
	public void register(Form form) {
		String[] shoes = form.getShoes();
		for (int i = 0; i < shoes.length; i++) {
			System.out.println(shoes[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("무료나눔입니다.");
			return;
		}
		
		form.sellShoes("에어포스");
		
	}
}
