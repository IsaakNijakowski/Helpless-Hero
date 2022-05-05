package customTools;

import javax.swing.JProgressBar;
import java.awt.Dimension;
import java.awt.Color;

public class IBar extends JProgressBar {
    public IBar(String text, int width, int height, Color color) {
        super();
        super.setStringPainted(true);
        super.setString(text);
        super.setPreferredSize(new Dimension(width, height));
        super.setBorderPainted(true);
        super.setForeground(color);
        super.setValue(50);
    }
}
