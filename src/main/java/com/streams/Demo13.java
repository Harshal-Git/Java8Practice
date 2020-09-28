/**
 * 
 */
package com.streams;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @author Harshal-Git
 *
 *	-> additional reduce() operation with custom class
 */
public class Demo13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// prepare invoices and find total bill
		List<Invoice> invoices = Arrays.asList(
				new Invoice("A01", 10, BigDecimal.valueOf(100)),
				new Invoice("A02", 5, BigDecimal.valueOf(130)),
				new Invoice("A03", 9, BigDecimal.valueOf(50)));

		// total for each invoice
		invoices.stream().forEach(inv -> System.out.println(inv.toString()));

		// map function for each invoice 
		Function<Invoice, BigDecimal> invoiceFun = (inv) -> inv.getPrice().multiply(BigDecimal.valueOf(inv.getQuantity()));

		// reduce to find total
		BigDecimal totalBill= invoices.stream().map(invoiceFun).reduce((base, newValue) -> base.add(newValue)).get();
		System.out.println("Total bill: "+totalBill.doubleValue());
	}
}

class Invoice {

	private String invoiceNum;

	private int quantity;

	private BigDecimal price;

	/**
	 * @return the invoiceNum
	 */
	public String getInvoiceNum() {
		return invoiceNum;
	}

	/**
	 * @param invoiceNum the invoiceNum to set
	 */
	private void setInvoiceNum(String invoiceNum) {
		this.invoiceNum = invoiceNum;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	private void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	private void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * 
	 */
	public Invoice(String name, int quantity, BigDecimal price) {
		setInvoiceNum(name);
		setQuantity(quantity);
		setPrice(price);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getInvoiceNum()+" ==> "+"Qty: "+getQuantity()+" * Price: "+getPrice();
	}
}