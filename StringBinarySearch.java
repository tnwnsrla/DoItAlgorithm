package chap03;

import java.util.Arrays;
import java.util.Scanner;

class StringBinarySearch {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = { "abstract", "assert", "boolean" };
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ���. : "); // Ű ���� �Է�
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�
		
		if(idx < 0) {
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		} else {
			System.out.println("�ش� Ű����� x[" + idx + "]�� �ֽ��ϴ�.");
		}

	}

}
