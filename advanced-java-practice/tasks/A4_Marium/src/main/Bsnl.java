package main;

import java.security.KeyPair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

public class Bsnl {
	private Map<Insurance, Customer> BSNLMap;

	public Bsnl() {
		BSNLMap = new HashMap<>(10);
	}

	/**
	 * print all the the insurers's details to the console
	 */
	public void showAllInsurerDetails() {
		Set<Entry<Insurance, Customer>> s = BSNLMap.entrySet();
		Iterator<Entry<Insurance, Customer>> itr = s.iterator();
		while (itr.hasNext()) {
			Map.Entry<Insurance, Customer> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	/**
	 * get the bsnl hash map
	 * 
	 * @return bsnl Hash map
	 */

	public Map<Insurance, Customer> getBSNLMap() {
		return BSNLMap;
	}

	/**
	 * delegate the put method of the HashMap to put new entries into it
	 * 
	 * @param insurance the key
	 * @param customer  the value
	 * @return the inserted value
	 */
	public Customer add(Insurance insurance, Customer customer) {
		return BSNLMap.put(insurance, customer);
	}

	// getRemind method to remind the customers for renewal
	public List<Entry<Insurance, Customer>> getRemind(Month month) {
		List<Entry<Insurance, Customer>> customers = BSNLMap.entrySet().stream().filter((entry) -> {
			Insurance insurance = entry.getKey();
			Customer customer = entry.getValue();
			return customer.getExpiresEndMonth().compareTo(month) == 0;
		}).collect(Collectors.toList());
		return customers;

	}

}
