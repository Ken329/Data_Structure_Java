package Data_Structure;

public class array_queue {
	public static class queue{
		int capa = 2;
		int[] queue = new int[5];
		int front;
		int rear;
		int size;
		public void enQueue(int data) {
			if(!isFull()) {
				queue[rear] = data;
				rear = (rear + 1) % 5;
				size++;
			}else {
				System.out.println("Sorry but the queue is full!!!");
			}
			
		}
		public int deQueue() {
			int data = queue[front];
			if(!isEmpty()) {
				front = (front + 1) % 5;
				size--;
			}else {
				System.out.println("Sorry but it is empty");
			}	
			return data;
		}
		public void show() {
			System.out.print("Elements: ");
			for(int i = 0; i < size; i++) {
				System.out.print(queue[(front + i) % 5] + " ");
			}
			System.out.println();
		}
		public int getSize() {
			return size;
		}
		public boolean isEmpty() {
			return getSize() == 0;
		}
		public boolean isFull() {
			return getSize() == queue.length;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue q = new queue();
		q.enQueue(23);
		q.enQueue(3);
		q.enQueue(11);
		q.show();
		System.out.println("Dequeue element: " + q.deQueue());
		q.show();
		q.enQueue(12);
		q.enQueue(54);
		q.show();
	}

}
