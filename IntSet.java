package chap07;

public class IntSet {
	private int max; // ������ �ִ� ����
	private int num; // ������ ��� ����
	private int[] set; // ���� ��ü
	
	// ������
	public IntSet(int capacity) {
		num = 0;
		max = capacity;
		try {
			set = new int[max]; // ���� �迭 ����
		} catch(OutOfMemoryError e) { // �迭 ��������
			max = 0;
		}
	}
	
	// ������ �ִ� ����
	public int capacity() {
		return max;
	}
	
	// ������ ��� ����
	public int size() {
		return num;
	}
	
	//���տ��� n�� �˻��մϴ�.(index ��ȯ)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) {
				return i; // �˻�����
			}
		}
		return -1; //�˻�����
	}
	
	// ���տ� n�� �ִ��� ������ Ȯ���մϴ�.
	public boolean contains(int n ) {
		return(indexOf(n) != -1) ? true : false;
	}
	
	// ���տ� n�� �߰��մϴ�.
	public boolean add(int n) {
		if(num >= max || contains(n) == true) { // ���� á�ų� �̹� n�� �����մϴ�.
			return false;
		} else {
			set[num++] = n; // ���� ������ �ڸ��� �߰��մϴ�.
		}
		return true;
	}
	
	//���տ��� n�� �����մϴ�.
	public boolean remove(int n) {
		int idx; // n�� ����� ����� �ε���
		
		if(num <= 0 || (idx = indexOf(n)) == -1) { // ��� �ְų� n�� �������� �ʽ��ϴ�.
			return false;
		} else {
			set[idx] = set[--num]; // ������ ��Ҹ� ������ ������ �ű�ϴ�.
		}
		
		return true;
	}

}
