package com.shan.timepass;

public class FourSided {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {22, 39, 3, 21};
		int possible = 0;
		for(int i = 0 ;i < 4;i++){
			if(arr[(i+2)%4] > arr[(i)%4] + arr[(i+1)%4]){
				possible++;
			}	
		}
		System.out.println(possible);
	} 

}
