import javax.swing.JFrame;
public class Mywindow extends JFrame {
    public Mywindow(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void showA(){
        this.setVisible(true);
    }
    public void showA(String title){
        this.setTitle(title);
        this.setVisible(true);
    }
    public void showA(String title,int width,int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        Mywindow M1=new Mywindow();
        M1.showA();
        Mywindow M2=new Mywindow();
        M2.showA("window 2");
        Mywindow M3=new Mywindow();
        M3.showA("window 3",600,400);

    }
    
  
    }
