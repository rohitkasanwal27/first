package assignm0;


import java.util.ArrayList;
import java.util.List;

public class Basics {
	
	public static void main(String args[]) {
		
	}
	
	public  void printHelloWorld() {
		System.out.println("HelloWorld");
	}
	
	/**
	 * function is to find sum of two numbers
	 * @param first inputed by user
	 * @param second inputed by user
	 * @return integer value is returned
	 */
	public int getSum(int first, int second) {
		return (first+second);
	}
	
	/**
	 * function to find larger number
	 * I used ternary operator in which if condition fails it will return second otherwise first
	 */

	public int getLargerNumber(int first, int second) {
		return first>second?first:second;
	}

	/**
	 * function to find the largest number
	 * firstly here used if conditon to compare between first and second. After that comparing answer with third
	 * @param first
	 * @param second
	 * @param third
	 * @return
	 */
	public int largestNumber(int first, int second, int third) {
		int ans;
		if(first>second) {
			ans= first>third?first:third;
		}
		else {
			ans= second>third?second:third;
		}
		return ans;
	}

	// Go through arrays in java and simple for loop and enhanced for loop
	/**
	 * function for printing an array
	 */
	public void printArray(int array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		
		System.out.println("/nusing for each");
		for(int i:array) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
	}
	
	/**
	 * funciton to get sum of an array having n element
	 * @param sum is intialize with zero
	 * using for each loop to iterate over the loop and adding element to the sum
	 * @return the total sum
	 */

	public int getSumOfArrayElements(int array[], int n) {
		int sum=0;
		for(int i:array) {
			sum+=i;
		}
		return sum;
	}
	
	
	/**
	 * Program to find the sum of all element of array
	 * @param array input
	 * @param n used to break the loop by subtracting 1 on each recursive call
	 * @return sum if all element of array
	 */
	public int getSumOfArrayElements1(int array[],int n) {
		if(n==0) {
			return 0;
		}
		int sum=array[n-1]+getSumOfArrayElements1(array,n-1);
		return sum;
	}

	/**
	 * Program to check number is prime or not
	 * @param number inputed by user
	 * @return will be a boolean
	 */
	public boolean isPrime(int number) {
		boolean ans=true;
		if(number<=1)ans= false;
		//to check all even except 2
		else if(number%2==0 && number!=2) {
			ans=false;
		}
		else {
			//started from 3 because we have already checked for 2
			//used sqrt as it will reduce number of iteration
			for(int i=3;i<=Math.sqrt(number);i=i+2) {
				if(number%i==0) {
					ans= false;
					break;
				}
			}
		}
		return ans;
	}

	
	// Say, first = 5 and second = 10, this function should print "5 6 7 8 9 10"
	/**
	 * used absolute function which take care of first>second and return the actual size of array
	 * @return
	 */
	public int[] getArrayOfRangeOfNumbers(int first, int second) {
		int sizeOfArray=Math.abs(second-first)+1;
		int arr[]=new int[sizeOfArray];
		for(int i=0;i<sizeOfArray;i++) {
			arr[i]=first;
			//used ternary operator to decide first will increase or decrease
			first=first<second?++first:--first;
		}
		return arr;
	}
	
	/**
	 * 
	 * @param fact is initialize with -1 because if number is less than zero we can directly return the fact
	 * 
	 * @return
	 */
	public int getFactorial(int n) {
		int fact=-1;
		int ans=1;

		if(n>=0) {
			while(n>1) {
				ans*=n;
				n--;
			}
			fact= ans;
		}
		return fact;
	}
	
	/**
	 * program to find factorial with help of recursion
	 * base condition n<0
	 * @param n
	 * @return
	 */

	public int getFactorialWithoutLoop(int n) {
		if(n<0) {
			return -1;
		}
		if(n==1 || n==0) {
			return 1;
		}
		return n*getFactorial(n-1);
	}

