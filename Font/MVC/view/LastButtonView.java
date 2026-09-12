package Font.MVC.view;

import Font.MVC.controller.LastButtonListener;
import Font.MVC.model.LastButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LastButtonView extends JFrame {

    private JLabel jLabel;
    private LastButton lastButton;

    public LastButtonView() {
        this.lastButton = new LastButton();
        this.init();
        this.setVisible(true);
    }

    private void init() {

        this.setTitle("LastButton");
        this.setSize(300, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2, 2));

        // tạo Listtener
        ActionListener lasActionListener= new LastButtonListener(this);

        Font font = new Font("Arial", Font.BOLD, 20);

        JButton jButton1 = new JButton("1");
        JButton jButton2 = new JButton("2");
        JButton jButton3 = new JButton("3");
        JButton jButton4 = new JButton("4");

        jButton1.setFont(font);
        jButton1.addActionListener(lasActionListener);
        jButton2.setFont(font);
        jButton2.addActionListener(lasActionListener);
        jButton3.setFont(font);
        jButton3.addActionListener(lasActionListener);
        jButton4.setFont(font);
        jButton4.addActionListener(lasActionListener);

        jButton1.addActionListener(e -> changeTo_1());

        jPanel_center.add(jButton1);
        jPanel_center.add(jButton2);
        jPanel_center.add(jButton3);
        jPanel_center.add(jButton4);

        JPanel jPanel_footer = new JPanel();

        jLabel = new JLabel("========");
        jLabel.setFont(font);

        jPanel_footer.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel_center, BorderLayout.CENTER);
        this.add(jPanel_footer, BorderLayout.SOUTH);
    }

    public void changeTo_1() {
        this.lastButton.setValue1();
        jLabel.setText("Last Button: " + this.lastButton.getValue());
    }
    public void changeTo_2(){
        this.lastButton.setValue2();
        jLabel.setText("last button"+this.lastButton.getValue());
    }
    public void changeTo_3(){
        this.lastButton.setValue3();
        jLabel.setText("last button "+ this.lastButton.getValue());
    }
    public void changeTo_4(){
        this.lastButton.setValue4();
        jLabel.setText("lats button "+ this.lastButton.getValue());
    }

    public static void main(String[] args) {
        new LastButtonView();
    }
}