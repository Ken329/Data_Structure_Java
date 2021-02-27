package Data_Structure;

public class heap_max {
	// heap can be seem as a binary tree
	// heap is a balance binary tree, it will be inserted level by level
	// 
	private int[] heap;
	private int capa;
	private int pos;
	public heap_max(){
		capa = 10;
		heap = new int[capa];
		pos = 1;
	}
	public void insert(int data) {
		if(pos == capa) {
			// increase the capacity
		}else {
			heap[pos++] = data;
			int child = pos - 1;
			int parent = child / 2;
			while(heap[parent] < heap[child] && parent > 0) {
				int temp = heap[parent];
				heap[parent] = heap[child];
				heap[child] = temp;
				
				child = parent;
				parent = child / 2;
			}
		}
	}
	public void print() {
		for(int i = 1; i < pos; i++) {
			System.out.print(heap[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		heap_max heap = new heap_max();
		heap.insert(12);
		heap.insert(7);
		heap.insert(6);
		heap.insert(10);
		heap.insert(8);
		heap.insert(20);
		heap.print();
	}

}
