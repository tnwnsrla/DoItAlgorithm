package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhysExamSearch {
	
	static class PhyscData{
		private String name; // 이름
		private int height; // 키
		private double vision; // 시력
		
		//생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name; this.height = height; this.vision = vision;
		}
		
		// 문자열을 반환하는 메서드 (정보 확인용)
		public String toString() {
			return name + " " + height + " " + vision;
		}
		
		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData> {
			public int compare(PhyscData d1, PhyscData d2) {
				return (d1.height > d2.height) ? 1 :
					   (d1.height < d2.height) ? -1 : 0;
			}
		}
	
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		PhyscData[] x = { // 키의 오름차순으로 정렬되어 있습니다.
				new PhyscData("이나령", 162, 0.3),
				new PhyscData("유지훈", 168, 0.4),
				new PhyscData("김한결", 169, 0.8),
				new PhyscData("홍준기", 171, 0.8),
				new PhyscData("전서현", 173, 0.7),
				new PhyscData("이호연", 174, 1.2),
				new PhyscData("이수민", 175, 2.0),
		};
		System.out.print("몇 cm인 사람을 찾고 있나요? :");
		int height = stdIn.nextInt(); // 키 값 입력
		// 배열 x에서 키가 height 인 요소를 HEIGHT_ORDER 에 의해 검색
		int idx = Arrays.binarySearch(x, new PhyscData("", height, 0.0), PhyscData.HEIGHT_ORDER);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터 : " + x[idx]); //자동으로 toString 메서드가 호출됩니다.
		}

	}

}
