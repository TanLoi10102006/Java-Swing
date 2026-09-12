package JTextFieldd.MVC.view;

import JTextFieldd.MVC.controller.MiniCalculatorListener;
import JTextFieldd.MVC.model.MiniCalculatorModel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiniCalculatorView extends JFrame {

    private MiniCalculatorModel miniCalculatorModel;

    // Khai báo JTextField là thuộc tính của lớp
    private JTextField jTextField_firstValue;
    private JTextField jTextField_secondValue;
    private JTextField jTextField_answer;

    public MiniCalculatorView() {
        miniCalculatorModel = new MiniCalculatorModel();
        init();
        setVisible(true);
    }

    public void init() {

        this.setTitle("Mini Calculator");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        Font f = new Font("Arial", Font.BOLD, 40);

        JLabel jLabel_firstValue = new JLabel("1st value");
        jLabel_firstValue.setFont(f);

        JLabel jLabel_secondValue = new JLabel("2nd value");
        jLabel_secondValue.setFont(f);

        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(f);

        // Khởi tạo JTextField
        jTextField_firstValue = new JTextField(50);
        jTextField_firstValue.setFont(f);

        jTextField_secondValue = new JTextField(50);
        jTextField_secondValue.setFont(f);

        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(f);
        jTextField_answer.setEditable(false);

        JPanel jPanel_nhapdulieu = new JPanel();
        jPanel_nhapdulieu.setLayout(new GridLayout(3, 2, 10, 10));

        jPanel_nhapdulieu.add(jLabel_firstValue);
        jPanel_nhapdulieu.add(jTextField_firstValue);

        jPanel_nhapdulieu.add(jLabel_secondValue);
        jPanel_nhapdulieu.add(jTextField_secondValue);

        jPanel_nhapdulieu.add(jLabel_answer);
        jPanel_nhapdulieu.add(jTextField_answer);

        this.add(jPanel_nhapdulieu, BorderLayout.NORTH);

        ActionListener ml = new MiniCalculatorListener(this);

        JButton congButton = new JButton("+");
        JButton truButton = new JButton("-");
        JButton nhanButton = new JButton("*");
        JButton chiaButton = new JButton("/");
        JButton chialayduButton = new JButton("%");
        JButton canBac2Button=new JButton("^");

        congButton.setFont(f);
        truButton.setFont(f);
        nhanButton.setFont(f);
        chiaButton.setFont(f);
        chialayduButton.setFont(f);
        canBac2Button.setFont(f);

        congButton.addActionListener(ml);
        truButton.addActionListener(ml);
        nhanButton.addActionListener(ml);
        chiaButton.addActionListener(ml);
        chialayduButton.addActionListener(ml);
        canBac2Button.addActionListener(ml);

        JPanel jPanel_xuat = new JPanel();
        jPanel_xuat.setLayout(new GridLayout(2, 3, 10, 10));

        jPanel_xuat.add(congButton);
        jPanel_xuat.add(truButton);
        jPanel_xuat.add(nhanButton);
        jPanel_xuat.add(chiaButton);
        jPanel_xuat.add(chialayduButton);
        jPanel_xuat.add(canBac2Button);

        this.add(jPanel_xuat, BorderLayout.CENTER);
    }

    // ===== Getter =====
    public void cong(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.sum();
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }
     public void tru(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.tru();
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }
     public void nhan(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.nhan();
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }
     public void chia(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.chia();;
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }
        public void chialaydu(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.chialaydu();
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }
     public void canbac2(){
        double firsValue= Double.valueOf(jTextField_firstValue.getText());
        double secondValue=Double.valueOf(jTextField_secondValue.getText());
         this.miniCalculatorModel.setfirsValue(firsValue);
         this.miniCalculatorModel.setsecondValue(secondValue);
         this.miniCalculatorModel.canbac2();
         this.jTextField_answer.setText(this.miniCalculatorModel.getanswer()+"");
    }

    


    public static void main(String[] args) {
        new MiniCalculatorView();
    }
}