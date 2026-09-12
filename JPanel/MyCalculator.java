
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
    public MyCalculator(){
        this.setTitle("MyCalculator");
        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );

        // JPanel
        JPanel jPanel1 =new JPanel();
        jPanel1.setLayout(new BorderLayout());
        JTextField jTextField = new JTextField();
        jPanel1.add(jTextField,BorderLayout.CENTER);


        JButton jButton_0 = new JButton("0");
        JButton jButton_1 = new JButton("1");
        JButton jButton_2 = new JButton("2");
        JButton jButton_3 = new JButton("3");
        JButton jButton_4 = new JButton("4");
        JButton jButton_5 = new JButton("5");
        JButton jButton_6 = new JButton("6");
        JButton jButton_7 = new JButton("7");
        JButton jButton_8 = new JButton("8");
        JButton jButton_9 = new JButton("9");
        JButton jButton_cong = new JButton("+");
        JButton jButton_tru = new JButton("-");
        JButton jButton_nhan = new JButton("*");
        JButton jButton_chia = new JButton("/");
        JButton jButton_bang = new JButton("=");
       
       // Jpanel 
        JPanel jPanel2 =new JPanel();
        jPanel2.setLayout(new GridLayout(5,3));

        jPanel2.add(jButton_0);
        jPanel2.add(jButton_1);
        jPanel2.add(jButton_2);
        jPanel2.add(jButton_3);
        jPanel2.add(jButton_4);
        jPanel2.add(jButton_5); 
        jPanel2.add(jButton_6);
        jPanel2.add(jButton_7);
        jPanel2.add(jButton_8);
        jPanel2.add(jButton_9);
        jPanel2.add(jButton_cong);
        jPanel2.add(jButton_tru);
        jPanel2.add(jButton_nhan);
        jPanel2.add(jButton_chia);
        jPanel2.add(jButton_bang);
        this.setLayout(new BorderLayout());
        this.add(jPanel1,BorderLayout.NORTH);
        this.add(jPanel2,BorderLayout.CENTER);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        
       try {
    // Đặt Look and Feel theo hệ thống (Windows, Mac, Linux...)
    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
    // Tạo frame sau khi đã set Look and Feel
    MyCalculator M = new MyCalculator();
   
}
  catch (Exception e) {
     e.printStackTrace();
}

    }

}