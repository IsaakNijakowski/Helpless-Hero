import javax.swing.*;
import javax.swing.border.BevelBorder;

import customTools.*;

import java.awt.*;
import java.util.ArrayList;
public class GUI {
    Player player = new Player();
    ArrayList<Weapon> weaponList = new ArrayList<>(); 
    ArrayList<Shield> shieldList = new ArrayList<>();

    JFrame window = new JFrame("Helpless Hero");

    JPanel menuPanel = new JPanel();
    JPanel logoPanel = new JPanel();
    JPanel menuLowerPanel = new JPanel();

    JLabel titleCard = new JLabel(getPlaceHolderImage(1200, 300));
    StackedPanel statPanel = new StackedPanel(10, 10, FlowLayout.LEFT);
    ILabel runsLabel = new ILabel("Runs:", 24, true);
    ILabel deathLabel = new ILabel("Lowest Deaths:", 12, false);
    ILabel killLabel = new ILabel("Highest Kills:", 12, false);
    ILabel menuTimeLabel1 = new ILabel("Lowest time part 1:", 12, false);
    ILabel menuTimeLabel2 = new ILabel("Lowest time part 2:", 12, false);
    ILabel menuTimeLabel3 = new ILabel("Lowest time part 3:", 12, false);
    ILabel menuTimeLabel4 = new ILabel("Lowest time overall:", 24, true);
    StackedPanel menuButtonPanel = new StackedPanel(10, 10, FlowLayout.LEFT);
    JTextArea nameArea = new JTextArea("Click here to set your name!");
    JButton playButton = new JButton("Play");
    JButton itemButton = new JButton("Items");

