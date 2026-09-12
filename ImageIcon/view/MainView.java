package ImageIcon.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {
    private JMenu menu, submenu;
    private JMenuItem i1, i2, i3, i4, i5;
    private JMenuBar mb = new JMenuBar();
    private JButton jButton;
    private JLabel jLabel;

    public MainView() {
        this.setTitle("loi");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        // SetIcon => Jframe
        URL urlIcon = MainView.class.getResource("tick.jpg"); // getResource: lấy đường dẫn
        Image icon = Toolkit.getDefaultToolkit().createImage(urlIcon);
        this.setIconImage(icon);


        // menuBar
        menu = new JMenu("menu");
        ImageIcon anhmenu = new ImageIcon(MainView.class.getResource("anh.jpg"));
        Image iconResizeImage = anhmenu.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        ImageIcon iconResize = new ImageIcon(iconResizeImage);
        menu.setIcon(iconResize);
        submenu = new JMenu("sub menu");
        i1 = new JMenuItem("Item 1");
        i2 = new JMenuItem("Item 2");
        i3 = new JMenuItem("Item 3");
        i4 = new JMenuItem("Item 4");
        i5 = new JMenuItem("Item 5");
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        // jlabel
        jLabel = new JLabel("ccc");
        Image iconResizeImage2 = anhmenu.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon iconResize2 = new ImageIcon(iconResizeImage2);
        jLabel.setIcon(iconResize2);
        // jbutton
        jButton = new JButton("test Button");
        jButton.setFont(new Font("Arial", Font.BOLD, 50));
        jButton.setSize(50, 50);

        this.setJMenuBar(mb);
        this.add(jLabel, BorderLayout.WEST);
        this.add(jButton, BorderLayout.SOUTH);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new MainView();
    }
}
