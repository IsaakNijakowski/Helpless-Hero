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
    StackedPanel leftStatPanel = new StackedPanel(10, 10, FlowLayout.LEFT);
    JLabel leftArmorText = new ILabel("Armor: Blue", midTextSize, true, Color.blue);
    JLabel leftHealthText = new ILabel("Health: Red", midTextSize, true, Color.red);
    JLabel leftDamageText = new ILabel("Damage: Black", midTextSize, true, Color.black);
    JLabel leftMagicText = new ILabel("Magic Damage: Purple", midTextSize, true, Color.magenta);
    JLabel leftDelayText = new ILabel("Delay: Green", midTextSize, true, Color.green);
    JLabel leftGoldText = new ILabel("Gold: Yellow", midTextSize, true, Color.yellow);
    StackedPanel leftImagePanel = new StackedPanel(10, 10, FlowLayout.CENTER);
    Box leftImageTitle = Box.createHorizontalBox();
    JLabel leftNameText = new JLabel("poggers200040");
    JLabel leftLevelText = new JLabel("Level: 0");
    JLabel leftImage = new JLabel(getPlaceHolderImage(200, 300));
    JProgressBar leftArmorBar = new JProgressBar();
    JProgressBar leftHealthBar = new JProgressBar();
    JProgressBar leftDelayBar = new JProgressBar();
    JLabel leftDamageNumbers = new JLabel("-0");

    JPanel rightPanel = new JPanel();
    StackedPanel rightImagePanel = new StackedPanel(10, 10, FlowLayout.RIGHT);
    JPanel rightStatPanel = new JPanel();

    JPanel panel;
    Box horizontalBox;


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
        leftStatPanel.add(leftArmorText);
        leftStatPanel.add(leftHealthText);
        leftStatPanel.add(leftDamageText);
        leftStatPanel.add(leftMagicText);
        leftStatPanel.add(leftDelayText);
        leftStatPanel.add(leftGoldText);
        leftPanel.add(leftStatPanel);
        
        leftImagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        leftImagePanel.setLayout(new BoxLayout(leftImagePanel, BoxLayout.Y_AXIS));
        leftNameText.setAlignmentX(Component.LEFT_ALIGNMENT);
        leftImageTitle.add(leftNameText);
        leftImageTitle.add(Box.createHorizontalStrut(90));
        leftImageTitle.add(leftLevelText);
        leftImagePanel.add(leftImageTitle);
        leftImagePanel.add(leftImage);
        //leftArmorBar.setSize(new Dimension(200, 200));
        leftArmorBar.setPreferredSize(new Dimension( 200,25));
        leftImagePanel.add(leftArmorBar);
        leftHealthBar.setPreferredSize(new Dimension( 200,25));
        leftImagePanel.add(leftHealthBar);
        leftDelayBar.setPreferredSize(new Dimension( 200,25));
        leftImagePanel.add(leftDelayBar);
        leftImagePanel.add(leftDamageNumbers);
        leftPanel.add(leftImagePanel);
        midPanel.add(leftPanel);

        // RIGHT MIDDLE PANEL
        rightPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
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