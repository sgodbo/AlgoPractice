package com.shan.timepass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class WordsNetwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "The maester stood on the windswept balcony outside his chambers. It was here the ravens came, after long flight. Their droppings speckled the gargoyles that rose twelve feet tall on either side of him, a hellhound and a wyvern, two of the thousand that brooded over the walls of the ancient fortress. When first he came to Dragonstone, the army of stone grotesques had made him uneasy, but as the years passed he had grown used to them. Now he thought of them as old friends. The three of them watched the sky together with foreboding.";
		List<String> sentences = Arrays.asList(input.split("[.]"));
		List<List<String>> wordsInSentences = new ArrayList<List<String>>();
		for(int i = 0;i < sentences.size();i++){
			wordsInSentences.add(Arrays.asList(sentences.get(i).split(" ")));
		}
		ListIterator<List<String>> sentenceItr = wordsInSentences.listIterator();
		while(sentenceItr.hasNext()){
			List<String> wordsSentence = sentenceItr.next();
			for(int i = 0;i < wordsSentence.size();i++){
				for(int j = i+1;j < wordsSentence.size();j++){
					double closeness = 1/((double)j-(double)i);
					System.out.println(wordsSentence.get(i) + " " + wordsSentence.get(j) + " " + closeness);
				}
			}
		}
 	}

}
