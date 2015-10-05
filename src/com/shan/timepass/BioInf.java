package com.shan.timepass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class BioInf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "atgcctgagcaggagagacagatcacagccagagaaggggccagtcggaaaatcttatctaagctttctttgcctacccgtgcctgggaaccagcaatgaagaagagttttgcttttgacaatgttggctatgaaggtggtctggatggcctgggccct";
		String test2 ="atggcacaggttctcagaggcactgtgactgacttccctggatttgatgagcgggctgatgcagaaactcttcggaaggctatgaaaggcttgggcacagatgaggagagcatcctgactctgttgacatcccgaagtaatgctcagcgccaggaaatc";
		Map<Integer, ArrayList<Integer>> mapOfNuclPositions1 = findNucleotideInSequence(test);
		for(Entry<Integer,ArrayList<Integer>> entry:mapOfNuclPositions1.entrySet()){
			System.out.println(entry.getKey());
			/*ListIterator<Integer> positionsListItr = entry.getValue().listIterator();
			while(positionsListItr.hasNext()){
				System.out.print(positionsListItr.next() + " ");
			}*/
			for(int i = 0;i < entry.getValue().size()-1;i++){
				System.out.print(entry.getValue().get(i+1) - entry.getValue().get(i) + " ");
			}
			System.out.println();
		}
		Map<Integer, ArrayList<Integer>> mapOfNuclPositions2 = findNucleotideInSequence(test2);
		for(Entry<Integer,ArrayList<Integer>> entry:mapOfNuclPositions2.entrySet()){
			System.out.println(entry.getKey());
			/*ListIterator<Integer> positionsListItr = entry.getValue().listIterator();
			while(positionsListItr.hasNext()){
				System.out.print(positionsListItr.next() + " ");
			}*/
			for(int i = 0;i < entry.getValue().size()-1;i++){
				System.out.print(entry.getValue().get(i+1) - entry.getValue().get(i) + " ");
			}
			System.out.println();
		}
	}

	private static Map<Integer, ArrayList<Integer>> findNucleotideInSequence(String test) {
		// TODO Auto-generated method stub
		Map<Integer,ArrayList<Integer>> mapOfNuclPositions = new HashMap<Integer,ArrayList<Integer>>();
		mapOfNuclPositions.put(0, new ArrayList<Integer>());
		mapOfNuclPositions.put(1, new ArrayList<Integer>());
		mapOfNuclPositions.put(2, new ArrayList<Integer>());
		mapOfNuclPositions.put(3, new ArrayList<Integer>());
		String[] sequenceBroken = test.split("");
		System.out.println(sequenceBroken.length);
		for(int i = 0;i < sequenceBroken.length;i++){
			switch(sequenceBroken[i]){
				case "a":	mapOfNuclPositions.get(0).add(i);
							break;
				case "t":	mapOfNuclPositions.get(1).add(i);
							break;
				case "g":	mapOfNuclPositions.get(2).add(i);
							break;
				case "c":	mapOfNuclPositions.get(3).add(i);
							break;
							
			}
		}
		
		return mapOfNuclPositions;
	}

}
