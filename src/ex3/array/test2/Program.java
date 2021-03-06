package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		//텍스트파일에서 문자열 입력받아 배열에 넣고 출력
		
		//1.문자열 10개짜리 배열 names 생성
		String[] names = new String[10];
		
		//2.파일에서 이름 읽어와서 names에 대입 하고 바로 출력
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner scan = new Scanner(fis);
		
		int i=0;
		while(scan.hasNextLine()) {
			names[i++] = scan.nextLine();
			
//			System.out.printf(names[i-1]);
		}
		
		scan.close();
		fis.close();

		//3. names 배열의 이름을 다음처럼 콘솔에 출력
			//홍길동,김길동,강호동,유재석
			for(int j=0; j<i; j++) {
				System.out.printf("\"%s\"",names[j]);
			
				//예외
				if(j<i-1)
					System.out.print(",");
			}

	}

}
