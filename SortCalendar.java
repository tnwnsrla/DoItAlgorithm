package chap06;

import java.util.GregorianCalendar;
import static java.util.GregorianCalendar.*;

import java.util.Arrays;

class SortCalendar {

	public static void main(String[] args) {
		GregorianCalendar[] x = {
				new GregorianCalendar(2017, NOVEMBER, 1), //2017�� 11�� 01��
				new GregorianCalendar(1963, OCTOBER, 18), //1963�� 10�� 18��
				new GregorianCalendar(1985, APRIL, 5), //1985�� 04�� 05��
		};
		
		Arrays.sort(x); // �迭 x�� ����
		
		for(int i = 0; i < x.length; i++) {
			System.out.printf("%04d�� %02d�� %02d��\n", 
					x[i].get(YEAR), 
					x[i].get(MONTH)+1, 
					x[i].get(DATE)
			);
		}

	}

}
