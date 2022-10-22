package customTools;

import javax.swing.JTextPane;
import javax.swing.UIManager;

public class SpecText extends JTextPane {
    public SpecText() {
        super();
        //super.setWrapStyleWord(true);
        //super.setLineWrap(true);
        super.setOpaque(false);
        super.setEditable(false);
        super.setFocusable(false);
        super.setFont(UIManager.getFont("Label.font"));
    }
}
