package dsArraysAndLists_LongestIncreasingSequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		List<Integer> l1=new ArrayList<Integer>(); 
		System.out.println("Please add five random numbers");
		for(int i=1;i<=5;i++) {
			Integer ni=sc.nextInt();
			l1.add(ni);			
		}		
		int maximum=Integer.MIN_VALUE;
		int lowerIndex=0;
		int upperIndex=0;
		for(int i=0;i<4;i++) {
			if(l1.get(i+1)-l1.get(i)>maximum) {
				maximum=l1.get(i+1)-l1.get(i);
				lowerIndex=i;
				upperIndex=i+1;
			}
		}
		System.out.println("Longest increment happened in the sequence is "+maximum);
		System.out.println("And it happened between "+l1.get(lowerIndex)+" and "+l1.get(upperIndex));

	}

}
