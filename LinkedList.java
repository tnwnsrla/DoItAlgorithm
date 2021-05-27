package chap09;

import java.util.Comparator;

// 연결리스트 클래스

public class LinkedList<E> {
	// 노드
	class Node<E> {
		private E data; // 데이터
		private Node<E> data; // 뒤쪽 포인터 (다음 노드 참조)
		
		// 생성자
		Node(E data, Node<E> next) {
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<E> head; // 머리 노드
	private Node<E> crnt; // 선택 노드
	
	//노드 검색
	public E search(E obj, Comparator<? super E> c) {
		Node<E> ptr = head; // 현재 스캔 중인 노드
		
		while (ptr != null) {
			if(c.compare(obj, ptr.data) == 0) { // 검색 성공
				crnt = ptr;
				return ptr.data;
			}
			ptr = ptr.next; // 다음 노드를 선택
		}
		
		return null; //검색 실패
	}
	
	// 노드 p를 삭제
	public void remove(Node p) {
		if(head != null) {
			if (p == head) { // p가 머리노드면
				removeFirst(); // 머리 노드를 삭제
			} else {
				Node<E> ptr = head;
				
				while (ptr.next != p) {
					ptr = ptr.next;
					if(ptr == null) {
						return; // p가 리스트에 없습니다.
					}
				}
				ptr.next = p.next;
				crnt = ptr;
			}
		}
	}
	
	//선택 노드를 삭제
		public void removeCurrentNode() {
			remove(crnt);
		}
}
