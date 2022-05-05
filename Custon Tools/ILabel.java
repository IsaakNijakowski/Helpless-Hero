import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class ILabel extends JLabel {
    private JLabel label = new JLabel();
    public ILabel(String text, int size, boolean bold) {
        label.setText(text);
        if (bold) {
            label.setFont(new Font(label.getFont().getName(), Font.BOLD, size));
        } else {
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, size));  
        }
    }
    public ILabel(String text, int size, boolean bold, Color color) {
        label.setText(text);
        if (bold) {
            label.setFont(new Font(label.getFont().getName(), Font.BOLD, size));
        } else {
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, size));  
        }
                label.setForeground(color);
    }
}
