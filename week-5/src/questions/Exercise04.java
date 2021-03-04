package questions;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int [] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------");
			System.out.println("선택>");
			
			int selectno = sc.nextInt();
			
			if(selectno==1) {
				System.out.println("학생수 입력");
				studentNum= sc.nextInt();
				scores = new int[studentNum];//null을 바꾸기 위해서 위에서 값을 초기화해야함.
				
			}else if(selectno==2) {
				if(studentNum==0) {
					System.out.println("학생이 없습니다.");
				}
				for(int i = 0; i<studentNum; i++) {
					System.out.println("점수를 입력하세요");
					int score=sc.nextInt();
					scores[i]=score;
				}
				
			}else if(selectno==3) {
				for(int i = 0 ; i<studentNum; i++) {
					System.out.println( "Scores[" + i + "] = "+scores[i]);
				}
			}else if(selectno==4) {
				int max=0;
				int sum = 0;
				double avg  =0;
				for(int i = 0 ; i<studentNum;i++) {
					if(scores[i]>max) {
						max = scores[i];
					}
				 sum +=scores[i];
				}
				avg = (double)sum/studentNum;
				
				System.out.println("최고 점수:" + max);
				System.out.println("평균" + avg);
				
			}else if(selectno==5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
