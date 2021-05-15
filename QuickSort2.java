package chap06;

import chap04.IntStack;

class QuickSort2 {

	// �� ����(����� ����)
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack = new IntStack(right - left + 1);
		IntStack rstack = new IntStack(right - left + 1);
		
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty() != true) {
			int pl = left = lstack.pop(); // ���� Ŀ��
			int pr = right = rstack.pop(); // ������ Ŀ��
			int x = a[(left + right) / 2]; // �ǹ�
			
			do {
				while(a[pl] < x) pl++;
				while(a[pr] > x) pr--;
				if(pl <= pr) {
					swap(a, pl++, pr--);
				} 
			} while(pl <= pr);
			
			if(left < pr) {
				lstack.push(left); // ���� �׷� ������
				rstack.push(pr); // �ε����� Ǫ���մϴ�.
			}
			if(pl < right) {
				lstack.push(pl); // ������ �׷� ������
				rstack.push(right); // �ε����� Ǫ���մϤ���.
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
