package main;

import java.util.List;
import java.util.Map.Entry;

public class Test002 {
	Customer customer1 = new Customer("Sam", "STANDARD", "Dubai", "proof001", Month.AUGUST);
	Insurance insurance1 = new Insurance(123);

	Customer customer2 = new Customer("Peter", "BASIC", "Dubai", "proof002", Month.DECEMBER);
	Insurance insurance2 = new Insurance(456);

	Customer customer3 = new Customer("Jill", "STANDARD", "Sharjah", "proof003", Month.SEPTEMBER);
	Insurance insurance3 = new Insurance(789);

	Customer customer4 = new Customer("John", "PRO", "RAK", "proof004", Month.MAY);
	Insurance insurance4 = new Insurance(1011);

	Customer customer5 = new Customer("Robert", "ULTIMATE", "Sharjah", "proof005", Month.MAY);
	Insurance insurance5 = new Insurance(1213);

	private Bsnl bsnl = new Bsnl();

	public Test002() {
		bsnl.add(insurance1, customer1);
		bsnl.add(insurance2, customer2);
		bsnl.add(insurance3, customer3);
		bsnl.add(insurance4, customer4);
		bsnl.add(insurance5, customer5);

		List<Entry<Insurance, Customer>> customers = bsnl.getRemind(Month.MAY);
		customers.forEach(this::sendSMS);
	}

	public void sendSMS(Entry<Insurance, Customer> entry) {
		StringBuilder builder = new StringBuilder();
		builder.append("SMS: Our dearest customer ").append(entry.getValue().getCustomername())
				.append("\n ID proof number: ").append(entry.getValue().getId_proof())
				.append("\nThis message is to inform you that the following registered insurance number ")
				.append(entry.getKey().getInsuranceNo())
				.append("\nneeds renewal at the end of the month. The insurance will be expired in case of failure of renewal\r\n");
		System.out.println(builder.toString());
	}
	
	public static void main(String[] args) {
		new Test002();
	}

}
