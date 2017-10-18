import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by wangcunxiang on 2017/10/18.
 */
public class MainFrame extends JFrame {

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        InputPanel input = new InputPanel();
        PaintPanel paint = new PaintPanel(input);
        BufferedImage image = new BufferedImage(1000,1000,BufferedImage.TYPE_INT_BGR);
        Graphics gs = image.getGraphics();
        Graphics2D g = (Graphics2D)gs;
        DrawPictureCanvas canvas = new DrawPictureCanvas();

        input.setPreferredSize(new Dimension(100, 500));
        getContentPane().add(input, BorderLayout.WEST);
        getContentPane().add(paint, BorderLayout.CENTER);
        setPreferredSize(new Dimension(1000, 1000));
        pack();
    }


}