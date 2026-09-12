import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class VD_FlowLayout extends JFrame{
    public VD_FlowLayout(){
        this.setTitle("Vi du ve FlowLayout");
        this.setSize(600,400);
        this.setLocationRelativeTo(null); // căn giữa chương trình 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set Layout
        FlowLayout flowLayout=new FlowLayout();
        FlowLayout flowLayout1=new FlowLayout(FlowLayout.LEFT);
        FlowLayout flowLayout2 =new FlowLayout(FlowLayout.RIGHT,20,30);

        this.setLayout(flowLayout2);
        //this.setLayout(flowLayout1);

       // this.setLayout(flowLayout); // dùng để gắn một Layout Manager cho container
        JButton jButton1=new JButton("1");
        JButton jButton2= new JButton("2");
        JButton jButton3 =new JButton("3");
        this.add(jButton1);
        this.add(jButton2);
        this.add(jButton3);
        
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        VD_FlowLayout FL=new VD_FlowLayout();

    }

}