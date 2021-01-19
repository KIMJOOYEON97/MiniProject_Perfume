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

import todayToMe.controller.TtmController;
import todayToMe.util.TtmUtil;

public class Q10 extends JFrame{
						
	public Q10(int w, int h,String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanelClass panel = new ImagePanelClass("image/check.png");
		
		//버튼 원하는 위치에 둘려면 필요함
		panel.setLayout(null);
		
		Font font = new Font("맑은 고딕",Font.BOLD,50);
		
		JButton startBtn = new JButton("결과 확인");
		
		
		startBtn.setFont(font);
		startBtn.setBounds(30, 300, 500, 50);
		startBtn.setBackground(new Color(247,239,220));
		
		
		
		panel.add(startBtn);
		add(panel);
		pack();
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Q11(540, 960, "Q11").setVisible(true);
				//Q10 닫아준다.
				Q10.this.dispose();
			}
		});
	}
	
}
