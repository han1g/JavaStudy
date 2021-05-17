package hashex;

import com.vscore.Score;
import com.vscore.ScoreVO;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreVO[] x = new ScoreVO[10];
		for(ScoreVO y : x) {
			y = new ScoreVO();
		}
		//이러면 당연히 안되지 y != x[i]

	}

}
