package todayToMe.util;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TtmUtil {

	//반복적인 코드는 init호출
	public static void init(JFrame f, int w, int h, String title) {
		f.setTitle(title);
		f.setSize(w, h);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
