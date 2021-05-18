package chap06;

import java.util.Scanner;

class HeapSort {

	// �迭��� a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// a[left] ~ a[right]�� ������ ����ϴ�.
	static void downHeap(int[] a, int left, int right) {
		int temp = a[left]; // ��Ʈ
		int child; // ū ���� ���� ���
		int parent; // �θ�
		
		for(parent = left; parent < (right + 1) / 2; parent = child) {
			int cl = parent * 2 + 1; //���� �ڽ�
			int cr = cl + 1; // ������ �ڽ�
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl; // ū ���� ���� ��带 �ڽĿ� ����
			if(temp >= a[child]) {
				break;
			}
			a[parent] = a[child];
		}
		a[parent] = temp;
	}
	
	// �� ����
	static void heapSort(int[] a, int n) {
		for (int i = (n - 1) / 2; i >= 0; i--) { // a[i] ~ a[n-1]�� ������ �����
			downHeap(a, i, n-1);
		}
		
		for(int i = n-1; i>0; i--) {
			swap(a, 0, i); // ���� ū ��ҿ� ���� ���ĵ��� ���� �κ��� ������ ��Ҹ� ��ȯ
			downHeap(a, 0, i-1); // a[0] ~ a[i-1]�� ������ ����ϴ�.
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ����");
		System.out.println("��ڼ� : ");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];
		
		for(int i = 0; i < nx; i++) {
			System.out.print("x[" + i + "]:");
			x[i] = stdIn.nextInt();
		}
		
		heapSort(x, nx); //�迭 x�� �� �����մϴ�.
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i = 0; i < nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}

	}

}
