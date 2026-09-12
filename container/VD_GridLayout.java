
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VD_GridLayout extends JFrame{
        public VD_GridLayout(){
        this.setTitle("Ví dụ về GridLayout");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null); // căn giữa chương trình
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gd = new GridLayout();
        GridLayout gd1=new GridLayout(2,10);
        GridLayout gd2 =new GridLayout(2,10,10,30);
       // this.setLayout(gd1);
       // this.setLayout(gd);
       this.setLayout(gd2);
        for (int i=0;i<10;i++) {
            JButton jButton =new JButton(i+"");
            this.add(jButton);
            
        }
        this.setVisible(true);
        }
        public static void main(String[] args) {
            VD_GridLayout gL =new VD_GridLayout();
        }


}