/**
 * 
 */
package com.streams;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 *
 *	-> demo of File processing
 */
public class Demo12 {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws URISyntaxException 
	 */
	public static void main(String[] args) throws IOException, URISyntaxException {

		// 1. Stream rows from text file, sort, filter, and print
		Stream<String> bands = Files.lines(Paths.get("bands.txt"));
		bands.sorted().filter(x -> x.length() > 13).
					forEach(System.out :: println);
		bands.close();
		System.out.println();

		// 2. Stream rows from text file, filter with specific name and save to List
		List<String> bands2 = Files.lines(Paths.get("bands.txt")).
											filter(x -> x.contains("jit")).		// filter data - containing "jit"
												collect(Collectors.toList());
		bands2.forEach(System.out :: println);
		System.out.println();
		
		// 3. Stream rows from CSV file and count tokens with specific format / length where data is present
		Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
		int rowCount = (int) rows1.map(x -> x.split(",")).					// returns String [] of each line 
											filter(x -> x.length >= 3).					// [] of length >= 3 only (valid rows)
												count();										// count such data
		System.out.println(rowCount + " rows."+"\n");
		rows1.close();
		
		// 4. Stream rows from CSV file, parse data from rows
		Stream<String> rows2 = Files.lines(Paths.get("data.txt"));
		rows2.map(x -> x.split(",")).
            		filter(x -> x.length >= 3).
            			filter(x -> Integer.parseInt(x[1]) > 15).												// filter such elements for which second column data > 15 
            				forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));	// print the rows in split format
		rows2.close();
		System.out.println();
		
		// 5. Stream rows from CSV file, store fields in HashMap
		Stream<String> rows3 = Files.lines(Paths.get("data.txt"));
		Map<String, Integer> map = new HashMap<>();
		map = rows3.map(x -> x.split(",")).
						filter(x -> x.length == 3).
							filter(x -> Integer.parseInt(x[1]) > 15).
								collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));		// prepare a Map where 
																																	// Key : first column / Value : second column
		rows3.close();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "  " + entry.getValue().intValue());
		}
	}
}
