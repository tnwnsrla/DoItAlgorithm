package chap09;
// ���Ḯ��Ʈ Ŭ����

public class LinkedList<E> {
	// ���
	class Node<E> {
		private E data; // ������
		private Node<E> data; // ���� ������ (���� ��� ����)
		
		// ������
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head; // �Ӹ� ���
	private Node<E> crnt; // ���� ���
}
