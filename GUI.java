import javax.swing.*;

import customTools.*;

import java.awt.*;
public class GUI {
    
    JPanel topPanel = new JPanel();
    JPanel midPanel = new JPanel();
    JPanel botPanel = new JPanel();

    JLabel titleImage = new JLabel(getPlaceHolderImage(280, 80), SwingConstants.LEFT);
    JPanel timerPanel = new JPanel();
    JLabel timerText = new JLabel("00:00");
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

    int midTextSize = 30;
    JPanel leftPanel = new JPanel();
    JPanel leftStatPanel = new JPanel();
    JLabel leftArmorText = new ILabel("Armor: Blue", midTextSize, true, Color.blue);
    JLabel leftHealthText = new ILabel("Health: Red", midTextSize, true, Color.red);
    JLabel leftDamageText = new ILabel("Damage: Black", midTextSize, true, Color.black);
    JLabel leftMagicText = new ILabel("Magic Damage: Purple", midTextSize, true, Color.magenta);
    JLabel leftDelayText = new ILabel("Delay: Green", midTextSize, true, Color.green);
    JLabel leftGoldText = new ILabel("Gold: Yellow", midTextSize, true, Color.yellow);
    JPanel leftImagePanel = new JPanel();
    JPanel leftImageTitle = new JPanel();
    JLabel leftNameText = new JLabel("Name");
    JLabel leftLevelText = new JLabel("Level: 0");
    JLabel leftImage = new JLabel(getPlaceHolderImage(150, 300));
    JProgressBar leftArmorBar = new JProgressBar();
    JProgressBar leftHealthBar = new JProgressBar();
    JProgressBar leftDelayBar = new JProgressBar();
    JLabel leftDamageNumbers = new JLabel("-0");

    JPanel rightPanel = new JPanel();
    JPanel rightImagePanel = new JPanel();
    JPanel rightStatPanel = new JPanel();

    StackedPanel stacked = new StackedPanel(50, 50, FlowLayout.CENTER);
    JLabel text1 = new JLabel("text1");
    JLabel text2 = new JLabel("text2222222222");
    JLabel text3 = new JLabel("text3");

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
        leftPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 0));
        leftStatPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftStatPanel.setLayout(new BoxLayout(leftStatPanel, BoxLayout.Y_AXIS));
        leftStatPanel.add(Box.createVerticalStrut(100));
        leftStatPanel.add(leftArmorText);
        leftStatPanel.add(leftHealthText);
        leftStatPanel.add(leftDamageText);
        leftStatPanel.add(leftMagicText);
        leftStatPanel.add(leftDelayText);
        leftStatPanel.add(leftGoldText);
        leftPanel.add(leftStatPanel);
        leftImagePanel.setMaximumSize(new Dimension(150, 700));
        leftImagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftImagePanel.setLayout(new BoxLayout(leftImagePanel, BoxLayout.Y_AXIS));
        leftImageTitle.add(leftNameText);
        leftImageTitle.add(leftLevelText);
        leftImagePanel.add(leftImageTitle);
        leftImagePanel.add(leftImage);
        leftImagePanel.add(leftArmorBar);
        leftImagePanel.add(leftHealthBar);
        leftImagePanel.add(leftDelayBar);
        leftImagePanel.add(leftDamageNumbers);
        leftPanel.add(leftImagePanel);
        midPanel.add(leftPanel);

        // RIGHT MIDDLE PANEL
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
        midPanel.add(rightPanel);
        
        stacked.add(text1);
        stacked.add(text2);
        stacked.add(text3);
        midPanel.add(stacked);
        
        
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