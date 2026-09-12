
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class view extends JFrame{
    public view (){
        this.setTitle("ve hinh");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        hinh HINH=new hinh();
        this.setLayout(new BorderLayout());
        this.add(HINH,BorderLayout.CENTER);
        this.setVisible(true);

    }
    public static void main (String[] args){
        new view();
    }

}