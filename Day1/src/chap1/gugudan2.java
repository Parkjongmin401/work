package chap1;

import java.util.Scanner;

public class gugudan2 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("����� �������� �Է��ϼ���");
		int gugu=scan.nextInt();
		for(int i=2; i<=9; i++) {
			System.out.println(gugu+"X"+i+"="+gugu*i);
		}
		

	}

}
