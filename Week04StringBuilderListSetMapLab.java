package week04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week04StringBuilderListSetMapLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Why would we use a StringBuilder instead of a String?
		
		//You can modify the string with the StringBuilder, whereas the string is immutable. 
		//This will save a lot of space in memory, given that every time you "change" the content of
		//a string you're actually creating a new one, but not editing it.
		
				// 		a. Instantiate a new StringBuilder
				//		b. Append the characters 0 through 9 to it separated by dashes
				// 				Note:  make sure no dash appears at the end of the StringBuilder
		System.out.println("Exercise 1");
		System.out.println("String made with StringBuilder by appending characters 0 to 9 separated by dashes");
				
		StringBuilder numbers = new StringBuilder();
		
		numbers.append("0");
		
		for (int i = 1; i <10; i++) {
			numbers.append("-" + i);
		}
		
		System.out.println(numbers.toString());
		System.out.println("------------------------------------------");	
				
				// 2. List of String:
				//		a. Create a list of Strings 
				//		b. Add 5 Strings to it, each with a different length
		
		System.out.println("Exercise 2");
		System.out.println("Create a list of Strings and add 5 strings to it, each with a different length");
		
		List<String> fiveS = new ArrayList<String>(); 
		
		fiveS.add("Patience");
		fiveS.add("Perseverance");
		fiveS.add("Love");
		fiveS.add("Knowledge");
		fiveS.add("Bright");
		
		for (String word : fiveS) {
				
			System.out.println(word);
		}
		System.out.println("------------------------------------------");	
				
				// 3. Write and test a method that takes a list of strings 
				//			and returns the shortest string
		
		System.out.println("Exercise 3");
		System.out.println("Method that takes a list of string and returns shortest string");
		
		//fiveS.add("I");
		System.out.println(shortString(fiveS)); 
		
		System.out.println("------------------------------------------");	
				// 4. Write and test a method that takes a list of strings 
				//			and returns the list with the first and last element switched
		
		System.out.println("Exercise 4");
		System.out.println("Method that takes a list of strings and returns a list with first and last element switched.");
		
		List <String> switchList = new ArrayList<String>(elemSwitch (fiveS)); 
		
		for (String elem : switchList) {
			System.out.println(elem);
		}
		
		System.out.println("------------------------------------------");		
		
		
				// 5. Write and test a method that takes a list of strings 
				//			and returns a string with all the list elements concatenated to each other,
				// 			separated by a comma
		
		System.out.println("Exercise 5");
		System.out.println("Method that returns a string with all the elements of a list separated by a comma.");
		
		String ConcatenateElem = elemConcat(fiveS);

		System.out.println(ConcatenateElem);
		
		
		
		System.out.println("------------------------------------------");	
				
				// 6. Write and test a method that takes a list of strings and a string 
				//			and returns a new list with all strings from the original list
				// 			containing the second string parameter (i.e. like a search method)

		System.out.println("Exercise 6");
		System.out.println("Method that takes a list and a string and returns it with all the strings from the original"
				 + " list containing the provided string as the second parameter");
		
		List<String> extraList = new ArrayList <String>(addToList(fiveS, "is Good"));
		
		for (String elem : extraList) {
			System.out.println(elem);
		}
		
		
		System.out.println("------------------------------------------");
		
				// 7. Write and test a method that takes a list of integers 
				//			and returns a List<List<Integer>> with the following conditions specified
				//			for the return value:
				//		a. The first List in the returned value contains any number from the input list 
				//			that is divisible by 2
				//		b. The second List contains values from the input list that are divisible by 3
				//		c. The third containing values divisible by 5, and 
				//		d. The fourth all numbers from the input List not divisible by 2, 3, or 5
		System.out.println("Exercise 7");
		System.out.println("Method that returns a list of lists with numbers sorted by what they're divisible by.");
				
		List<Integer> intNums = new ArrayList <Integer> (){{ add(43); add(42); add(67); add(36); add(27); add(14);
		add(8); add(22); add(81); add(97); add(96); add(79); add(40); add(18); add(90);}};
		
		List<List<Integer>> sortedNums = new ArrayList <List<Integer>> (isDivisible(intNums));
		
		System.out.println(sortedNums);
		
		
		
		System.out.println("------------------------------------------");
		
				// 8. Write and test a method that takes a list of strings 
				//			and returns a list of integers that contains the length of each string

		System.out.println("Exercise 8");
		System.out.println("Method that returns a list of integers with the lenght of each string in a list.");
		
		List<Integer> howLong = new ArrayList <Integer>(stringLen(fiveS));

		System.out.println(howLong);
		
		
		System.out.println("------------------------------------------");

				
				// 9. Create a set of strings and add 5 values
		System.out.println("Exercise 9");
		System.out.println("Set of strings");
		
		Set<String> slayDay = new HashSet<String>();
		
		slayDay.add("Pink");
		slayDay.add("Pencil");
		slayDay.add("Gopi");
		slayDay.add("Dance");
		slayDay.add("Daughter");
		
		System.out.println(slayDay);
		
		
		System.out.println("------------------------------------------");
				
				// 10. Write and test a method that takes a set of strings and a character 
				//			and returns a set of strings consisting of all the strings in the
				// 			input set that start with the character parameter.

		System.out.println("Exercise 10");
		System.out.println("Method that retuns the strings that start with the same character");
		
		Set<String> sameLetter = new HashSet <String> (firstLetter(slayDay, 'P'));
		Set<String> dLetter = new HashSet <String> (firstLetter(slayDay, 'D'));
		Set<String> gLetter = new HashSet <String> (firstLetter(slayDay, 'G'));
		
		System.out.println(sameLetter);
		System.out.println(dLetter);
		System.out.println(gLetter);
		
		
		
		System.out.println("------------------------------------------");	
		
				// 11. Write and test a method that takes a set of strings 
				//			and returns a list of the same strings
			
		System.out.println("Exercise 11");	
		System.out.println("Method that takes a set of strings and returns a list of the same strings");
		
		List <String> newList = new ArrayList <String> (toList(slayDay));
		
		System.out.println(newList);
		
		
		System.out.println("------------------------------------------");	

				// 12. Write and test a method that takes a set of integers 
				//			and returns a new set of integers containing only even numbers 
				//			from the original set
		
		System.out.println("Exercise 12");
		System.out.println("Method that returns a set with only even numbers.");

		Set <Integer> intSet = new HashSet <Integer>();
		
		for (int num : intNums) {
			intSet.add(num);
		}
		
		System.out.println(evenNums(intSet));

		System.out.println("------------------------------------------");			
				// 13. Create a map of string and string and add 3 items to it where the key of each
				// 			is a word and the value is the definition of the word
		
		System.out.println("Exercise 13");
		System.out.println("Create a map of strings with three items with a word for a key and its definition as a value.");

		Map <String, String> wordDict = new HashMap <String, String> ();
		
		wordDict.put("System", "A set of things working together as parts of a mechanism or an interconnecting network.");
		wordDict.put("Art", "The expression or application of human creative skill and imagination.");
		wordDict.put("Importance", "The state or fact of being of great significance or value.");
		
		
		System.out.println(wordDict);

			
		System.out.println("------------------------------------------");	
				// 14. Write and test a method that takes a Map<String, String> and a string 
				// 			and returns the value for a key in the map that matches the
				// 			string parameter (i.e. like a language dictionary lookup)
		System.out.println("Exercise 14");
		System.out.println("Testing my method that takes a map and a string and returns the value for the key in the map that matches said string.");
		
		System.out.println(getDict(wordDict, "Art"));
		System.out.println(getDict(wordDict, "Java"));
		
		
		System.out.println("------------------------------------------");	
		
				// 15. Write and test a method that takes a List<String> 
				//			and returns a Map<Character, Integer> containing a count of 
				//			all the strings that start with a given character
				
		System.out.println("Exercise 15");
		System.out.println();
		
		Map <Character, Integer> charMap = new HashMap <Character, Integer>(charCount(fiveS, 'P'));
		Map <Character, Integer> charMap2 = new HashMap <Character, Integer>(charCount(fiveS, 'S'));
		
		System.out.println(charMap);
		System.out.println(charMap2);
		
		System.out.println("------------------------------------------");
			}
			
			
			// Method 15:
	
	public static Map<Character, Integer> charCount (List<String> strList, char x) {
		Map <Character, Integer> charCount = new HashMap<Character, Integer>();
		
		Integer count = 0;
		
		for (String word : strList) {
			if (word.charAt(0) == x) {
				count ++;
			}
		}
		
		charCount.put(x, count);
		
		return charCount;
		
	}
		
			
			// Method 14:
	
	public static String getDict (Map <String, String> dict, String word) {
		
		String strDef = "Word not found in the dictionary";
		
		for (String elem : dict.keySet()) {
			if (elem.equals(word)) {
				strDef = dict.get(word);
			} 
		}
		
		return strDef;
	}
	
	
			// Method 12:
	
	public static Set<Integer> evenNums (Set<Integer> nums) {
		
		Set<Integer> evenInts = new HashSet<Integer> ();
		
		for (int num : nums) {
			if (num % 2 == 0) {
				evenInts.add(num);
			}
		}
		
		return evenInts;
		
	}
			
			// Method 11:
	
	public static List<String> toList (Set<String> words){
		List<String> wordList = new ArrayList <String> ();
		for (String word : words) {
			wordList.add(word);
		}
		
		return wordList;
	}
		

			// Method 10:
	
	public static Set<String> firstLetter (Set<String> words, char x) {
		
		String s = String.valueOf(x);
		Set<String> newSet = new HashSet <String> (); 
		
		for (String word : words) {
			if (word.contains(s) && word.indexOf(s)==0) {
				newSet.add(word);
				
			}
		}
		
		return newSet;
		
		
	}
	
		
			// Method 8:
	
	public static List<Integer> stringLen(List<String> words) {
		List<Integer> lenStrings = new ArrayList <Integer>(); 
		
		for (String elem : words) {
			lenStrings.add(elem.length());
		}
		
		return lenStrings;
		
	}
			
			// Method 7:
	
	public static List<List<Integer>> isDivisible (List<Integer> intList) {
		
		List<List<Integer>> divisibleNum = new ArrayList <List<Integer>>();
		List<Integer> divisibleByTwo = new ArrayList <Integer>();
		List<Integer> divisibleByThree = new ArrayList <Integer>();
		List<Integer> divisibleByFive = new ArrayList <Integer>();
		List<Integer> notDivisible = new ArrayList <Integer>();
		
		for (int num : intList) {
			if (num % 2 ==0) {
				divisibleByTwo.add(num);
			}
			if (num % 3 ==0) {
				divisibleByThree.add(num);
			}
			if (num % 5 == 0) {
				divisibleByFive.add(num);
			}
			
			if (num % 2 != 0 && num % 3 != 0 && num % 5 != 0) {
				notDivisible.add(num);
			}
			
		}
		
		divisibleNum.add(divisibleByTwo);
		divisibleNum.add(divisibleByThree);
		divisibleNum.add(divisibleByFive);
		divisibleNum.add(notDivisible);
		
		return divisibleNum;
	}
	
	
			// Method 6:
	
			public static List<String> addToList (List<String> stringList, String newString) {
			
				List<String> newList = new ArrayList <String>();
				
				for (String elem : stringList) {
					newList.add(elem + " " + newString);
				}
				
				return newList;
			
			}
			
			// Method 5:
			
		public static String elemConcat (List<String> stringList) {
				StringBuilder listElems = new StringBuilder();
				
				for (String word : stringList) {
					if (stringList.indexOf(word) == stringList.size()-1) {
						listElems.append(word);
					} else {			
					
						listElems.append(word);
						listElems.append(", ");
					}
				}
				String stringConcat = listElems.toString();
				return stringConcat;
			}
	
			
			// Method 4:
	
		public static List<String> elemSwitch (List<String> stringList) {
			
			List<String> switchString = new ArrayList <String>();
			
			switchString.add(stringList.get(stringList.size()-1));
			
			for (int i = 1; i < stringList.size()-1; i++) {
				switchString.add(stringList.get(i));
			}
			
			switchString.add(stringList.get(0));
			
			return switchString;
			
		}
			
			// Method 3:
	
		public static String shortString(List<String> listStrings) {
			
			int stringLen = listStrings.get(listStrings.size() - 1).length();
			
			int sIndex = listStrings.size()-1;
			
			String shortest = listStrings.get(0);
			
			for (int i = 0; i< listStrings.size(); i++) {
				
				if (listStrings.get(i).length() < stringLen) {
					
					stringLen = listStrings.get(i).length();
					sIndex = i;
				}
				
			}
			
			return listStrings.get(sIndex);
			
		}
			
		}
