package com.shan.timepass;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSort {
	
	static int count =0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		String strarr = in.nextLine();
		StringTokenizer st = new StringTokenizer(strarr, " ");
		while(st.hasMoreTokens()) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		
		for(int j=arr.size();j>0;j--) {
			for(int i=0;i<j-1;i++) {
				if(arr.get(i+1) < arr.get(i)) {
					int temp = arr.get(i+1);
					arr.set(i+1,arr.get(i));
					arr.set(i,temp);
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
