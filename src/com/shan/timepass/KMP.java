package com.shan.timepass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String main = "1010110010";
		String test = "10110";
		List<String> testChars = Arrays.asList(test.split(""));
		List<String> mainChars = Arrays.asList(main.split(""));
		String maxSuffix = "";
		ArrayList<String> suffixes = new ArrayList<String>();
		ListIterator<String> testCharItr = testChars.listIterator();
		ListIterator<String> mainCharItr = mainChars.listIterator();
		while(testCharItr.hasNext()){
			maxSuffix += testCharItr.next();
			suffixes.add(maxSuffix);
		}
		int j = 0;
		String nextCharInMain = "";
		String temp = "";
		String nextCharInTest = "";
		while(mainCharItr.hasNext()){
			nextCharInMain = mainCharItr.next();
			nextCharInTest = testChars.get(j);
			if(nextCharInMain.equals(nextCharInTest)){
				j++;
			}
		}
		if(j == testChars.size()){
			System.out.println("match");
		}	else{
			System.out.println("mismatch");
		}
 	}

}
