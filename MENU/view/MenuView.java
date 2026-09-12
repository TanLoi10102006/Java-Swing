package MENU.view;

import MENU.controller.MenuCheck;
import MENU.controller.MenuController;
import MENU.controller.MenuMouse;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MenuView extends JFrame {

    private JLabel jLabel;
    public JPopupMenu jPopupMenu;
    private JToolBar toolBar;
    private  JCheckBoxMenuItem jCheckBoxMenuItem;

    public MenuView() {
        init();
    }

    public void init() {

        setTitle("Menu MVC");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //================ Controller =================
        MenuController menuController = new MenuController(this);
        MenuMouse menuMouse = new MenuMouse(this);

        Font font = new Font("Arial", Font.BOLD, 25);

        //================ MENU BAR =================

        JMenuBar menuBar = new JMenuBar();
        // Menu File
        JMenu menuFile = new JMenu("File");

        JMenuItem itemNew = new JMenuItem("New");
        itemNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        itemNew.addActionListener(menuController);

        JMenuItem itemOpen = new JMenuItem("Open");
        itemOpen.setMnemonic(KeyEvent.VK_O);
        itemOpen.addActionListener(menuController);

        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
        itemExit.addActionListener(menuController);

        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.addSeparator();
        menuFile.add(itemExit);

        // Menu View 
        MenuCheck menuCheck= new MenuCheck(this);
        JMenu view = new JMenu("View");
        jCheckBoxMenuItem= new JCheckBoxMenuItem("toolBar");
        jCheckBoxMenuItem.setSelected(true); // đánh dấu tích hoặc k đánh dáu tích 
        view.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.addActionListener(menuCheck);
            

        // Menu Heple 
        JMenu menuHelp = new JMenu("Help");

        JMenuItem itemWelcome = new JMenuItem("Welcome");
        itemWelcome.addActionListener(menuController);

        JMenuItem itemAbout = new JMenuItem("About");
        itemAbout.addActionListener(menuController);

        menuHelp.add(itemWelcome);
        menuHelp.add(itemAbout);

        menuBar.add(menuFile);
        menuBar.add(view);
        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        //================ TOOLBAR =================

        toolBar = new JToolBar();

        JButton btnUndo = new JButton("Undo");
        JButton btnRedo = new JButton("Redo");
        JButton btnCopy = new JButton("Copy");
        JButton btnCut = new JButton("Cut");
        JButton btnPaste = new JButton("Paste");

        btnUndo.setToolTipText("Undo");
        btnRedo.setToolTipText("Redo");
        btnCopy.setToolTipText("Copy");
        btnCut.setToolTipText("Cut");
        btnPaste.setToolTipText("Paste");

        btnUndo.addActionListener(menuController);
        btnRedo.addActionListener(menuController);
        btnCopy.addActionListener(menuController);
        btnCut.addActionListener(menuController);
        btnPaste.addActionListener(menuController);

        toolBar.add(btnUndo);
        toolBar.add(btnRedo);
        toolBar.add(btnCopy);
        toolBar.add(btnCut);
        toolBar.add(btnPaste);

        this.add(toolBar, BorderLayout.NORTH);

        //================ LABEL =================

        jLabel = new JLabel("Chào mừng!", JLabel.CENTER);
        jLabel.setFont(font);

        this.add(jLabel, BorderLayout.CENTER);

        //================ POPUP MENU =================

        jPopupMenu = new JPopupMenu();

        JMenuItem itemType = new JMenuItem("Type");
        JMenuItem itemSize = new JMenuItem("Size");
        JMenuItem itemCutPopup = new JMenuItem("Cut");
        JMenuItem itemCopyPopup = new JMenuItem("Copy");

        jPopupMenu.add(itemType);
        jPopupMenu.add(itemSize);
        jPopupMenu.addSeparator();
        jPopupMenu.add(itemCutPopup);
        jPopupMenu.add(itemCopyPopup);

        //================ Mouse =================

        // use the MenuMouse instance created above
        this.addMouseListener(menuMouse);

        jLabel.addMouseListener(menuMouse);

        setVisible(true);
    }

    public void setTextJLabel(String text) {
        jLabel.setText(text);
    }

    // kiểm tra jTooBar

    public void enToolbar(){
        toolBar.setVisible(true);
        
    }
    public void disToolbar(){
        toolBar.setVisible(false);
    }
     public JCheckBoxMenuItem getjCheckBoxMenuItem() {
        return jCheckBoxMenuItem; 
    }

    public static void main(String[] args) {
        new MenuView();
    }
}