package Color.MVC.view;

import Color.MVC.controller.MyColorListener;
import Color.MVC.model.MyColorModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyColorView extends JFrame{
    private MyColorModel myColorModel;
    private JLabel jLabel;
    
    public MyColorView(){
        this.myColorModel=new MyColorModel();
        this.init();
        this.setVisible(true);

    } 
    public void init (){
        this.setTitle("MyCollor");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ActionListener ac =new MyColorListener(this);
        Font f = new Font("Arial",Font.BOLD,40); 
        jLabel =new JLabel("text");
        JPanel jPanel_text= new JPanel();
        jPanel_text.add(jLabel);
        jLabel.setFont(f);
        JPanel jPanel_Button= new JPanel();
        jPanel_Button.setLayout(new GridLayout(2,3));
        // Đổi màu chữ
        JButton jButton_Red=new JButton("RED");
        jButton_Red.setFont(f);
        jButton_Red.setForeground(Color.RED); // set màu nền
        jPanel_Button.add(jButton_Red);
        jButton_Red.addActionListener(ac);

        JButton jButton_yellow = new JButton("YELLOW");
        jButton_yellow.setFont(f);
        jButton_yellow.setForeground(Color.YELLOW);
        jPanel_Button.add(jButton_yellow);
        jButton_yellow.addActionListener(ac);
        
        JButton jButton_green=new JButton("GREEN");
        jButton_green.setFont(f);
        jButton_green.setForeground(Color.GREEN);
        jPanel_Button.add(jButton_green);
        jButton_green.addActionListener(ac);

        JButton jButton_background_Red = new JButton("RED background");
        jButton_background_Red.setFont(f);
        jButton_background_Red.setBackground(Color.RED);
        jPanel_Button.add(jButton_background_Red);
        jButton_background_Red.addActionListener(ac);

        JButton jButton_background_YELLOW= new JButton("YELLOW background");
        jButton_background_YELLOW.setFont(f);
        jButton_background_YELLOW.setBackground(Color.YELLOW);
        jPanel_Button.add(jButton_background_YELLOW);
        jButton_background_YELLOW.addActionListener(ac);

        JButton jButton_background_GREEN= new JButton("GREEN background");
        jButton_background_GREEN.setFont(f);
        jButton_background_GREEN.setBackground(Color.GREEN);
        jPanel_Button.add(jButton_background_GREEN);
        jButton_background_GREEN.addActionListener(ac);
        this.setLayout(new BorderLayout());
        this.add(jPanel_Button, BorderLayout.CENTER);
        this.add(jPanel_text,BorderLayout.NORTH);
    }
        public void ChangeTexColor(Color color){
            this.jLabel.setForeground(color);
        } 
        public void ChangeBackground(Color color){
            this.jLabel.setBackground(color);
            this.jLabel.setOpaque(true);
        }
    public static void main(String[] args) {
        new MyColorView();
    }
}