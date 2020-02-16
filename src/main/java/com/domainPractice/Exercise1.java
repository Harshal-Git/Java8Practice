/**
 * 
 */
package com.domainPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Harshal-Git
 * -> Exercise1 of Chapter#3
 * 
 * 1. A function to add up numbers.
 * 2. A function that takes in artists and returns a list of strings with their names and places of origin.
 * 3. A function that takes in albums and returns a list of albums with at most three tracks.
 */
public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// function to add up numbers
		System.out.println("Sum of numbers: "+addUp(Arrays.asList(1, 3, 5, 7, 9, 2, 4, 6, 8, 10).stream()));
		
		// function to get artists names and origin 
		List<String> dataList= getArtistDataList(new ArrayList<Artist>());
		System.out.println("Artists data ->"+dataList);
		
		// function to get list of albums with at most 3 tracks
		List<Album> albumsList= getAlbumData(new ArrayList<Album>());
		System.out.println("Albums data ->"+albumsList);
	}

	
	private static List<Album> getAlbumData(List<Album> albums) {
		
		Predicate<Album> predicateAlbum= new Predicate<Album>() {

			@Override
			public boolean test(Album t) {
				if(t.getTracks().size() >= 3) {
					return true;
				}
				return false;
			}
		};
		return albums.stream().filter(predicateAlbum).collect(Collectors.toList());
	}

	/**
	 * A method that takes in artists and returns a list of strings with their names and places of origin.
	 * @param artists - artists
	 * @return list of strings including their names and origin
	 * [tricky question - had to visit example site]
	 */
	private static List<String> getArtistDataList(List<Artist> artists) {
		return artists.stream().flatMap(artist -> Stream.of(artist.getName(), artist.getOrigin())).
				collect(Collectors.toList());
	}

	/**
	 * add up numbers.
	 * @param numbers list
	 * @return total 
	 */
	public static int addUp(Stream<Integer> numbers) {
		/*BinaryOperator<Integer> addFunction= new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				return (t+u);
			}
		};*/
		return numbers.reduce(0, (num1, num2) -> num1+num2);
	}
}
