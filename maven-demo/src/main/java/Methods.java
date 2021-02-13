import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Methods {

	// Displaying a duplicate which is not a duplicate in an array or un paired
	// element

	public Integer sample(int sampleArray[]) {

		if (sampleArray.length % 2 != 0) {
			Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
			for (int a : sampleArray) {
				// store arr in hash map
				if (!hm.containsKey(a)) {
					hm.put(a, 1);
				} else {
					hm.put((a), hm.get(a) + 1);
				}
			}
			// print key whose value is 1
			for (Entry<Integer, Integer> entry : hm.entrySet()) {
				if (entry.getValue() == 1) {
					System.out.println("this is the unpaired element " + entry.getKey());
				}

			}
		}

		return 0;
	}
//max consecutive binary 1's
	public void binaryGap(int a) {
		if (a == 1) {

		}


		// 1. convert decimal to binary
		//String abc = a;
		char ab [] = Integer.toBinaryString(a).toCharArray();  // converting string to char array

		int tempGap = 0;
		int finalGap =0;		
		// 2. iterarte over one by one 
		//1000100101
		for (int d=0;d<ab.length;d++) {

			if (ab[d]=='1') {
				tempGap++;
				continue;
			}
			else if (ab[d]=='0') {
				if (tempGap>finalGap) {
					finalGap=tempGap;
					tempGap=0;
				}
			}
		}

		System.out.println("This is a final gap " +finalGap);;



	}


	public char test1 (String s) {

		// i/p is a3b4c5 o/p aaabbbbccccc

		if (s == null) {
			return ' ';
		}
		char anu = '\0';

		// a3b5c7v8b9n2m5v4m9x2ff
		//a3b2dd
		for (int i=1;i<=s.length();i=i+2) {

			char temp = s.charAt(i-1);
			try {
				int num = Integer.parseInt(String.valueOf(s.charAt(i)));   // d		
				if (num==(int)num) {

					for (int a = 1; a<=num;a++) {
						temp=anu;
						anu= (char) (anu + temp);
						System.out.println("abc  " +anu);

					}
				}
				return anu;
			}
			catch (Exception e){

				System.out.println(" Invalid string");
			}

			// else {
			//	System.out.println("Invalid string");
			//}
		}
		return ' ';
		//catch (NumberFormatException nfe) {
		//System.out.println(" Exception in try block");
		//}



	}

	public int[] twoSum(int[] nums, int target) {
		int[] abc = new int[2];
		if (nums.length >= 2 && nums.length <=1000 && target >= Math.pow(-10,9) && target<=Math.pow(10,9)){

			for (int i = 0; i< nums.length-1;i++) {  

				for (int j = i+1; j < nums.length; j++){
					if (nums[i] >= Math.pow(-10,9) && nums [i] <=Math.pow(10,9)){
						if (nums[i] + nums [j]==target){
							for (int f = 0;f<=abc.length;f++) {

								abc[f]=i;
								abc[f+1]=j;
								break;								
							}

						}
					}
				}
			}			
		}
		//int y =nums.length;
		return abc;
	}

	// 5;3,3,9,7,5

	public void duplicateNumber (int arr[] ) {


		Map <Integer,Integer> ab = new HashMap <Integer,Integer>();

		for (int i=0; i<arr.length;i++) {

			if (!ab.containsKey(arr[i])) {

				ab.put(arr[i], 1);
			}

			else {
				ab.put((arr[i]), ab.get(arr[i])+1);
			}
		}

		for (Map.Entry abc : ab.entrySet()){

			Integer key = (Integer) abc.getKey();

			Integer value = (Integer) abc.getValue();

			System.out.println("key and value is " +key+ " value " + value);

		}

	}

	public void duplicateString (String arr[] ) {


		Map <String,Integer> ab = new HashMap <String,Integer>();

		for (int i=0; i<arr.length;i++) {

			if (!ab.containsKey(arr[i])) {

				ab.put(arr[i], 1);
			}

			else {
				ab.put((arr[i]), ab.get(arr[i])+1);
			}
		}

		for (Map.Entry abc : ab.entrySet()){

			String key = (String) abc.getKey();

			Integer value = (Integer) abc.getValue();

			System.out.println("key and value is " +key+ " value " + value);

		}

	}

	//// 5;3,3,9,7,5 
	// o/p: 3
	public void duplicateNumberString (String str ) {

		char abe [] =str.toCharArray();

		Map <Character,Integer> ab = new HashMap <Character,Integer>();

		for (int i=2; i<abe.length;i++) {

			if (!ab.containsKey(abe[i])) {

				ab.put(abe[i], 1);
				i++;
			}

			else {
				ab.put((abe[i]), ab.get(abe[i])+1);
				i++;
			}
		}

		for (Map.Entry abc : ab.entrySet()){

			Character key = (Character) abc.getKey();

			Integer value = (Integer) abc.getValue();

			System.out.println("key and value is " +key+ " value " + value);

		}

	}

	//public void duplicateNumberString(String str1) {
	// TODO Auto-generated method stub

	public void duplicateNumberStringBuffer (StringBuffer str ) {

		//char abe [] =str.toCharArray();

		Map <Character,Integer> ab = new HashMap <Character,Integer>();

		for (int i=2; i<str.length();i++) {

			if (!ab.containsKey(str.charAt(i))) {

				ab.put(str.charAt(i), 1);
				i++;
			}

			else {
				ab.put(str.charAt(i), ab.get(str.charAt(i))+1);
				i++;
			}
		}

		for (Map.Entry abc : ab.entrySet()){

			Character key = (Character) abc.getKey();

			Integer value = (Integer) abc.getValue();

			System.out.println("key and value is " +key+ " value " + value);

		}

	}

	//  1133334444666677777
	// o/p : 2 1 4 3 4 4 4 6 5 7
	public void duplicateStringBufferWithoneThretwoOne (StringBuffer str ) {

		//char abe [] =str.toCharArray();

		Map <Character,Integer> ab = new HashMap <Character,Integer>();

		for (int i=0; i<str.length();i++) {

			if (!ab.containsKey(str.charAt(i))) {

				ab.put(str.charAt(i), 1);

			}

			else {
				ab.put(str.charAt(i), ab.get(str.charAt(i))+1);

			}
		}

		for (Map.Entry abc : ab.entrySet()){

			Character key = (Character) abc.getKey();

			Integer value = (Integer) abc.getValue();

			System.out.print(value + " " + key +" ");

		}

	}
	// i/p 4,5,6,5,4,3

	// o/p 3,6,4,4,5,5

	public void duplicateStringBufferWithoneThretwoOneSort (int[] abcd ) {

		//char abe [] =str.toCharArray();

		//int sampleArray [] = new int  [abcd.size()];

		Map <Integer,Integer> ab = new HashMap <Integer,Integer>();

		for (int i=0; i<abcd.length;i++) {

			if (!ab.containsKey(abcd[i])) {

				ab.put(abcd[i], 1);

			}

			else {
				ab.put(abcd[i], ab.get(abcd[i])+1);

			}
		}

		List<Map.Entry<Integer,Integer>> ss = new ArrayList<>(ab.entrySet());

		Collections.sort(ss, new Comparator <Map.Entry<Integer,Integer>>(){

			public int compare (Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2) {
				if (e1.getValue()!=e2.getValue()) {
					return e1.getValue()-e2.getValue();
				}

				return e1.getKey() - e2.getKey();
			}
		}); 



		for (Map.Entry abc : ss){		

			Integer key = (Integer) abc.getKey();

			Integer value = (Integer) abc.getValue();

			//System.out.print(key + "** " + value +" ");
			///4,5,6,5,4,3,5,3,2,7,9
			if (value ==1) {
				System.out.print(key);
			}

			else {

				for (int i = 0; i<value;i++) {
					System.out.print(key);
				}
			}

		}

	}

	public void duplicateStringBufferWithoneThretwoOneSortFunction (int[] abcd ) {

		//char abe [] =str.toCharArray();

		//int sampleArray [] = new int  [abcd.size()];/// https://mkyong.com/java/how-to-sort-a-map-in-java/

		Map <Integer,Integer> ab = new HashMap <Integer,Integer>();

		for (int i=0; i<abcd.length;i++) {

			if (!ab.containsKey(abcd[i])) {

				ab.put(abcd[i], 1);

			}

			else {
				ab.put(abcd[i], ab.get(abcd[i])+1);

			}
		}
		/// https://www.journaldev.com/780/comparable-and-comparator-in-java-example

		Comparator<Map.Entry<Integer, Integer>> valueComparator = new Comparator<Map.Entry<Integer,Integer>>() {
			@Override public int compare (Map.Entry<Integer,Integer> e1,Map.Entry<Integer,Integer> e2) {
				if (e1.getValue()!=e2.getValue()) {   // if values are not equal
					return e1.getValue()-e2.getValue();   
				}

				return e1.getKey() - e2.getKey();   // is values are equal
			}
		};

		List<Map.Entry<Integer,Integer>> ss = new ArrayList<>(ab.entrySet());

		Collections.sort(ss, valueComparator);	

		System.out.print("[");
		for (Map.Entry abc : ss){		

			Integer key = (Integer) abc.getKey();

			Integer value = (Integer) abc.getValue();

			//System.out.print(key + "** " + value +" ");
			///4,5,6,5,4,3,5,3,2,7,9

			if (value ==1) {
				System.out.print(key+ " ");
			}

			else {

				for (int i = 0; i<value;i++) {
					System.out.print(key+ " ");
				}
			}


		}
		System.out.print("]");

	}
	//aabcgesghkdh
	//o/p length of abcges

	public int longestConsecString (String ab ) {
		
		char[] ad= ab.toCharArray(); 
		int i =0 ;
		int j = 0;
		int max1 =0;
		Set<Character> abc = new HashSet<Character> ();

		while (i<ad.length && j<ad.length) {
			if (!abc.contains(ad[j])) {
				abc.add(ad[j]);
				j++;
			    max1 = 	Math.max(max1,j-i );				
			}
			else {
				abc.remove(ad[i]);
				i++;
			}
		}		
	   return max1;
	}
	
	
	//i/p 121 
	// o/p pallindrom
	public void palindromNumber(int num) {
		
		int a;
				int sum =0;
				int temp = num;
						
		while(num>0) {
			
			a = num%10;
			sum = sum*10+a;
			num = num/10;
			
		}
		if (sum==temp) {			
			System.out.println("Number is palindrome number");
			
		}
		else {
			System.out.println("Number is not a palinfrom number");
		}
		
	}
	
	public void sortingByValue(int [] abcd) {
		
       Map<Integer,Integer> demo = 	new HashMap<Integer,Integer>();
       
       for (int i=0; i<abcd.length;i++) {
       if (!demo.containsKey(abcd[i])) {
    	   demo.put(abcd[i], 1);
       }
       else {
    	   
    	   demo.put(abcd[i],demo.get(abcd[i])+1);
       }
       }
       
       Comparator<Map.Entry<Integer, Integer>> compar = new Comparator<Map.Entry<Integer, Integer>>(){

		@Override
		public int compare(Entry<Integer, Integer> a1, Entry<Integer, Integer> a2) {
			// TODO Auto-generated method stub
			if (!(a1.getValue()==a2.getValue())) {
				
				return a2.getValue()-a1.getValue();
			}
			return 0;	
		}
    	   
       };
       
       
       List<Map.Entry<Integer, Integer>> list = new ArrayList<>(demo.entrySet());
       
       Collections.sort(list, compar);
       
       for (Map.Entry<Integer, Integer> adf : list ) {
    	   
    	   Integer keys = (Integer)adf.getKey();
    	   Integer val = (Integer)adf.getValue();
    	   System.out.print(val+ " " +keys+ " ");
       }
       
	}
	
	public void spiltString(String abcd, String splitChar, int howManyChar) {

		String [] ab = abcd.split("\\"+splitChar, -1);
		
		String aq ="";
		
		for(String ad :ab) {
			
			aq=aq+ad;
			//System.out.print(ad.substring(0, howManyChar));
		}
		
		System.out.println("this is a final string " +aq.substring(0, howManyChar));
		
	}
	
	public List<Integer> compare1on1ArrayIndexes(int arr1[],int arr2[]) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<arr1.length;i++) {			
				
				if(!(arr1[i]==arr2[i])) {
					
					System.out.println("Array not equal, Index and value are " +i+ " "+arr1[i] +" "+arr2[i]);
					
					list.add(arr1[i]);

					list.add(arr2[i]);
				}
			
		}
		return list;
	}
	
	public int[] sortBubbleAscending(int arr1[]) {
		
		// 3,4,5,6,2,1
		int temp = 0;
		//int arr2[]= new int [arr1.length];
		
		for (int i = 0; i<arr1.length-1;i++) {			
			for (int j = i+1;j<arr1.length;j++) {				
				if (arr1[i]>arr1[j]) {
					
					
			//		temp = arr1[i];
				//		arr1[j]=arr2[i];
						
					//	temp=arr1[j];
					temp =arr1[i];
					arr1[i]=arr1[j];					
					arr1[j]=temp;				
					
				}				
			}
		}
		return arr1;
		
	}
	
	public void starPyramid(String str) {
		
		for (int i=1;i<=6;i++) {
			
			for (int j=1;j<=i;j++) {
				
				//if (i==j) {
				System.out.print(str);
				System.out.print("            ");
				//}
			}
			System.out.println();
		}
		
	}
	
	
	//Logic
	
	//1. move all the elments to the right and keep incrementing counter on the basis of non zero elements
	//2. Then campare the size of non zero elements and the orignal elemenst and add zerros at the end is 
	// 2,0,9,0,5,0,1,5,0,5
    // trying to push from git command line
	public void moveZerosToEnd(int arr[]) {
		int size=arr.length;
		int count =0;
		
		for (int i=0;i<arr.length;i++) {
			
			if (arr[i]!=0) {
				
				arr[count] =arr[i];
				count++;
			}
			
		}
		
		while (count<size) {
			
			arr[count]=0;
			count++;
		}
		
		for (int i = 0;i<arr.length;i++) {
			
			System.out.println("new array " +arr[i]);
		}
		
	}
}


// stream equ to for loop
// filter equavilent to if condition in for loop




