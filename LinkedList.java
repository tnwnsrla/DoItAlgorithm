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
		
	// 모든 노드를 삭제
		public void clear() {
			while (head != null) { // 노드에 아무것도 없을 때까지
				removeFirst(); // 머리노드를 삭제
			}
			crnt = null;
		}
		
		// 선택 노드를 하나 뒤쪽으로 이동
		public boolean next() {
			if(crnt == null || crnt.next == null) {
				return false; // 이동할 수 없음
			}
			crnt = crnt.next;
			return true;
		}
		
		// 선택 노드를 출력
		public void printCurrentNode() {
			if(crnt == null) {
				System.out.println("선택한 노드가 업습니다.");
			} else {
				System.out.println(crnt.data);
			}
			
		}
		
		// 모든 노드를 출력
		public void dump() {
			Node<E> ptr = head;
			
			while(ptr != null) {
				System.out.println(ptr.data);
				ptr = ptr.next;
			}
		}
}
