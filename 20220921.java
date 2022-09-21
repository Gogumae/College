package aa;

/* 2019068057
 * 2022 09 21
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class b1 {
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		//배열 선언 및 생성
		int num[] = new int[5];
		int korscore[] = new int[5];
		int engscore[] = new int[5];
		int mthscore[] = new int[5];
		int cscore[] = new int[5];
		String[] name = new String[20];
		
		System.out.println("====================================");
		System.out.println("           성  적  입  력  처  리        ");
		System.out.println("====================================");
		int i = 0;
		while(i < 5) //성적 입력 부분
		{
			System.out.println(i+1 + "번째 학생의 성적 입력");
			System.out.print("학번: ");
			try {num[i] = sc.nextInt();}
			catch(InputMismatchException e) {System.out.println("숫자를 입력해주십시오. 프로그램이 종료됩니다."); sc.close(); return;}
			System.out.print("이름: ");
			name[i] = sc.next();
			System.out.print("국어: ");
			try {korscore[i] = sc.nextInt();}
			catch(InputMismatchException e) {System.out.println("숫자를 입력해주십시오. 프로그램이 종료됩니다."); sc.close(); return;}
			System.out.print("영어: ");
			try {engscore[i] = sc.nextInt();}
			catch(InputMismatchException e) {System.out.println("숫자를 입력해주십시오. 프로그램이 종료됩니다."); sc.close(); return;}
			System.out.print("수학: ");
			try {mthscore[i] = sc.nextInt();}
			catch(InputMismatchException e) {System.out.println("숫자를 입력해주십시오. 프로그램이 종료됩니다."); sc.close(); return;}
			System.out.print("c언어: ");
			try {cscore[i] = sc.nextInt();}
			catch(InputMismatchException e) {System.out.println("숫자를 입력해주십시오. 프로그램이 종료됩니다."); sc.close(); return;}
			
			i++;
		}
		
		System.out.println("=========================================================================");
		System.out.println("학번"+'\t'+'\t'+"이름"+'\t'+"국어"+'\t'+"영어"+'\t'+"수학"+'\t'+"c언어"+'\t'+"총점"+'\t'+"평균"+'\t'+"학점");
		System.out.println("=========================================================================");

		for(int j=0;j<5;j++)  //성적 출력 부분
		{
			System.out.print(num[j]);
			System.out.print('\t');
			System.out.print(name[j]);
			System.out.print('\t');
			System.out.print(korscore[j]);
			System.out.print('\t');
			System.out.print(engscore[j]);
			System.out.print('\t');
			System.out.print(mthscore[j]);
			System.out.print('\t');
			System.out.print(cscore[j]);
			System.out.print('\t');
			int sum = korscore[j] + engscore[j] + mthscore[j] + cscore[j];
			double avg = sum/4;
			System.out.print(sum);
			System.out.print('\t');
			System.out.print(avg);
			System.out.print('\t');
			if (avg>=90 && avg==100)
			{
				System.out.println("A");
			}
			else if (avg>=80 && avg<90)
			{
				System.out.println("B");
			}
			else if (avg>=70 && avg<80)
			{
				System.out.println("C");
			}
			else if (avg>=60 && avg<70)
			{
				System.out.println("D");
			}
			else
			{
				System.out.println("F");
			}
		}
		
		
		
	}

}
