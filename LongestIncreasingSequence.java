package dsArraysAndLists_LongestIncreasingSequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OperationsLoop:
		do {
			Scanner sc=new Scanner(System.in);
			
			List<Integer> l1=new ArrayList<Integer>(); 
			System.out.println("Please add the count of numbers that you want to add and 0 to exit");
			Integer cn=sc.nextInt();
			if(cn>0 && cn<100) {			
			
				System.out.println("Please add "+cn+" random numbers");
				for(int i=1;i<=cn;i++) {
					Integer ni=sc.nextInt();
					l1.add(ni);			
				}		
				int maximum=Integer.MIN_VALUE;
				int lowerIndex=0;
				int upperIndex=0;
				for(int i=0;i<cn-1;i++) {
					if(l1.get(i+1)-l1.get(i)>maximum) {
						maximum=l1.get(i+1)-l1.get(i);
						lowerIndex=i;
						upperIndex=i+1;
					}
				}
				System.out.println("Longest increment happened in the sequence is "+maximum);
				System.out.println("And it happened between "+l1.get(lowerIndex)+" and "+l1.get(upperIndex));
				
			}else if(cn==0) {
				break OperationsLoop;
			}else {
				System.out.println("Please add the count of numbers less than 100");
			}
		}while(1!=0);

	}

}
