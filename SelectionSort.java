package chap06;

class SelectionSort {
	
	//�ܼ���������
	static void SelectionSort(int[] a, int n) {
		for(int i = 0; i < n - 1; i++) {
			int min = i; //���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε����� ����մϴ�.
			for(int j = i + 1; j < n; j++) {
				if(a[j] < a[min]) {
					min = j;
				}
				swap(a, i, min); // ���� ���ĵ��� ���� �κ��� ù ��Ҹ� ��ȯ�մϴ�.
			}
		}
	}

}
