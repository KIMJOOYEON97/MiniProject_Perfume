package todayToMe.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import todayToMe.controller.TtmController;
import todayToMe.io.TtmIO;
import todayToMe.model.vo.TtmSum;
import todayToMe.util.TtmUtil;


public class Q9 extends JFrame{
		
	JTextArea username;

	public Q9(int w, int h,String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanelClass panel = new ImagePanelClass("image/Q9.png");
		
		
		//버튼 원하는 위치에 둘려면 필요함
		panel.setLayout(null);
		username= new JTextArea(5,20);
		username.setBounds(100, 500 , 200, 200);
		
		Font font = new Font("맑은 고딕",Font.BOLD,30);
		
		JButton inputBtn = new JButton("입력");
		
		
		inputBtn.setFont(font);
		inputBtn.setBounds(380, 550, 100, 100);
		inputBtn.setBackground(new Color(204,204,204));
		
		
		panel.add(username);
		panel.add(inputBtn);
		add(panel);
		pack();
		
		
		
		inputBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = username.getText();
				new TtmIO().insertName(s); 
	
				LoadingGif lg = new LoadingGif();
				//null값으로 주면 된다, lg의 모든 메소드를 불러옴(메인을 호출했음으로)
				try {
					lg.main(null);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "입력완료");			
				//Q9 닫아준다.
				Q9.this.dispose();
				new Q10(540, 960, "ResultCheck").setVisible(true);
			}
		});
	}

}
