package customTools;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
public class ILabel extends JLabel{
    public ILabel(String text, int size, boolean bold) {
        super(text);
        super.setText(text);
        int boldValue = bold ? 1 : 0;
        super.setFont(new Font(super.getFont().getName(), boldValue, size));
    }
    public ILabel(String text, int size, boolean bold, Color color) {
        super(text);
        super.setText(text);
        int boldValue = bold ? 1 : 0;
        super.setFont(new Font(super.getFont().getName(), boldValue, size));
        super.setForeground(color);
    }
}
