package todayToMe.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import todayToMe.model.vo.TtmSum;
import todayToMe.util.TtmUtil;

public class Q5 extends JFrame{

	
	public Q5(int w, int h, String title) {
		TtmUtil.init(this, w, h, title);
		
		ImagePanelClass panel = new ImagePanelClass("image/Q5.png");
		
		panel.setLayout(null);
		JButton a = new JButton("A");
		JButton b = new JButton("B");
		JButton c = new JButton("C");
		JButton d = new JButton("D");
		a.setBounds(60, 430, 50,50);
		b.setBounds(60, 540, 50,50);
		c.setBounds(60, 610, 50,50);
		d.setBounds(60, 700, 50,50);
		a.setBackground(new Color(204,204,204));
		b.setBackground(new Color(204,204,204));
		c.setBackground(new Color(204,204,204));
		d.setBackground(new Color(204,204,204));
		panel.add(a);
		panel.add(b);
		panel.add(c);
		panel.add(d);
		add(panel);
		pack();
		
		//선택시 이벤트 발생, 매개변수로 showMessageDialog에 띄울 문자와 점수를 세팅함.
		a.addActionListener(addListener("A선택",5));
		b.addActionListener(addListener("B선택",3));
		c.addActionListener(addListener("C선택",2));
		d.addActionListener(addListener("D선택",0));
	}
	
	//ActionListener를 따로 빼서 반복을 줄여줌.
	public ActionListener addListener(String choice,int point) {
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, choice);
				TtmSum.addIndividual(point);
				//Q5 닫아준다.
				Q5.this.dispose();
				new Q6(540,960,"Q6").setVisible(true);
			}
		};
		
		return listener;
		
	}
	

	public static void main(String[] args) {
		new Q5(540,960,"Q5").setVisible(true);
	}
}
