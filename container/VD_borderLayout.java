
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class VD_borderLayout extends JFrame{
    public VD_borderLayout(){
        this.setTitle("Vi du ve FlowLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null); // căn giữa chương trình 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout bL =new BorderLayout();
        BorderLayout bl1 =new BorderLayout(30,40);

      //  this.setLayout(bL);
          this.setLayout(bl1);

        JButton jButton1=new JButton("1");
        JButton jButton2= new JButton("2");
        JButton jButton3 =new JButton("3");
        JButton jButton4 = new JButton("4");
        JButton jButton5 =new JButton("5");
        this.add(jButton1,BorderLayout.NORTH);
        this.add(jButton2,BorderLayout.SOUTH);
        this.add(jButton3,BorderLayout.WEST );
        this.add(jButton4,BorderLayout.EAST);
        this.add(jButton5,BorderLayout.CENTER);

        this.setVisible(true);
        


    }

    public static void main(String[] args) {
        VD_borderLayout borderLayout = new VD_borderLayout();
    }

}