package todayToMe.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

//반복적으로 사용되는 ImagePanel를 따로 클래스로 만들어서 사용
public class ImagePanelClass  extends JPanel {


	public String fileName;
	public BufferedImage image;
	public int w;
	public int h;
	

		public ImagePanelClass(String fileName) {
		
			try {
				image = ImageIO.read(new File(fileName));
				w = image.getWidth();
				h = image.getHeight();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(w,h);
			
		}
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			g.drawImage(image,0,0,null);
		}
	
	
}
