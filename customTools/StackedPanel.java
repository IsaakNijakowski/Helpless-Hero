package customTools;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.FlowLayout;

public class StackedPanel extends JPanel {
    private BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    private int hgap = 0;
    private int vgap = 0;
    private int align = 0; //left = 0; center = 1; right = 2;
    private Component bottomStrut;
    
    public StackedPanel(int vgap, int hgap, int align) {
        super();
        super.setLayout(layout);
        this.hgap = hgap/2;
        this.vgap = vgap/2;
        this.align = align;
        bottomStrut = Box.createVerticalStrut(vgap/2);
        super.add(Box.createVerticalStrut(vgap/2));
        super.add(bottomStrut);

    }
    @Override
    public Component add(Component comp) {
        super.remove(bottomStrut);
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(align, hgap, vgap));
        panel.add(comp);
        super.add(panel);
        super.add(bottomStrut);
        return comp;
    }
}
