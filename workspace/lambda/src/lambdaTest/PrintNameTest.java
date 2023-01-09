package lambdaTest;

public class PrintNameTest {
	
	public void PrintFullName(PrintName printName) {
		System.out.println(printName.getFullName("юс", "югец"));
		
	};
	
	
	public static void main(String[] args) {
		PrintNameTest printnametest = new PrintNameTest();
//		printnametest.PrintFullName(new PrintName() {
//			@Override
//			public String getFullName(String firstName, String lastName) {
//				return firstName + lastName;
//			}
//		});
		printnametest.PrintFullName((firstName, lastName) -> firstName + lastName);
		

	}
}
