import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class ILabel extends JLabel {
    private JLabel label = new JLabel();
    public ILabel(String text, int size, Color color) {
        label.setText(text);
        label.setFont(new Font(label.getFont().getName(), Font.BOLD, size));
    }
}