	// 1234 should give 4321
	/**
	 * reverse a digit using the while loop 
	 * here % will give the the remainder 
	 * and each time ans is multiply by 10 
	 * @param n
	 * @return
	 */
	public int reverseDigits(int n) {
		int ans=0;
		while(n>0) {
			ans=ans*10+n%10;
			n/=10;
		}
		return ans;
	}
	/*
	 * done by using two input
	 */
	public int reverseDigits1(int n , int ans) {
		if(n==0) {
			return ans;
		}
		//used refactor
		return recursivecalling(n, ans);
	}
	
	private int recursivecalling(int n, int ans) {
		ans=ans*10+n%10;
		return reverseDigits1(n/10,ans);
	}
	
	/**
	 * reverse digit using string
	 * base condition will n<9 because reverse of a number less than 
	 * @param n
	 * @return
	 * 
	 * 
	 */
	public int reverseDigits2(int n) {
		if(n<=0) {
			return 0;
		}
		String ans=String.valueOf(n%10) ;
		if(reverseDigits2(n/10)!=0) {
			ans+=String.valueOf(reverseDigits2(n/10));
			}
		return Integer.valueOf(ans);
	}
	

//	 In between 1 to 10, the prime numbers are 1, 2, 3, 5, 7
	/*
	 * done by using list and array
	 * creating a list of prime number and than storing the list element in the array
	 */
	public int[] primeNumbersInARange2(int lowerLimit, int upperLimit) {
		List<Integer> primeNumber=new ArrayList<>();
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(isPrime(i)) {
				primeNumber.add(i);
			}
		}
		int array[] = new int[primeNumber.size()];
		for(int i=0;i<primeNumber.size();i++) {
			array[i]=primeNumber.get(i);
		}
		return array;
	}
	
	
	/**
	 * first counting total number of prime and then creating an array
	 * Here loop is call twice
	 * @param ct is used to count the number of element
	 * @return
	 */
	
	public int[] primeNumbersInARange1(int lowerLimit, int upperLimit) {
		int ct=0;
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(isPrime(i)) {
				ct++;
			}
		}
		
		// creating an array of size ct
		int array[] = new int[ct];
		//here I initialize the value of ct to mobe in the array
		ct=0;
		for(int i=lowerLimit;i<=upperLimit;i++) {
			if(isPrime(i)) {
				array[ct]=i;
				ct++;
			}
		}
		return array;
	}
	
	/*
	 * By using two array and resizing the first array
	 * initializing an array with maximum length and than resizing it
	 * using the isPrime function and counting the number of prime number
	 * finally making a new array of size of total prime number
	 */
	
	public int[] primeNumbersInARange(int lowerLimit, int upperLimit) {
		int arr[];
		if(upperLimit<=1) {
			arr=new int[0];
		}
		else {
			//deciding the size of array based on value of lowerLimit
			int array[]=lowerLimit<0?new int[upperLimit]:new int[upperLimit-lowerLimit+1];
			int ct=0;
			for(int i=lowerLimit;i<=upperLimit;i++) {
				if(isPrime(i)) {
					array[ct]=i;
					ct++;
				}
			}
			// copying the value of array into the arr
			arr=new int[ct];
			for(int i=0;i<ct;i++) {
				arr[i]=array[i];
			}
		}
		return arr;
	}
	
	/**
	 * find number of occurence
	 * intializing @param ans with zero
	 * comparing each element of array with the given element and if it is equal add one to answer
	 * @param array
	 * @param n
	 * @return
	 */

	public int findNumberOfOccurences(int[] array, int n) {
		int ans=0;
		for(int i=0;i<array.length;i++) {
			if(n==array[i]) {
				ans++;
			}
		}
		return ans;
	}

	
	/**
	 * Find the first occurrence
	 * @param ans is initialize with -1 taking care of condition when element is not present in the array
	 * Now looping over the array and checking for that element and storing in ans and returning back the ans
	 * @return
	 */
	public int findFirstOccurence(int[] array, int number) {
		int ans=-1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==number) {
				ans= i;
				break;
			}
		}
		return ans;
		
	}
	
	/**
	 * print rhombus
	 * initializing a 2D array of string 
	 * deciding its size based on the input
	 * @param first is used to print first star
	 * @param last is used to print last star
	 * initially both first and last are equal and based on flag they change their value
	 * @param flag is used to reverse the direction of upper triangle to lower triangle
	 * @return
	 */
	
	public String [][] printRhombus1(int size) {
		String array[][];
		if(size<=0) {
			array=new String[0][1];
		}
		else {
			array=new String [2*size+1][2*size+1];
			int first=size;
			int last=size;
			boolean flag=true;
			//2*size+1 is number of rows because we have to make 2triangle
			for(int row=0;row<(2*size+1);row++) {
				for(int col=0;col<(2*size+1);col++) {
					if(col==first || col==last) {
						array[row][col]="*";
					}
					else {
						array[row][col]=" ";
					}	
				}
				if(flag==true) {
					first--;
					last++;
				}
				if(flag==false) {
					first++;
					last--;
				}
				if(row==size-1) {
					flag=false;
				}
			}
		}
		return array;
	}
	
	/**
	 * intializing an array with string of all word and returning the array[number]
	 * @return
	 */
	public String getNumberLessThanTenInWords(int number) {
		String array[]={"zero","one","two","three","four","five",
						"six","seven","eight","nine"};
		String ans="";
		if(number>10) {
			ans="Please fill number less than 10";
		}
		else {
			ans= array[number];
		}
		return ans;
	}
	
	/**
	 * function to get number in words
	 * the method will be recursive
	 * Initially if number is zero we will return zer0
	 * if number is negative we add - sign and use absolute function in that
	 * created vector of oneplace and tenth place
	 * so if number is greater than 1000 divide it by 10000 and recursively call the function
	 * than compare with 100 
	 * and then for tenth and ones place
	 * @return
	 */
	
	public String getNumberInWords(int number) {
		String ans="";
		if(number==0) {
			ans="zero";
		}
		else {
			if(number<0) {
				ans+="-"+ getNumberInWords(Math.abs(number));
			}
			else {
				String onesPlace[]= {"","one","two","three","four","five","six","seven",
						"eight","nine","ten","eleven","twelve","thirteen",
						"fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
				String tenthPlace[]= {"","","twenty","thirty","forty","fifty","sixty",
										"seventy","eighty","ninety"};
				
				if(number/1000>0) {
					ans+=getNumberInWords(number/1000)+" "+"thousand ";
					number%=1000;
				}
				if(number/100>0) {
					ans+=onesPlace[(number/100)]+" " + "hundred ";
					number%=100;
				}
				if(ans!="")ans+="and ";
				if(number<20) {
					ans+=onesPlace[number];
				}
				else {
					ans+=tenthPlace[number/10];
					number%=10;
					if(number>0) {
						ans+=" "+onesPlace[number%10];
					}
				}
			}
		}
		return ans;
	}
  
	
	/**
	 * firstly I initialize the 2D String array to store the pattern
	 * If size is less than zero than it will return an empty array
	 * 
	 * @return
	 */
	
	public String[][] printTrianglePointingRight1(int size) {
		String array[][];
		if(size%2!=0 || size<=0) {
			array= new String[0][];
			
		}
		else {
			array=new String[size+1][size/2+1];
			int mid=size/2;
			int last=0;
			boolean flag=false;
			for(int row=0;row<=size;row++) {
				for(int col=0;col<=size/2;col++) {
					if(col==0 || col==last) {
						array[row][col]="*";
					}
					else {
						array[row][col]=" ";
					}
				}
				if(last==mid) {
					flag=true;
				}
				last=flag==true?--last:++last;
			}
		}
		return array;
	}
}
