package main;

public class Test001 {
	
	Customer customer1 = new Customer("Sam", "STANDARD", "Dubai", "proof001");
	Insurance insurance1 = new Insurance(123);
	
	Customer customer2 = new Customer("Peter", "BASIC","Dubai", "proof002");
	Insurance insurance2 = new Insurance(456);

	Customer customer3 = new Customer("Jill", "STANDARD", "Sharjah", "proof003");
	Insurance insurance3 = new Insurance(789);
	
	Customer customer4 = new Customer("John", "PRO", "RAK", "proof004");
	Insurance insurance4 = new Insurance(1011);
	
	Customer customer5 = new Customer("Robert", "ULTIMATE", "Sharjah", "proof005");
	Insurance insurance5 = new Insurance(1213);
	
	private Bsnl bsnl = new  Bsnl ();
	
	public Test001()
	{
		bsnl.add(insurance1, customer1);
		bsnl.add(insurance2, customer2);
		bsnl.add(insurance3, customer3);
		bsnl.add(insurance4, customer4);
		bsnl.add(insurance5, customer5);
		
		bsnl.showAllInsurerDetails();
	}
	
	public static void main(String[] args) {
		new Test001();
	}
}