    int itemImageSize = 90;
    JPanel menuItemPanel = new JPanel();
    StackedPanel menuItemsWeapons = new StackedPanel(25, 25, FlowLayout.LEFT);
    JPanel itemsRow1 = new JPanel();
    JPanel itemsRow2 = new JPanel();
    JPanel itemsRow3 = new JPanel();
    StackedPanel menuItemsArmor = new StackedPanel(25, 25, FlowLayout.LEFT);
    JPanel itemsRow4 = new JPanel();
    JPanel itemsRow5 = new JPanel();
    JPanel itemsRow6 = new JPanel();
    JButton menuBackButton = new JButton("Back");
    // Fast Weapons
    JLabel itemAguluzenaKatana = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemTwinKnives = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSilverSaber = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSeratedBlade = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    // Magic Weapons
    JLabel itemGlowSaber = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemPlasmaBlade = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemFireball = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemFlameAbsorber = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    // Heavy Weapons
    JLabel itemIliyaHammer = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSweepingAxe = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemBlastCannon = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemCoiledBlade = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    // Light Armor
    JLabel itemSwiftSatchel = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemInfusedWristSleeve = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemReinforcedBracer = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSpinningGuard = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    // Magic Armor
    JLabel itemGlowingRings = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemHoodOfDeath = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSaberGaurd = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemEnergyField = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    // Heavy Armor
    JLabel itemKindWall = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemSpikedPauldron = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemWideShield = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));
    JLabel itemKnightArmor = new JLabel(getPlaceHolderImage(itemImageSize, itemImageSize));


    JPanel gamePanel = new JPanel();
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
    JLabel stage1TimeLabel = new ILabel("Stage 1: ", 15, true, Color.black);
    JLabel stage2TimeLabel = new ILabel("Stage 2: ", 15, true, Color.black);
    JLabel stage3TimeLabel = new ILabel("Stage 3: ", 15, true, Color.black);
    JLabel stage1TimeText = new ILabel("1-:--", 15, true, Color.darkGray);
    JLabel stage2TimeText = new ILabel("2-:--", 15, true, Color.darkGray);
    JLabel stage3TimeText = new ILabel("3-:--", 15, true, Color.darkGray);
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
    JLabel leftDamageNumbers = new ILabel("-0", 20, true, Color.blue);

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
    JLabel rightNameText = new JLabel("bigMonsterMan");
    JLabel rightLevelText = new JLabel("Level: 0");
    JLabel rightImage = new JLabel(getPlaceHolderImage(250, 250));
    JProgressBar rightArmorBar = new IBar("Armor",200,25,Color.blue);
    JProgressBar rightHealthBar = new IBar("Health", 200, 25, Color.red);
    JProgressBar rightDelayBar = new IBar("Delay", 200, 25, Color.green);
    JLabel rightDamageNumbers = new ILabel("-0", 20, true, Color.red);
    
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

    JPanel baseLeftPanel = new JPanel();
    JPanel baseRightPanel = new JPanel();

    JButton testTutorial = new JButton("test tutorial");
    JButton testLevelUp = new JButton("test level up");

    StackedPanel tutorialPanel = new StackedPanel(10, 10, FlowLayout.CENTER);
    ILabel tutorialTitle = new ILabel("Tutorial!", 20, true, Color.red);
    JTextArea tutorialText = new WrapText(7, 50);
    JButton tutorialButton = new JButton("Continue");

    int rows = 2;
    int columns = 40;
    StackedPanel levelPanel = new StackedPanel(0, 20, FlowLayout.LEFT);
    ILabel levelUpText = new ILabel("Level Up!", 20, true, Color.blue);
    JPanel selectionPanel1 = new JPanel();
    JButton selectionButton1 = new JButton(getPlaceHolderImage(100, 100));
    StackedPanel selectionTextPanel1 = new StackedPanel(0, 25, FlowLayout.LEFT);
    ILabel selectionTitle1 = new ILabel("Selection 1", 15, true, Color.darkGray);
    WrapText selectionDescription1 = new WrapText(rows, columns);
    JPanel selectionPanel2 = new JPanel();
    JButton selectionButton2 = new JButton(getPlaceHolderImage(100, 100));
    StackedPanel selectionTextPanel2 = new StackedPanel(0, 25, FlowLayout.LEFT);
    ILabel selectionTitle2 = new ILabel("Selection 2", 15, true, Color.darkGray);
    WrapText selectionDescription2 = new WrapText(rows, columns);
    JPanel selectionPanel3 = new JPanel();
    JButton selectionButton3 = new JButton(getPlaceHolderImage(100, 100));
    StackedPanel selectionTextPanel3 = new StackedPanel(0, 25, FlowLayout.LEFT);
    ILabel selectionTitle3 = new ILabel("Selection 3", 15, true, Color.darkGray);
    WrapText selectionDescription3 = new WrapText(rows, columns);

    

    public GUI() {
        // Window initialization
        window.setSize(1280, 720);
        window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // --

        // TITLE PANEL
        menuPanel.setLayout(new BoxLayout(menuPanel, BoxLayout.Y_AXIS));
        menuPanel.add(logoPanel);
        menuPanel.add(menuLowerPanel);
        window.add(menuPanel);

        // logo panel
        logoPanel.add(titleCard);

        // LOWER MENU PANEL
        menuLowerPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 0));
        menuLowerPanel.add(statPanel);
        menuLowerPanel.add(menuButtonPanel);
        statPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        // stat panel
        statPanel.setPreferredSize(new Dimension(700, 250));
        statPanel.add(runsLabel);
        statPanel.add(deathLabel);
        statPanel.add(killLabel);
        statPanel.add(menuTimeLabel1);
        statPanel.add(menuTimeLabel2);
        statPanel.add(menuTimeLabel3);
        statPanel.add(menuTimeLabel4);

        // button panel
        playButton.setPreferredSize(new Dimension(400, 100));
        itemButton.setPreferredSize(new Dimension(400, 100));
        menuButtonPanel.add(nameArea);
        menuButtonPanel.add(playButton);
        menuButtonPanel.add(itemButton);
        nameArea.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        nameArea.setPreferredSize(new Dimension(400,20));

        playButton.addActionListener(e -> {
            startGame();
        });

        itemButton.addActionListener(e -> {
            menuLowerPanel.remove(statPanel);
            menuLowerPanel.remove(menuButtonPanel);
            menuLowerPanel.add(menuItemPanel);
            window.revalidate();
        });

        // ITEM MENU PANEL --------------------------------------------------------------------------------------------------------
    menuItemPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
    menuItemPanel.add(menuItemsWeapons);
    menuItemPanel.add(menuItemsArmor);
    menuBackButton.setPreferredSize(new Dimension(150,125));
    menuItemPanel.add(menuBackButton);

    // Weapon Column
    menuItemsWeapons.add(itemsRow1);
    menuItemsWeapons.add(itemsRow2);
    menuItemsWeapons.add(itemsRow3);
    itemsRow1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    itemsRow2.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    itemsRow3.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    //row 1
    itemsRow1.add(itemAguluzenaKatana);
    itemsRow1.add(itemTwinKnives);
    itemsRow1.add(itemSilverSaber);
    itemsRow1.add(itemSeratedBlade);
    //row 2
    itemsRow2.add(itemGlowSaber);
    itemsRow2.add(itemPlasmaBlade);
    itemsRow2.add(itemFireball);
    itemsRow2.add(itemFlameAbsorber);
    //row 3
    itemsRow3.add(itemIliyaHammer);
    itemsRow3.add(itemSweepingAxe);
    itemsRow3.add(itemBlastCannon);
    itemsRow3.add(itemCoiledBlade);

    // Armor Column
    menuItemsArmor.add(itemsRow4);
    menuItemsArmor.add(itemsRow5);
    menuItemsArmor.add(itemsRow6);
    itemsRow4.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    itemsRow5.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    itemsRow6.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
    //row 4
    itemsRow4.add(itemSwiftSatchel);
    itemsRow4.add(itemInfusedWristSleeve);
    itemsRow4.add(itemReinforcedBracer);
    itemsRow4.add(itemSpinningGuard);
    //row 5
    itemsRow5.add(itemGlowingRings);
    itemsRow5.add(itemHoodOfDeath);
    itemsRow5.add(itemSaberGaurd);
    itemsRow5.add(itemEnergyField);
    //row 6
    itemsRow6.add(itemKindWall);
    itemsRow6.add(itemSpikedPauldron);
    itemsRow6.add(itemWideShield);
    itemsRow6.add(itemKnightArmor);

    // Back button
    menuBackButton.addActionListener(e -> {
        menuLowerPanel.add(statPanel);
        menuLowerPanel.add(menuButtonPanel);
        menuLowerPanel.remove(menuItemPanel);
        window.revalidate();
    });

        // GAME PANEL
        gamePanel.setLayout(new BoxLayout(gamePanel, BoxLayout.Y_AXIS));
        gamePanel.add(topPanel);
        gamePanel.add(midPanel);
        gamePanel.add(botPanel);
        //window.add(gamePanel);
        //--------------------------------------------------------------------------------------------------------------------------

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
        competitiveTimeLabel.add(stage1TimeLabel);
        competitiveTimeLabel.add(stage2TimeLabel);
        competitiveTimeLabel.add(stage3TimeLabel);
        competitiveTimePanel.add(competitiveTimeLabel);
        competitiveTimeText.setLayout(new BoxLayout(competitiveTimeText, BoxLayout.Y_AXIS));
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
        midPanel.add(baseLeftPanel);
        midPanel.add(baseRightPanel);
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
        baseLeftPanel.add(leftPanel);

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
        baseRightPanel.add(rightPanel);
        
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

        // TEST BUTTONS
        //botPanel.add(testTutorial);
        //botPanel.add(testLevelUp);

        testTutorial.addActionListener(e -> {
            baseLeftPanel.remove(leftPanel);
            baseLeftPanel.add(tutorialPanel);
            window.revalidate();
        });
        testLevelUp.addActionListener(e -> {
            baseRightPanel.remove(rightPanel);
            baseRightPanel.add(levelPanel);
            window.revalidate();
        });

        // TUTORIAL PANEL
        tutorialPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        tutorialPanel.setPreferredSize(new Dimension(612, 250));
        tutorialPanel.add(tutorialTitle);
        tutorialText.setText("If you see this text there was an error");
        tutorialPanel.add(tutorialText);
        tutorialPanel.add(tutorialButton);

        tutorialButton.addActionListener(e -> {
            baseLeftPanel.remove(tutorialPanel);
            baseLeftPanel.add(leftPanel);
            window.revalidate();
        });

        // LEVELUP PANEL
        levelPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        levelPanel.setPreferredSize(new Dimension(612, 400));
        levelPanel.add(levelUpText);

        selectionDescription1.setText("If you see this text there was an error");
        selectionButton1.setPreferredSize(new Dimension(100,100));
        selectionPanel1.add(selectionButton1);
        selectionTextPanel1.add(selectionTitle1);
        selectionTextPanel1.add(selectionDescription1);
        selectionPanel1.add(selectionTextPanel1);
        levelPanel.add(selectionPanel1);
        
        selectionDescription2.setText("If you see this text there was an error");
        selectionButton2.setPreferredSize(new Dimension(100,100));
        selectionPanel2.add(selectionButton2);
        selectionTextPanel2.add(selectionTitle2);
        selectionTextPanel2.add(selectionDescription2);
        selectionPanel2.add(selectionTextPanel2);
        levelPanel.add(selectionPanel2);

        selectionDescription3.setText("If you see this text there was an error");
        selectionButton3.setPreferredSize(new Dimension(100,100));
        selectionPanel3.add(selectionButton3);
        selectionTextPanel3.add(selectionTitle3);
        selectionTextPanel3.add(selectionDescription3);
        selectionPanel3.add(selectionTextPanel3);
        levelPanel.add(selectionPanel3);
        
        

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
    
    public Icon getPlaceHolderImage(int width, int height) {
        ImageIcon imageIcon = new ImageIcon("image.png", "palceholder image");
        Image image = imageIcon.getImage();
        Image newimg = image.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg);
        return imageIcon;
    }

    public void startGame() {
        weaponList = initiateWeapons();
        shieldList = initiateSheilds();
        window.remove(menuPanel); //leve menu panel
        window.add(gamePanel); // go to game panel
        window.revalidate(); // update the screen
        selectWeapon();
        // calculate stats (every new weapon, weapon upgrade, new monster, or new level)
        // select monster
        // calclate monster stats (every new monster)
        // begin fighting
    }
    public ArrayList<Weapon> initiateWeapons() {
        ArrayList<Weapon> weapons = new ArrayList<>();
        weapons.add(new Weapon("Aguluzena Katana", 10, 0, 50));
        weapons.add(new Weapon("Twin Knives", 5, 0, 50));
        weapons.add(new Weapon("Silver Saber", 5, 0, 40));
        weapons.add(new Weapon("Serated Blade", 10, 0, 75));
        return weapons;
    }
    public ArrayList<Shield> initiateSheilds() {
        ArrayList<Shield> shields = new ArrayList<>();
        shields.add(new Shield("Swift Satchel", 5));
        shields.add(new Shield("Infused Wrist Sleeve", 5));
        shields.add(new Shield("Reinforced Bracer", 5));
        shields.add(new Shield("Spinning Guard", 5));
        return shields;
    }
    public void selectWeapon() {
        ArrayList<Weapon> weaponCopy = (ArrayList<Weapon>) weaponList.clone();
        ArrayList<Weapon> existList = (ArrayList<Weapon>) player.getPlayerWeapons().clone();
        while (existList.size() > 0) {
            for (int i = 0; i < weaponCopy.size(); i++) {
                for (int e = 0; e < existList.size(); e++) {
                    if (weaponCopy.get(i).getName().equals(existList.get(e).getName())) {
                        weaponCopy.remove(i);
                        existList.remove(e);
                    }
                }
            }
        }
        ArrayList<Weapon> selectList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int rand = (int) Math.floor(Math.random()*weaponCopy.size());
            selectList.add(weaponCopy.get(rand));
            weaponCopy.remove(rand);
        }
        // set select panel info
        selectionTitle1.setText(selectList.get(0).getName());
        selectionTitle2.setText(selectList.get(1).getName());
        selectionTitle3.setText(selectList.get(2).getName());
        baseRightPanel.remove(rightPanel);
        baseRightPanel.add(levelPanel);
        window.revalidate();
        selectionButton1.addActionListener(e -> {
            player.giveWeapon(selectList.get(0));
            updateWeaponIcon();
            baseRightPanel.remove(levelPanel);
            baseRightPanel.add(rightPanel);
            window.revalidate();
        });
        selectionButton2.addActionListener(e -> {
            player.giveWeapon(selectList.get(1));
            updateWeaponIcon();
            baseRightPanel.remove(levelPanel);
            baseRightPanel.add(rightPanel);
            window.revalidate();
        });
        selectionButton3.addActionListener(e -> {
            player.giveWeapon(selectList.get(2));
            updateWeaponIcon();
            baseRightPanel.remove(levelPanel);
            baseRightPanel.add(rightPanel);
            window.revalidate();
        });
        
    }

    public void updateWeaponIcon() {
        int weaponCount = player.getPlayerWeapons().size();
        switch (weaponCount) {
            case(1):
            weapon1.setIcon(player.getPlayerWeapons().get(0).getIcon());
            break;
            case(2):
            weapon2.setIcon(player.getPlayerWeapons().get(1).getIcon());
            break;
            case(3):
            weapon3.setIcon(player.getPlayerWeapons().get(2).getIcon());
            break;
            default: System.err.println("An error has occured at updateWeaponIcon(), player has an invald number of weapons");
            break;
        }
    }


    public static void main(String[] args) {
        new GUI();
    }
}