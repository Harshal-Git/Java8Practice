/**
 * 
 */
package com.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Harshal-Git
 *
 */
public class OptionalDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// get modems data
		List<Modem> modems = getModems();
		System.out.println("Total modems: "+modems.size());

		/*
		 * Discard modems out of the budget (less than 1000 & more than 1500)
		 */

		// imperative approach
		System.out.println("Imperative approach:");
		for(Modem mdm : modems) {
			if(priceIsInRange1(mdm)) {
				System.out.println(mdm.toString()+" is in range.");	
			}
		}

		System.out.println("\nDeclarative approach:");

		// declarative approach
		modems.stream().filter(OptionalDemo3 :: priceIsInRange2).forEach((mdm) -> System.out.println(mdm.toString() + " is in range."));
	}

	/**
	 * @return list of modems for demo
	 */
	private static List<Modem> getModems() {
		List<Modem> dataList = new ArrayList<>();
		dataList.add(new Modem(1050.0));
		dataList.add(new Modem(900.0));
		dataList.add(new Modem(null));
		dataList.add(new Modem(1502.5));
		dataList.add(new Modem(1499.5));
		dataList.add(null);
		return dataList;
	}

	/*
	 * price check method - without any Optional 
	 */
	public static boolean priceIsInRange1(Modem modem) {
		boolean isInRange = false;
		if (modem != null  && modem.getPrice() != null 
				&& (modem.getPrice() >= 1000.0 && modem.getPrice() <= 1500.0)) {
			isInRange = true;
		}
		return isInRange;
	}

	/*
	 * price check method - with Optional 
	 */
	public static boolean priceIsInRange2(Modem modem) {
		boolean isPresent= Optional.ofNullable(modem).				// will adjust if the modem object is NULL : similar to (modem != null)
										map(mdm -> mdm.getPrice()).		// map() to reduce the complexity in filter method
										filter(price -> price >= 1000.0).
										filter(price -> price <= 1500.0).
										isPresent();									// whether element is present in Optional object OR not
		return isPresent;
	}
}

class Modem {

	private Double price;

	/**
	 * parameterized constructor 
	 */
	public Modem(Double price) {
		setPrice(price);
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	private void setPrice(Double price) {
		this.price = price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Modem -> price = "+getPrice();
	}
}