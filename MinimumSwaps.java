package com.test.hackerrank;

import java.util.TreeSet;

public class MinimumSwaps {

	public static void main(String[] args) {
		int arr[] = {4, 3, 1, 2};
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println(MinimumSwaps.minimumSwaps(arr));
		
	}
	
	public static int minimumSwaps(int[] arr) {
		System.out.println();
		 TreeSet<Integer> ss=new TreeSet<Integer>();
	        for(int n : arr) {
	            ss.add(n);
	        }
	        int count=0;
	        int t1, t2, index=-1;
	        t1=ss.first();
	        for(int i=0; i< arr.length; i++) {
	        	for(int j=0; j< arr.length ; j++) {
	        		if(arr[j]==t1) {
	        			index=j;
	        			break;
	        		}
	        	}
	        	if(arr[i]==t1) {
	        		if(ss.higher(arr[i]) != null)
	        			t1=ss.higher(arr[i]);
	        		continue;
	        	}
	        	
	        	t2=arr[i];
	        	arr[i]=arr[index];
	        	arr[index]=t2;
	        	count++;
	        	t1=ss.higher(arr[i]);
	        }
	        return count;
	}

	public static int minimumSwapsComparatorVersion(int[] arr) {
		TreeSet<Integer> t=new TreeSet<>(new MinSorComparator());
		for(int i=0; i< arr.length; i++) {
			t.add(arr[i]);
		}
		return MinSorComparator.count;
    }

}
