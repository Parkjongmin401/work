package chap1;

import java.util.Scanner;

public class gugudan3 {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		while(true) {
			System.out.println("구구단을 입력하세요");
			int gugudan = scan.nextInt();
			if(gugudan==999) {
				break;
			}
			for (int i=1; i<=10; i++) {
				System.out.println(gugudan+"X"+i+"="+gugudan*i);
			}
		}
		scan.close();
	}
}
