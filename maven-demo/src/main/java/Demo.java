
  public class Demo {
 
  public static void main(String[] args) {
  
  Methods sample1 = new Methods();
  int [] nums = {3,3,9,7,5,9,9,9,3,5};
  
  String [] str = { "java", "anurag", "selenium", "laptop","java","laptop", "j2global", "java"};
  
  //sample1.binaryGap(11);
  StringBuffer abg = new StringBuffer ("5;3,3,9,7,5");
  
  StringBuffer abgx = new StringBuffer ("1133334444666677777");
  
  int [] fg = {4,5,6,5,4,3,5,3,2,7,9,6,1,6,88,55,33,44,33,11,9,99,101};
  
  int [] ab= {3,5,7,2,1,4,6,7};
  

  int [] ac= {7,5,7,4,1,2,4,7,1};
  
  int [] aq = {2,0,9,0,5,0,1,5,0,5};
  
 // sample1.sortingByValue(nums);
  //sample1.spiltString("dsddsdsds*d4dsdsads*fdfdfds5%%fsdfsfsf#@#@!3*dsad","@");
  
  //sample1.spiltString("613-413-1779-iyu8788","-",10);
  ;
  
 // for (Integer a: sample1.compare1on1ArrayIndexes(ab, ac)) {
	  
	//  System.out.println("values which are not equal are " +a );
  //}
  
  
  
  //for (Integer a: sample1.sortBubbleAscending(ac)) {
	  
	//	 System.out.println(a);
	  //}
	  
  //sample1.starPyramid("*");
  
  sample1.moveZerosToEnd(aq);
  
  //String str1 = "5;3,3,9,7,5";
  
		// int  target = 6 ; 
		 
		// for (int i =0 ; i<sample1.twoSum(nums, target).length; i++) {
		 
		// System.out.println("array elements are " +sample1.twoSum(nums, target)[i] );
		// }
		 
		// sample1.duplicateNumber(nums);
		// System.out.println();
		// System.out.println("******************************************************");
		// System.out.println();
		// sample1.duplicateString(str);
		 
		// System.out.println("****************************************");
		 
		// sample1.duplicateNumberString(str1);
  //sample1.duplicateNumberStringBuffer(abg);
  //sample1.duplicateStringBufferWithoneThretwoOne(abgx);
  //sample1.duplicateStringBufferWithoneThretwoOneSort(fg);
 // sample1.duplicateStringBufferWithoneThretwoOneSort(fg);
  //sample1.duplicateStringBufferWithoneThretwoOneSortFunction(fg);
  
 // sample1.longestConsecString("aabcgesghkdh");
  
  //System.out.println("This is long Unique seq " +sample1.longestConsecString("aabcgesghkdh"));
  
  //sample1.palindromNumber(12421);
		
  //sample1.sample(4);
  
  //int findDuplElement [] = {1,4,1,4,5,6,5,6,7,7,9,8,8,9,7,5,11};
  
  
  //Methods sample1 = new Methods();
  
  //sample1.sample(findDuplElement); //sample1.binaryGap(121);
  
  //sample1.test1("a3b2dd");
		 
		 // max diff b/w array
		 
		// int [] a = {1,4,8,15,17}; 
		 
		// System.out.println("max difference is " +maxdiff(a));    
		 
		 //compare exact same index of two arrays and save if indexes matches
  
 }
  
  public static int maxdiff (int [] ab) {
	
	  int diff =0;
			  
			  for (int i = 0; i<ab.length-1;i++) {
				  
				  if ( ab[i+1] - ab[i]>diff) {
					  diff =ab[i+1] - ab[i];
				  }
			  }
	  
	  return diff;
	  
  }
  }/*
	 * class Test {
	 * 
	 * public void sample(int N) {
	 * 
	 * if (N >= 1 & N <= 100) {
	 * 
	 * for (int a = 1; a <= N; a++) {
	 * 
	 * System.out.println("L");
	 * 
	 * if (a == N - 1) {
	 * 
	 * for (int b = 1; b <= N - 1; b++) {
	 * 
	 * System.out.print("L"); }
	 * 
	 * }
	 * 
	 * } }
	 * 
	 * else System.out.println("Invalid number"); } }
	 */