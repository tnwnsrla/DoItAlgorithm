package chap07;

class IntSet2 {
	private int max; // ������ �ִ� ����
	private int num; // ������ ��� ����
	private int[] set; // ���� ��ü
	
	//���տ��� n�� �˻��մϴ�.(index ��ȯ)
	public int indexOf(int n) {
		for(int i = 0; i < num; i++) {
			if(set[i] == n) {
				return i; // �˻�����
			}
		}
		return -1; //�˻�����
	}
	
	// ���� s�� �����մϴ�.
	public void copyTo(IntSet2 s) {
		int n = (s.max < num) ? s.max : num; //������ ��� ����
		for(int i = 0; i < n; i++) {
			s.set[i] = set[i];
		}
		
		s.num = n;
	}
	
	// ���տ� n�� �ִ��� ������ Ȯ���մϴ�.
	public boolean contains(int n) {
		return (indexOf(n) != -1) ? true : false;
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
	
	// ���տ��� n�� �����մϴ�.
	public boolean remove(int n) {
		int idx; // n�� ����� ����� �ε���
		
		if (num <= 0 || (idx = indexOf(n)) == -1) { // ��� �ְų� n�� �������� �ʽ��ϴ�.
			return false;
		} else {
			set[idx] = set[--num]; // ������ ��Ҹ� ������ ������ �ű�ϴ�.
			return true;
		}
	}
}
