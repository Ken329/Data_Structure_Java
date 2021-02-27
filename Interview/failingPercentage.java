package Interview;

public class failingPercentage {
	public void percent(boolean[] result) {
		double percent = 0;
		for(int i = 0; i < result.length; i++) {
			if(result[i] == false) {
				percent = (i * 100)/result.length;
				break;
			}
		}
		System.out.println("Success rate: " + percent + "%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		failingPercentage fp = new failingPercentage();
		boolean[] result = {true, true, true, false, false, false, false};
		fp.percent(result);
	}

}
