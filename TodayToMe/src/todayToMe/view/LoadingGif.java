package todayToMe.view;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


//gif 이미지를 윈도우 창에 띄움
public class  LoadingGif {
  public static void main(String[] args) throws InterruptedException {
    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        JFrame frame = new JFrame();
        frame.add(new ImagePanel());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(550, 1000);
        frame.setVisible(true);
      }
    });
    Thread.sleep(3000);
    new Q10(540, 960, "Q10").setVisible(true);
  }
}


class ImagePanel extends JPanel {

  Image image;
  
//gif 하는 방법
  public ImagePanel() {
    image = Toolkit.getDefaultToolkit().createImage("image/loading.gif");
  }

  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    if (image != null) {
      g.drawImage(image, 0, 0, this);
    }
  }

}