/**
 * 
 */
package com.referenceOperatorDemo;

/**
 * @author Harshal-Git
 * -> implementation of this class is a bit complex... need to understand that part.
 */
public class ProducerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ProducerDemo().run();
	}

	private void run() {
		displayString(this :: toString);
	}
	
	private void displayString(StringProducer producer) {
		System.out.print(producer.produce());
	}
}
