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

    int midTextSize = 20;
    JPanel leftPanel = new JPanel();
    StackedPanel leftStatPanel = new StackedPanel(10, 0, FlowLayout.LEFT);
    JLabel leftArmorText = new ILabel("Armor: Blue", midTextSize, true, Color.blue);
    JLabel leftHealthText = new ILabel("Health: Red", midTextSize, true, Color.red);
    JLabel leftDamageText = new ILabel("Damage: Black", midTextSize, true, Color.black);
    JLabel leftMagicText = new ILabel("Magic Damage: Purple", midTextSize, true, Color.magenta);
    JLabel leftDelayText = new ILabel("Delay: Green", midTextSize, true, Color.green);
    JLabel leftGoldText = new ILabel("Gold: Yellow", midTextSize, true, Color.yellow);
    StackedPanel leftImagePanel = new StackedPanel(10, 0, FlowLayout.CENTER);
    Box leftImageTitle = Box.createHorizontalBox();
    JLabel leftNameText = new JLabel("poggers200040");
    JLabel leftLevelText = new JLabel("Level: 0");
    JLabel leftImage = new JLabel(getPlaceHolderImage(250, 250));
    JProgressBar leftArmorBar = new IBar("Armor",200,25,Color.blue);
    JProgressBar leftHealthBar = new IBar("Health", 200, 25, Color.red);
    JProgressBar leftDelayBar = new IBar("Delay", 200, 25, Color.green);
    JLabel leftDamageNumbers = new JLabel("-0");

    JPanel rightPanel = new JPanel();
    StackedPanel rightStatPanel = new StackedPanel(10, 0, FlowLayout.LEFT);
    JLabel rightArmorText = new ILabel("Armor: Blue", midTextSize, true, Color.blue);
    JLabel rightHealthText = new ILabel("Health: Red", midTextSize, true, Color.red);
    JLabel rightDamageText = new ILabel("Damage: Black", midTextSize, true, Color.black);
    JLabel rightMagicText = new ILabel("Magic Damage: Purple", midTextSize, true, Color.magenta);
    JLabel rightDelayText = new ILabel("Delay: Green", midTextSize, true, Color.green);
    JLabel rightGoldText = new ILabel("Gold: Yellow", midTextSize, true, Color.yellow);
    StackedPanel rightImagePanel = new StackedPanel(10, 0, FlowLayout.CENTER);
    Box rightImageTitle = Box.createHorizontalBox();
    JLabel rightNameText = new JLabel("poggers200040");
    JLabel rightLevelText = new JLabel("Level: 0");
    JLabel rightImage = new JLabel(getPlaceHolderImage(250, 250));
    JProgressBar rightArmorBar = new IBar("Armor",200,25,Color.blue);
    JProgressBar rightHealthBar = new IBar("Health", 200, 25, Color.red);
    JProgressBar rightDelayBar = new IBar("Delay", 200, 25, Color.green);
    JLabel rightDamageNumbers = new JLabel("-0");
    
    int buttonSize = 100;
    JButton weapon1 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));
    JButton weapon2 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));
    JButton weapon3 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));
    StackedPanel barPanel = new StackedPanel(0, 50, FlowLayout.CENTER);
    IBar expBar = new IBar("EXP", 125, 125/2, Color.blue);
    IBar progressBar = new IBar("PROGRESS", 125, 125/2, Color.orange);
    JButton sheild1 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));
    JButton sheild2 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));
    JButton sheild3 = new JButton(getPlaceHolderImage(buttonSize, buttonSize));

    JPanel panel;
    Box horizontalBox;


    public GUI() {
        // Window initialization
        JFrame window = new JFrame("Helpless Hero");
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // --

        JPanel rootPanel = new JPanel();
        rootPanel.setLayout(new BoxLayout(rootPanel, BoxLayout.Y_AXIS));
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
        
        // MID PANEL
        midPanel.setMaximumSize(new Dimension(1280, 450));
        // LEFT MIDDLE PANEL
        
        leftPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 50, 0));

        leftStatPanel.setLayout(new BoxLayout(leftStatPanel, BoxLayout.Y_AXIS));
        leftStatPanel.add(leftArmorText);
        leftStatPanel.add(leftHealthText);
        leftStatPanel.add(leftDamageText);
        leftStatPanel.add(leftMagicText);
        leftStatPanel.add(leftDelayText);
        leftStatPanel.add(leftGoldText);
        leftPanel.add(leftStatPanel);
        
        leftImagePanel.setLayout(new BoxLayout(leftImagePanel, BoxLayout.Y_AXIS));
        leftNameText.setAlignmentX(Component.LEFT_ALIGNMENT);
        leftImageTitle.add(leftNameText);
        leftImageTitle.add(Box.createHorizontalStrut(90));
        leftImageTitle.add(leftLevelText);
        leftImagePanel.add(leftImageTitle);
        leftImagePanel.add(leftImage);
        leftArmorBar.setValue(50);
        leftImagePanel.add(leftArmorBar);
        leftImagePanel.add(leftHealthBar);
        leftImagePanel.add(leftDelayBar);
        leftImagePanel.add(leftDamageNumbers);
        leftPanel.add(leftImagePanel);
        midPanel.add(leftPanel);

        // RIGHT MIDDLE PANEL
        rightPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));

        rightImagePanel.setLayout(new BoxLayout(rightImagePanel, BoxLayout.Y_AXIS));
        rightNameText.setAlignmentX(Component.LEFT_ALIGNMENT);
        rightImageTitle.add(rightNameText);
        rightImageTitle.add(Box.createHorizontalStrut(90));
        rightImageTitle.add(rightLevelText);
        rightImagePanel.add(rightImageTitle);
        rightImagePanel.add(rightImage);
        rightArmorBar.setValue(50);
        rightImagePanel.add(rightArmorBar);
        rightImagePanel.add(rightHealthBar);
        rightImagePanel.add(rightDelayBar);
        rightImagePanel.add(rightDamageNumbers);
        rightPanel.add(rightImagePanel);

        rightStatPanel.setLayout(new BoxLayout(rightStatPanel, BoxLayout.Y_AXIS));
        rightStatPanel.add(rightArmorText);
        rightStatPanel.add(rightHealthText);
        rightStatPanel.add(rightDamageText);
        rightStatPanel.add(rightMagicText);
        rightStatPanel.add(rightDelayText);
        rightStatPanel.add(rightGoldText);
        rightPanel.add(rightStatPanel);
        midPanel.add(rightPanel);
        
        // BOT PANEL
        botPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        weapon1.setPreferredSize(new Dimension(buttonSize, buttonSize));
        weapon2.setPreferredSize(new Dimension(buttonSize, buttonSize));
        weapon3.setPreferredSize(new Dimension(buttonSize, buttonSize));
        sheild1.setPreferredSize(new Dimension(buttonSize, buttonSize));
        sheild2.setPreferredSize(new Dimension(buttonSize, buttonSize));
        sheild3.setPreferredSize(new Dimension(buttonSize, buttonSize));
        botPanel.add(weapon1);
        botPanel.add(weapon2);
        botPanel.add(weapon3);
        barPanel.add(expBar);
        barPanel.add(progressBar);
        botPanel.add(barPanel);
        botPanel.add(sheild1);
        botPanel.add(sheild2);
        botPanel.add(sheild3);

        window.setVisible(true);
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