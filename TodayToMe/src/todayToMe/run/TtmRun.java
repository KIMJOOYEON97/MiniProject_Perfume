package todayToMe.run;

import javax.swing.JFrame;

import todayToMe.util.TtmUtil;
import todayToMe.view.LoadingGif;
import todayToMe.view.Q1;
import todayToMe.view.Q11;
import todayToMe.view.Q2;
import todayToMe.view.Q9;
import todayToMe.view.Q10;
import todayToMe.view.TtmMainview;

public class TtmRun extends JFrame{
	
	//메인 Run
	public static void main(String[] args) {
		new TtmMainview(540, 960, "Main").setVisible(true);
	}
}
