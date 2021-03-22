package ex3.array;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3MultiArray3 {

	public static void main(String[] args) throws IOException {
		//전체 출력 + 지역화
		
		//레코드개수 알아보기
		int count=0;
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//제목 버리기
			scan.nextLine();
			
			String line;
			while(scan.hasNextLine()) {
				scan.nextLine();
				count++;
			}
		}
		//--------------------------------
		//2차원배열 생성
		String[][] lines = new String[count][];
		
		//전체 레코드 로드
		{
			FileInputStream fis = new FileInputStream("res/jeju.csv");
			Scanner scan = new Scanner(fis);
			
			//제목 버리기
			scan.nextLine();
			
			String line;
			for(int i=0; i<count; i++) {
				line = scan.nextLine();
				lines[i] = line.split(",");
			}
		}
		//출력
		{
			for(int j=0; j<count; j++) {
				for(int i=0; i<lines[j].length; i++) {
					if(i==0)
						System.out.printf("%s",lines[j][i]);
					else
						System.out.printf(",%s",lines[j][i]);
				}
				System.out.println();
			}
		}
		
		//누적 검사진행자수 출력
		{
			int sum=0;
			for(int i=0; i<count; i++) {
				sum += Integer.parseInt(lines[i][3]);
			}
			System.out.printf("누적 검사진행자수:%d", sum);
		}
		
		
	}	
}


