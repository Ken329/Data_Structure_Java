package Interview;

import java.util.Arrays;

public class freeTime {
	// this program is to check two person schedule and compare is there any free time
	// 1. we need to merge those two array according the time 
	// 2. once it is merge just find the in between value 
	public double[][] merge(double[][] f1, double[][] f2){ // O(n log n)
		int a = 0;
		int length = 0;
		if(f1.length > f2.length) {
			length = f1.length;
		}else {
			length = f2.length;
		}
		double[][] merge = new double[length][2];
		while(a < f1.length && a < f2.length) { // O(m + n)
			double start, end;
			if(f1[a][0] < f2[a][0]) {
				start = f1[a][0];
			}else {
				start = f2[a][0];
			}
			if(f1[a][1] > f2[a][0]) {
				end = f1[a][1];
			}else {
				end = f2[a][1];
			}
			merge[a][0] = start;
			merge[a][1] = end;
			a++;
		}
		if(a < f1.length) {
			merge[a][0] = f1[a][0];
			merge[a][1] = f1[a][1];
		}
		if(a < f2.length) {
			merge[a][0] = f2[a][0];
			merge[a][0] = f2[a][0];
		}
		return merge;
	}
	public double[][] cal(double[][] f1){
		double[][] ans = new double[f1.length - 1][2];
		int a = 0;
		while(a < ans.length) { //O(m + n)
			double end = f1[a][1];
			double start = f1[a+1][0];
			ans[a][0] = end;
			ans[a][1] = start;
			a++;
		}
		return ans;
	}
	public void show(double[][] ans) {
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i][0] + " to " + ans[i][1]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[][] f1= {{10.00, 12.00}, {14.00, 15.30}, {16.00, 17.00}};
		double[][] f2 = {{9.00, 11.30}, {13.00, 14.30}};
		freeTime time = new freeTime();
		f1 = time.merge(f1, f2);
		System.out.println(Arrays.deepToString(f1));
		time.show(time.cal(f1));
	}

}
