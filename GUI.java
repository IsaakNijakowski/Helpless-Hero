import javax.swing.*;

import customTools.ILabel;

import java.awt.*;
public class GUI {
    
    JPanel topPanel = new JPanel();
    JPanel midPanel = new JPanel();
    JPanel botPanel = new JPanel();

    JLabel titleImage = new JLabel(getPlaceHolderImage(280, 80), SwingConstants.LEFT);
    JPanel timerPanel = new JPanel();
    JLabel timerText = new JLabel("00:00", SwingConstants.CENTER);
    JPanel competitiveTimePanel = new JPanel();
    JPanel competitiveTimeLabel = new JPanel();
    JPanel competitiveTimeText = new JPanel();
    JPanel competitiveStatsPanel = new JPanel();
    JLabel stage1TimeLabel = new JLabel("Stage 1: ");
    JLabel stage2TimeLabel = new JLabel("Stage 2: ");
    JLabel stage3TimeLabel = new JLabel("Stage 3: ");
    JLabel stage1TimeText = new JLabel("1-:--");
    JLabel stage2TimeText = new JLabel("2-:--");
    JLabel stage3TimeText = new JLabel("3-:--");
    JLabel runNumberText = new JLabel("Run: 1");
    JLabel killNumberText = new JLabel("Kills: 2");
    JLabel deathNumberText = new JLabel("Deaths: 3");

    JPanel leftPanel = new JPanel();
    JPanel leftStatPanel = new JPanel();
    ILabel leftArmorText = new ILabel("Armor: Blue", 12, true);
    JLabel leftHealthText = new JLabel("Health: Red");
    JLabel leftDamageText = new JLabel("Damage: Black");
    JLabel leftMagicText = new JLabel("Magic Damage: Purple");
    JLabel leftDelayText = new JLabel("Delay: Green");
    JLabel leftGoldText = new JLabel("Gold: Yellow");
    JPanel leftImagePanel = new JPanel();
    JPanel leftImageTitle = new JPanel();
    JLabel leftNameText = new JLabel();
    JLabel leftLevelText = new JLabel();
    JLabel leftImage = new JLabel(getPlaceHolderImage(150, 300));
    JProgressBar leftArmorBar = new JProgressBar();
    JProgressBar leftHealthBar = new JProgressBar();
    JProgressBar leftDelayBar = new JProgressBar();
    JLabel leftDamageNumbers = new JLabel();

    JPanel rightPanel = new JPanel();
    JPanel rightImagePanel = new JPanel();
    JPanel rightStatPanel = new JPanel();

    public GUI() {
        // Window initialization
        JFrame window = new JFrame("Helpless Hero");
        window.setSize(1280, 720);
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // --

        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        midPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        botPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rootPanel.add(topPanel);
        rootPanel.add(midPanel);
        rootPanel.add(botPanel);
        window.add(rootPanel);

        // TOP PANEL
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 110, 0));
        topPanel.setMaximumSize(new Dimension(1280, 100));
        // top panel logo
        topPanel.add(titleImage);
        // top panel time
        timerText.setFont(new Font(timerText.getFont().getName(), Font.PLAIN, 50));
        timerPanel.setSize(200, 100);
        timerPanel.add(timerText);
        topPanel.add(timerPanel);
        // top panel stat text
        //competitiveTimePanel.setMinimumSize(new Dimension(400, 100));
        // competitive time panel left
        competitiveTimeLabel.setLayout(new BoxLayout(competitiveTimeLabel, BoxLayout.Y_AXIS));
        stage1TimeLabel.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        stage2TimeLabel.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        stage3TimeLabel.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        competitiveTimeLabel.add(stage1TimeLabel);
        competitiveTimeLabel.add(stage2TimeLabel);
        competitiveTimeLabel.add(stage3TimeLabel);
        competitiveTimePanel.add(competitiveTimeLabel);
        competitiveTimeText.setLayout(new BoxLayout(competitiveTimeText, BoxLayout.Y_AXIS));
        stage1TimeText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        stage2TimeText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        stage3TimeText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        competitiveTimeText.add(stage1TimeText);
        competitiveTimeText.add(stage2TimeText);
        competitiveTimeText.add(stage3TimeText);
        competitiveTimePanel.add(competitiveTimeText);
        topPanel.add(competitiveTimePanel);
        // competitive stats panel
        competitiveStatsPanel.setLayout(new BoxLayout(competitiveStatsPanel, BoxLayout.Y_AXIS));
        runNumberText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        killNumberText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        deathNumberText.setFont(new Font(timerText.getFont().getName(), Font.BOLD, 15));
        competitiveStatsPanel.add(runNumberText);
        competitiveStatsPanel.add(killNumberText);
        competitiveStatsPanel.add(deathNumberText);
        topPanel.add(competitiveStatsPanel);

        // LEFT MIDDLE PANEL
        leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 0));
        leftStatPanel.setLayout(new BoxLayout(leftStatPanel, BoxLayout.Y_AXIS));
        leftStatPanel.add(Box.createRigidArea(new Dimension(100, 100)));
        leftStatPanel.add(leftArmorText);
        leftStatPanel.add(leftHealthText);
        leftStatPanel.add(leftDamageText);
        leftStatPanel.add(leftMagicText);
        leftStatPanel.add(leftDelayText);
        leftStatPanel.add(leftGoldText);
        leftPanel.add(leftStatPanel);
        leftPanel.add(leftImagePanel);
        midPanel.add(leftPanel);

        // RIGHT MIDDLE PANEL
        leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 0));
        midPanel.add(rightPanel);
        
        
    }
    public Icon getPlaceHolderImage(int width, int height) {
        ImageIcon imageIcon = new ImageIcon("image.png", "palceholder image");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    public static void main(String[] args) {
        new GUI();
    }
}