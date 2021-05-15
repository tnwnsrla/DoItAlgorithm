package chap06;

import chap04.IntStack;

class QuickSort2 {

	// 퀵 정렬(비재귀 버전)
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop(); // 왼쪽 커서
			int pr = right = rstack.pop(); // 오른쪽 커서
			int x = a[(left + right) / 2]; // 피벗
			
			do {
				while(a[pl] < x) pl++;
				while(a[pr] > x) pr--;
				if(pl <= pr) {
					swap(a, pl++, pr--);
				} 
			} while(pl <= pr);
			
			if(left < pr) {
				lstack.push(left); // 왼쪽 그룹 범위의
				rstack.push(pr); // 인덱스를 푸시합니다.
			}
			if(pl < right) {
				lstack.push(pl); // 오른쪽 그룹 범위의
				rstack.push(right); // 인덱스를 푸시합니ㅏㄷ.
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
