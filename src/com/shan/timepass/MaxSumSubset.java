package com.shan.timepass;

public class MaxSumSubset {
	static int maxSum = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] setNum = {-7, 3, -5, 5, -2, 3, -7};
		findSubsetAndSum(setNum);
	}

	private static void findSubsetAndSum(int[] setNum) {
		// TODO Auto-generated method stub
		int[] subSetOfSetNum = new int[setNum.length-1];
		for(int i = 0;i < subSetOfSetNum.length;i++){
			subSetOfSetNum[i] = setNum[i];
		}
		findMax(subSetOfSetNum,setNum[setNum.length-1]);
		findSubsetAndSum(subSetOfSetNum);
	}

	private static void findMax(int[] setNum, int setNum2) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0;i < setNum.length;i++){
			sum += setNum[i];
		}
		if(sum > setNum2){
			maxSum = sum;
		}	else {
			maxSum = setNum2;
		}
	}

}
