package chap03;

import java.util.Arrays;
import java.util.Scanner;

class StringBinarySearch {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = { "abstract", "assert", "boolean" };
		
		System.out.print("원하는 키워드를 입력하세요. : "); // 키 값을 입력
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소를 검색
		
		if(idx < 0) {
			System.out.println("해당 키워드가 없습니다.");
		} else {
			System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");
		}

	}

}
