package ex6.capsule;

import java.util.Random;

public class Lotto {
	//재사용할 함수 구현
	
		//-------------------------------------
		// 로또번호 만들기
		public static int[] gen() {
			Random rand = new Random();
			int[] list = new int[6];
			
			for(int i=0; i<6; i++) {
				list[i]=rand.nextInt(45)+1;
			}
			
			return list;	
		}
		
		//-------------------------------------
		// 로또번호 출력
		public static void print(int[] x) {
			for(int i=0; i<x.length; i++) {
				System.out.printf("["+"%d"+"] ",x[i]);
			}
			System.out.println();
		}
		
		//-------------------------------------
		// 로또번호 정렬
		public static void sort(int[] x) {
			int temp;
			for(int i=0; i<x.length; i++)
				for(int j=0; j<i; j++) {
					if(x[i]<x[j]) {
						temp = x[j];
						x[j] = x[i];
						x[i] = temp;
					}
				}
		}
}
