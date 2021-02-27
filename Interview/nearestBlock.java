package Interview;

import java.util.Arrays;

public class nearestBlock {
	public void getCloser(boolean[][] block, int[] req) {
		int[][] ans = check(block);
		int count = 0;
		System.out.println(Arrays.deepToString(ans));
		int[] result = new int[ans.length];
		for(int i = 0; i < ans.length; i++) {
			for(int j = 0; j < req.length; j++) {
				count += ans[i][req[j]];
			}
			result[i] = count;
			count = 0;
		}
		System.out.println(Arrays.toString(result));
		count = result[0];
		int index = 0;
		for(int i = 1; i < result.length; i++) {
			if(result[i] < count) {
				count = result[i];
				index = i;
			}
		}
		System.out.println("Block " + index + " is the nearest");
	}
	public int[][] check(boolean[][] block) {
		int[][] ans = new int[5][3];
		for(int i = 0; i < block.length; i++) {
			for(int j = 0; j < 3; j++) {
				if(block[i][j] == true) {
					ans[i][j] = 0;
				}else {
					for(int k = 0; k < block.length; k++) {
						if(k != i) {
							if(block[k][j] == true) {
								int count = Math.abs(k - i);
								if(ans[i][j] != 0) {
									if(ans[i][j] > count) {
										ans[i][j] = count;
									}
								}else {
									ans[i][j] = count;
								}
							}
						}
					}
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		boolean[][] block = {{false, true, false}, {true, false, false}, {true, true, false}, 
				{false, true, true}, {false, false, true}};
		int[] req = {0, 1, 2};
		nearestBlock t = new nearestBlock();
		t.getCloser(block, req);

	}

}
