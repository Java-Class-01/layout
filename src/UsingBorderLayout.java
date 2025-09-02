import javax.swing.*;
import java.awt.*;

public class UsingBorderLayout {
    public UsingBorderLayout() {
       JFrame BorderLayoutFrame = new JFrame("BorderLayout Frame");

       BorderLayoutFrame.setLayout( new BorderLayout());
       BorderLayoutFrame.setSize(1000, 700);
       BorderLayoutFrame.setVisible(true);
    }
}
