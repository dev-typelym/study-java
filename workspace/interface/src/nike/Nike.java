package nike;

public class Nike {
	public void register(Form form) {
		String[] shoes = form.getShoes();
		for (int i = 0; i < shoes.length; i++) {
			System.out.println(shoes[i]);
		}
		
		if(form instanceof FormAdapter) {
			System.out.println("���ᳪ���Դϴ�.");
			return;
		}
		
		form.sellShoes("��������");
		
	}
}
