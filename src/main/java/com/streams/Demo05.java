/**
 * 
 */
package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Harshal-Git
 *
 *	-> forEach() defined in java.lang.Iterable (used by collection classes) accepts "Consumer" functional interface
 *
 *	-> forEach() does not have any definition inside java.util.Stream. So classes implementing Stream will have to provide the implementation by 
 *		providing Consumer type functional interface as an argument.  
 */
public class Demo05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// use forEach() to iterate over a list
		List<String> games = new ArrayList<>(); 
		
		// put data
		games.add("Chess");games.add("Football");games.add("Hocky");games.add("Cricket");  
        
        
        System.out.println("Games: with Consumer interface");
        // Consumer to print a string
        Consumer<String> printConsumer1= (data) -> System.out.println(data);
        // apply consumer on given collection
        games.forEach(printConsumer1);
        
        System.out.println("Games: with method reference operator");
        // Consumer to print a string
        Consumer<String> printConsumer2= System.out :: println;
        // apply method reference
        games.forEach(printConsumer2);
        
        /*
         * to print the data in the order it is encountered in stream
         */
        System.out.println("Games: with forEach ordered");
        // Consumer to print a string
        Consumer<String> printConsumer3= System.out :: println;
        // apply method reference
        games.stream().forEachOrdered(printConsumer3);
	}
}
