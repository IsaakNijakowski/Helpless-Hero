package customTools;

import javax.swing.JTextArea;
import javax.swing.UIManager;

public class WrapText extends JTextArea {
    public WrapText(int rows, int columns) {
        super(rows,columns);
        super.setWrapStyleWord(true);
        super.setLineWrap(true);
        super.setOpaque(false);
        super.setEditable(false);
        super.setFocusable(false);
        super.setFont(UIManager.getFont("Label.font"));
    }
}
