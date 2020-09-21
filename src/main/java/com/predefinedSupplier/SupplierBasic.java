/**
 * 
 */
package com.predefinedSupplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Harshal-Git
 * 
 *	-> basic supplier concept 
 */
public class SupplierBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// supply date
		Supplier<Date> dateSupplier = () -> new Date();
		// print data
		System.out.println("Date from supplier: "+dateSupplier.get());
		
		// supplier for random OTP
		Supplier<String> otpSupplier = () -> {
			StringBuilder otp = new StringBuilder();
			for(int index = 1; index <= 6; index++) {
				otp.append((int) (Math.random()*10));
			}
			return otp.toString();
		};
		
		// print data
		System.out.println("OTP 1 from supplier: "+otpSupplier.get());
		System.out.println("OTP 2 from supplier: "+otpSupplier.get());
		System.out.println("OTP 3 from supplier: "+otpSupplier.get());
		System.out.println("OTP 4 from supplier: "+otpSupplier.get());
	}
}
