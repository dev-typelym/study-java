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
						System.out.println(select + " 판매완료");
					}
				}
			}
			
			@Override
			public String[] getShoes() {
				return new String[] {"에어포스", "조던", "티셔츠", "운동복"};
			}
		});
		
		Nike gangNam = new Nike();
		
		gangNam.register(new FormAdapter() {
			
			
			@Override
			public String[] getShoes() {
				return new String[] {"스니커즈"};
			}
		});
		
		
		
		
	}

}
