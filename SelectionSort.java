package chap06;

class SelectionSort {
	
	//단순선택정렬
	static void SelectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i; //아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록합니다.
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
				swap(a, i, min); // 아직 정렬되지 않은 부분의 첫 요소를 교환합니다.
			}
		}
	}

}
