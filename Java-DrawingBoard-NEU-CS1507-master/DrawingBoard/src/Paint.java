import javax.swing.*;
import java.awt.*;

public class Paint{
    public Paint(){
    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame mainFrame = new MainFrame();
            }
        });
    }
}