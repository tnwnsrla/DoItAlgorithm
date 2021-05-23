package chap08;

public class KMPmatch {
	
	//KMP ���� ���� ���ڿ� �˻�
	static int kmpMatch(String txt, String pat) {
		int pt = 1; // txt Ŀ��
		int pp = 0; // pat Ŀ��
		int[] skip = new int[pat.length() + 1]; // �ǳʶٱ� ǥ
		
		//�ǳʶٱ� ǥ�� ����ϴ�.
		skip[pt] = 0;
		while(pt != pat.length()) {
			if(pat.charAt(pt) == pat.charAt(pp)){
				skip[++pt] = ++pp;
			} else if(pp==0) {
				skip[++pt] = pp;
			} else {
				pp = skip[pp];
			}
		}
		
		// �˻�
		
		pt = pp = 0;
		while(pt != txt.length() && pp != pat.length()) {
			if(txt.charAt(pt) == pat.charAt(pp)) {
				pt++;
				pp++;
			} else if (pp == 0) {
				pt++;
			} else {
				pp = skip[pp];
			}
		}
		
		if (pp == pat.length()) { // pt - pp�� ��ȯ�մϴ�.
			return pt - pp;
		}
		
		return -1; // �˻� ����
	}

}
