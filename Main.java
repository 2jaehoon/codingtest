package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int[] chessArr = new int[] {1,1,2,2,2,8};
	for(int i =0; i<chessArr.length; i++) {
		System.out.print(chessArr[i]-s.nextInt() + " ");
	}
	
	}

}
