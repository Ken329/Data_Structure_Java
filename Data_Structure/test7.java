package Data_Structure;

public class test7 {
	public void fib(int num) {
		int a = 0;
		int b = 1;
		while(a <= num) {
			System.out.print(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 20;
		test7 t = new test7();
		t.fib(num);
	}

}
