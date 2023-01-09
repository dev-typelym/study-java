package nike;

public class Building {
	public static void main(String[] args) {
		
		Nike jamSil = new Nike();
		
		jamSil.register(new Form() {
			
			@Override
			public void sellShoes(String select) {
				String[] shoes = getShoes();
				for (int i = 0; i < shoes.length; i++) {
					if(shoes[i].equals(select)) {
						System.out.println(select + " �ǸſϷ�");
					}
				}
			}
			
			@Override
			public String[] getShoes() {
				return new String[] {"��������", "����", "Ƽ����", "���"};
			}
		});
		
		Nike gangNam = new Nike();
		
		gangNam.register(new FormAdapter() {
			
			
			@Override
			public String[] getShoes() {
				return new String[] {"����Ŀ��"};
			}
		});
		
		
		
		
	}

}
